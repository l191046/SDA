package Business;

import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import java.awt.Color;
import Database.MSsql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;
import java.sql.Time;
import java.sql.Date;
import java.time.temporal.ChronoUnit;
import java.time.Month;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class JSystem {
    
    private MSsql database;
    private AdminSession admin_session;
    private FlightList flight_list;
    private NoFlyList nofly_list;
    private CustomerList customer_list;
    private TicketList ticket_list;
    private ArrayList<Airport> airportList;
    private PathFinderAlgorithm PathFinder;
    private ViableRoutes myRoutes;
    public Route route_session;
    public Ticket ticket_session;
    
    
    public boolean checkSeat(String flightID, String seatID){
        Flight flight = flight_list.searchFlight(flightID);
        return flight.getSeatList().searchSeat(seatID).isTaken();
    }
    public void setSeatPanels(ArrayList<JPanel> seats){
        for (JPanel panel : seats){
            for (Seat s : route_session.getFlights().get(0).getSeatList().getSeats()){
                if (panel.getName().equals(s.getSeatID())){
                    if (s.isTaken()){
                        panel.setBackground(Color.black);
                        panel.setFocusable(false);
                    }
                }
            }
        }
    }
    
    public boolean autoSeatSelect(){
        for (Flight flight : route_session.getFlights()){
            Seat seat = flight.getSeatList().getFirstAvailable();
            if (seat == null)
                return false;
            SeatBooking seatBooking = new SeatBooking();
            seatBooking.setFlight(flight);
            seatBooking.setSeat(seat);
            ticket_session.getBookings().add(seatBooking);
        }
        return true;
    }
    public void addTicket(){
        ticket_session.printToConsole();
        ticket_list.addTicket(ticket_session);
        ticket_session = null;
    }
    public void getTableBooking(DefaultTableModel table_model){
        table_model.setRowCount(0);
        for (SeatBooking bookedFlight : ticket_session.getBookings()){
            
            table_model.addRow( 
                    new Object[]{
                        bookedFlight.getFlight().getFlightID(),
                        bookedFlight.getFlight().getSource().getCode(),
                        bookedFlight.getFlight().getDestination().getCode(),
                        bookedFlight.getFlight().getTime(),
                        bookedFlight.getFlight().getDuration(),
                        bookedFlight.getSeat().getSeatID(),
                        bookedFlight.getFlight().getCost()
                    }
            );
        }
    }
    public Flight getBookingFlight(int index){
        return route_session.getFlights().get(index);
    }
    public void addBooking(String flightID, String seatID){
        Flight flight = flight_list.searchFlight(flightID);
        //Seat seat = flight.getSeats().searchSeat(seatID);
        Seat seat = new Seat();
        seat.setSeatID(seatID);
        seat.setTaken(true);
        SeatBooking seatBooking = new SeatBooking();
        seatBooking.setFlight(flight);
        seatBooking.setSeat(seat);
        ticket_session.getBookings().add(seatBooking);
    }
    public void setRouteSession(int i){
        route_session = myRoutes.getRoutes().get(i);
    }
    public void setTicketCustomer(String fname, String lname, String cnic, String address, String contact){
        ticket_session = new Ticket();
        Customer customer = customer_list.searchCustomer(cnic);
        if (customer == null){
            customer = new Customer();
            customer.setFirstname(fname);
            customer.setLastname(lname);
            customer.setCNIC(cnic);
            customer.setContact(contact);
            customer.setAddress(address);
            customer_list.addCustomer(customer);
        }
        ticket_session.setCustomer(customer);
    }
    
    //=========THIS==============
    private static final JSystem instance = new JSystem();
    private JSystem(){
        database = MSsql.getInstance();
        admin_session = AdminSession.getInstance();
        
        airportList = new ArrayList<Airport>();
        flight_list = new FlightList();
        customer_list = new CustomerList();
        nofly_list = new NoFlyList(customer_list);
        ticket_list = new TicketList();
        this.loadAirportList();
        this.loadFlightList();
        this.loadFlightSeats();
        this.loadCustomerList();
        this.loadNoFlyList();
        this.loadTicketList();
        
        PathFinder = new PathFinderAlgorithm(this.flight_list);
        System.out.print(this.flight_list.getFlights().size());
        
        for(int i = 0; i < this.airportList.size();i++){
            System.out.println(this.airportList.get(i).getCode());
        }
    }
    public static JSystem getInstance(){
        return instance;
    }
    
    
    //=========LOAD FROM DATABASE=========
    private void loadFlightList(){
        
        try(ResultSet flightTable = database.getTableFlights();){
            if(flightTable == null)
                return;
            
            while(flightTable.next()){
                
                Flight thisFlight = new Flight();
                
                thisFlight.setFlightID(flightTable.getString("FlightId"));
                
                Airport Src = this.retAirportFromList(flightTable.getString("From"));
                Airport Dest = this.retAirportFromList(flightTable.getString("To"));
                if (Src == null){
                    System.out.println("not found -> " + flightTable.getString("From"));
                }
                if (Dest == null){
                    System.out.println("not found -> " + flightTable.getString("To"));
                }
             
                Time Duration = flightTable.getTime("Duration");
                LocalTime duration = Duration.toLocalTime();
                thisFlight.setDuration(duration);
                
                thisFlight.setSource(Src);
                thisFlight.setDestination(Dest);
                float cost = (float) flightTable.getFloat("Cost");
                thisFlight.setCost(cost);
                thisFlight.setStatus(flightTable.getString("Status"));
                
                Time time =  flightTable.getTime("Time");
                Date date = flightTable.getDate("Time");
                LocalTime lt = time.toLocalTime();
                LocalDate ld = date.toLocalDate();
                LocalDateTime date1 = LocalDateTime.of(ld.getYear(),ld.getMonth(),ld.getDayOfMonth(),lt.getHour(),lt.getMinute(),0,0);
                thisFlight.setTime(date1);
                
                flight_list.addFlight(thisFlight);
        
            }
            
            
        }
        catch(SQLException e){
            
            e.printStackTrace();
        
        }
        
    
    }
    private void loadAirportList(){

        try(ResultSet srcTable = database.getTableAirports();){

            while(srcTable.next()){
                Airport thisAirport = new Airport();
                thisAirport.setCity(srcTable.getString("City"));
                thisAirport.setCode(srcTable.getString("Code"));
                thisAirport.setName(srcTable.getString("Name"));
                thisAirport.setCountry(srcTable.getString("Country"));
                this.airportList.add(thisAirport);
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }
    private void loadCustomerList(){
        try (ResultSet result = database.getTableCustomers();){
            if (result == null)
                return;
            while (result.next()){
                Customer customer = new Customer();
                customer.setCNIC(result.getString("CNIC"));
                customer.setFirstname(result.getString("FirstName"));
                customer.setLastname(result.getString("LastName"));
                customer.setAddress(result.getString("Address"));
                customer.setContact(result.getString("Contact"));
                int nofly = result.getInt("No_Fly");
                if (nofly == 0)
                    customer.setNoFly(false);
                else
                    customer.setNoFly(true);
                customer_list.getCustomers().add(customer);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private void loadNoFlyList(){
        nofly_list.loadNoFlyList();
    }
    private void loadFlightSeats(){
        for (Flight flight : flight_list.getFlights()){
            try (ResultSet seats = database.getTableSeats(flight.getFlightID())){
                while (seats.next()){
                    Seat s = new Seat();
                    s.setSeatID(seats.getString("SeatId"));
                    s.setTaken(seats.getString("Status") == "Taken");
                    flight.getSeatList().add(s);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private void loadTicketList(){
        try (ResultSet result = database.getTableBookings();){
            if (result == null)
                return;
            
            Ticket ticket = null;
            while (result.next()){
                if (ticket == null || !ticket.getTicketID().equals(result.getString("TicketId"))){
                    if (ticket != null)
                        ticket_list.getHistory().add(ticket);
                    ticket = new Ticket();
                    ticket.setTicketID(result.getString("TicketId"));
                    ticket.setCustomer(customer_list.searchCustomer(result.getString("CNIC")));
                }
                else {
                }
                SeatBooking booking = new SeatBooking();
                booking.setFlight(flight_list.searchFlight(result.getString("FlightId")));
                booking.setSeat(booking.getFlight().getSeatList().searchSeat(result.getString("SeatId")));
                ticket.getBookings().add(booking);
            }
            if (ticket!=null)
                ticket_list.getHistory().add(ticket);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    //========STORE TO DATABASE===========
    private void storeFlightList(){
        
    }
    private void storeAirportList(){
        
    }
    private void storeCustomerList(){
        
    }
    
    //=========PATH CALCULATION=========
    private Airport returnAirport(String airportCode){
        Airport Src = new Airport();
        
         try(ResultSet srcTable = database.getAirport(airportCode);){
                    
            while(srcTable.next()){
                Src.setCode(srcTable.getString("Code"));
                Src.setCity(srcTable.getString("City"));
                Src.setName(srcTable.getString("Name"));
                Src.setCountry(srcTable.getString("Country"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
         
         return Src;
    
    }
    private Airport retAirportFromList(String airportCode){
        
        for(int i = 0; i < this.airportList.size();i++){
            if(airportCode.equals(this.airportList.get(i).getCode())){
                return this.airportList.get(i);
            }
        }
        
        return null;
        
    }   
    public boolean findPaths(String Source, String Destination, LocalDate date){
        Airport Src = this.retAirportFromList(Source);
        Airport Dest = this.retAirportFromList(Destination);
        myRoutes = PathFinder.findPaths(Src, Dest, date);
        if (myRoutes.isEmpty())
            return false;
        return true;
    }
    public void getPaths(DefaultTableModel table_model){
        table_model.setRowCount(0);
        if (myRoutes == null)
            return;
        ArrayList<Route> routes = myRoutes.getRoutes();
        String connections;
        int i = 0;
        for(Route route : routes ){
            connections = "";
            for(int k = 0; k < route.getFlights().size(); k++){
                Flight flight = route.getFlights().get(k);
                connections += flight.getFlightID();
                
                if(k != route.getFlights().size()-1)
                connections += ", ";
            }

            table_model.addRow(
                    new Object[] {
                        i,
                        route.getSource().getCode(),
                        route.getDestination().getCode(),
                        route.getFlights().get(0).getTime().toLocalDate().toString(),
                        route.getFlights().get(0).getTime().toLocalTime().toString(),
                        connections,
                        route.getRouteCost(),
                    }
            );
            i++;
        } 
    }
    public void sortPathTime(){
        SorterByTime sorter = new SorterByTime();
        sorter.sort(myRoutes);
    }
    public void sortPathCost(){
        SorterByCost sorter = new SorterByCost();
        sorter.sort(myRoutes);
    }
    
    //==========CUSTOMER==========
    //Populate table_model with results of search in flightlist
    public boolean checkFlightStatus(String flight_id, DefaultTableModel table_model){
        Flight flight = flight_list.searchFlight(flight_id);
        if (flight == null)
            return false;
        
        long d = flight.getDuration().getHour()*60 + flight.getDuration().getMinute();
        
        table_model.addRow(
                new Object[] {
                    flight.getFlightID(), 
                    flight.getSource().getCode(), 
                    flight.getDestination().getCode(),
                    flight.getTime().toLocalDate(),
                    flight.getTime().toLocalTime(),
                    flight.getTime().toLocalTime().plus(d, ChronoUnit.MINUTES),
                    flight.getStatus()
                }
        );
        return true;
    }
    public boolean getHistory(DefaultTableModel table_model, String cnic){
        for (Ticket ticket : ticket_list.getHistory()){
            if (ticket.getCustomer().getCNIC().equals(cnic)){
                    table_model.addRow(
                        new Object[]{
                            ticket.getTicketID(),
                            ticket.getSource(),
                            ticket.getDestination(),
                            ticket.getDeparture(),
                            ticket.getDepartureTime()
                        }
                    );
            }
        }
        return false;
    }
    
    //==========ADMIN=============
    //ADMIN SESSION/PROFILE
    public boolean adminSignIn(String username, String password){
        return admin_session.createSession(username, password);
    }
    public void closeSession(){
        admin_session.closeSession();
    }
    public void editAdmin(String cnic, String fname, String lname, String address){
        admin_session.getAdmin().updateRecord(cnic, fname, lname, address);
    }
    public void getAdminProfile(ArrayList<String> profile){
        profile.add(admin_session.getAdmin().getFirstname());
        profile.add(admin_session.getAdmin().getLastname());
        profile.add(admin_session.getAdmin().getCNIC());
        profile.add(admin_session.getAdmin().getAddress());
        profile.add(admin_session.getAdmin().getEmploymentDate().toString());
        profile.add(Float.toString(admin_session.getAdmin().getSalary()));
    }
    
    //FLIGHT MANAGEMENT
    public void getTableFlights(DefaultTableModel table_model){
        if (flight_list == null)
            return;
        for (Flight flight : flight_list.Flights){
            table_model.addRow( 
                    new Object[]{
                        flight.getFlightID(),
                        flight.getSource().getCode(),
                        flight.getDestination().getCode(),
                        flight.getTime(),
                        flight.getDuration(),
                        flight.getStatus(),
                        flight.getCost()
                    }
            );
        }
    }
    public boolean removeFlight(String flightID){
        return flight_list.removeFlight(flightID);
    }
    public boolean changeStatus(String flightID, String status){
        return flight_list.changeStatus(flightID, status);
    }
    public void getComboAirports(DefaultComboBoxModel combo_model){
        if (airportList == null || airportList.size() == 0)
            return;
        
        for (Airport airport : airportList){
            combo_model.addElement(airport.getCode());
        }
    }
    public boolean addFlight(String flightID, String source, String dest, LocalTime duration, LocalDateTime departure, float cost){        
        Flight flight = new Flight();
        flight.setFlightID(flightID);
        flight.setSource(retAirportFromList(source));
        flight.setDestination(retAirportFromList(dest));
        flight.setDuration(duration);
        flight.setTime(departure);
        flight.setCost(cost);
        flight.setStatus("On time");
        return flight_list.addNewFlight(flight);
    }
    public boolean getFlightCustomers(DefaultTableModel table_model, String flightID){
        if (flightID == null)
            return false;
        
        for (Ticket ticket : ticket_list.getHistory()){
            for (SeatBooking booking : ticket.getBookings()){
                if (booking.getFlight().getFlightID().equals(flightID)){
                    table_model.addRow(
                        new Object[] {
                            ticket.getCustomer().getCNIC(),
                            ticket.getCustomer().getFirstname(),
                            ticket.getCustomer().getLastname(),
                            ticket.getCustomer().getContact(),
                            booking.getSeat().getSeatID()
                        }
                    );
                }
            }
        }
        return true;
    }
    
    //NOFLY MANAGEMENT
    public void getTableNoFly(DefaultTableModel table_model){
        for (Customer customer : nofly_list.getCustomers()){
            table_model.addRow(
                    new Object[]{
                        customer.getFirstname(),
                        customer.getLastname(),
                        customer.getCNIC(),
                        customer.getAddress(),
                        customer.getContact()
                    }
            );
        }
    }
    public void removeFromNoFly(String cnic){
        nofly_list.removeCustomer(cnic);
    }
    public void addToNoFly(String cnic, String fname, String lname, String contact, String address){
        Customer customer = new Customer();
        customer.setCNIC(cnic);
        customer.setFirstname(fname);
        customer.setLastname(lname);
        customer.setAddress(address);
        customer.setContact(contact);
        customer.setNoFly(true);
        nofly_list.addCustomer(customer);
    }
    
    // Customer Management
    public boolean addCustomer(Customer customer){
        return customer_list.addCustomer(customer);
        /*
        //---------UPDATE DATABASE----------
        if (database.searchCustomer(customer.getCNIC())){
            return false;
        }
        else{
            database.addCustomer(
                    customer.getCNIC(),
                    customer.getFirstname(),
                    customer.getLastname(),
                    customer.getContact(),
                    customer.getAddress()
            );
        }
        //----------------------------------
        */
    }
    
    public void cancelTicket(String ticketID){
        
        for(int i = 0; i < this.ticket_list.getHistory().size();i++){
            if(this.ticket_list.getHistory().get(i).getTicketID().equals(ticketID)){
                this.ticket_list.getHistory().remove(i);
            }
        }
        database.cancelTicket(ticketID);
    
    }
    
    //Seat Selection
    
    public void addSeatToFlight(String flightId, String seatLocation) {
        database.addSeatToFlight(flightId,seatLocation);
    }
    
}
