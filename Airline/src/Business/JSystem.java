package Business;

import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import Database.MSsql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.sql.Time;
import java.sql.Date;
import java.time.Month;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JSystem {
    
    private MSsql database;
    private AdminSession admin_session;
    private FlightList flight_list;
    private NoFlyList nofly_list;
    private ArrayList<Airport> airportList;
    private PathFinderAlgorithm PathFinder;
    
    
    //=========THIS==============
    private static final JSystem instance = new JSystem();
    private JSystem(){
        database = MSsql.getInstance();
        admin_session = AdminSession.getInstance();
        
        airportList = new ArrayList<Airport>();
        nofly_list = new NoFlyList();
        flight_list = new FlightList();
        this.loadAirportList();
        this.loadFlightList();
        this.loadNoFlyList();
        
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
    private void loadNoFlyList(){
        try (ResultSet result = database.getTableNoFly();){
            if (result == null)
                return;
            while(result.next()){
                Customer customer = new Customer();
                customer.setFirstname(result.getString("FirstName"));
                customer.setLastname(result.getString("LastName"));
                customer.setCNIC(result.getString("CNIC"));
                customer.setAddress(result.getString("Address"));
                customer.setContact(result.getString("Contact"));
                nofly_list.addCustomer(customer);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    //========STORE TO DATABASE===========
    
    
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
    public void findPaths(DefaultTableModel table_model, String Source, String Destination){
        Airport Src = this.retAirportFromList(Source);
        Airport Dest = this.retAirportFromList(Destination);
        
        LocalDate date = LocalDate.now();
        ViableRoutes myRoutes = PathFinder.findPaths(Src, Dest, date );
        
        ArrayList<Route> routes = myRoutes.getRoutes();
        String connections;
        int i = 0;
        for(Route route : routes ){
            connections = "";
            for(Flight flight: route.getFlights()){
                connections += flight.getDestination().getCode();
                connections += "->";
            }
            table_model.addRow(
                    new Object[] {
                        i,
                        Src.getCode(),
                        Dest.getCode(),
                        route.getFlights().get(0).getTime().toLocalDate().toString(),
                        route.getFlights().get(0).getTime().toLocalTime().toString(),
                        connections,
                        route.getRouteCost(),
                        route
                    }
            );
        }
        
    
    }
    
    //==========CUSTOMER==========
    //Populate table_model with results of search in flightlist
    public boolean checkFlightStatus(String flight_id, DefaultTableModel table_model){
        Flight flight = flight_list.searchFlight(flight_id);
        if (flight == null)
            return false;
        
        table_model.addRow(
                new Object[] {
                    flight.getFlightID(), 
                    flight.getSource().getCode(), 
                    flight.getDestination().getCode(),
                    flight.getTime(),
                    flight.getTime(),
                    flight.getStatus()
                }
        );
        return true;
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
        nofly_list.addCustomer(customer);
    }
    
    // Customer Management
    public boolean addCustomer(Customer customer){

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
        return true;
    }
}
