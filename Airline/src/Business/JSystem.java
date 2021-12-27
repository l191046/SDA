package Business;

import javax.swing.table.DefaultTableModel;
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
import java.time.Month;

public class JSystem {
    private static final JSystem instance = new JSystem();
    
    private MSsql database;
    private Admin admin_session;
    private FlightList flight_list;
    private ArrayList<Airport> airportList;
    private PathFinderAlgorithm PathFinder;
    
    
    private Airport retAirportFromList(String airportCode){
        
        for(int i = 0; i < this.airportList.size();i++){
            if(airportCode.equals(this.airportList.get(i).getCode())){
                return this.airportList.get(i);
            }
        }
        
        return null;
        
    }
    
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
    
    private JSystem(){
        airportList = new ArrayList<Airport>();
        database = MSsql.getInstance();
        flight_list = new FlightList();
        this.loadAirportList();
        this.loadFlightList();
        
        PathFinder = new PathFinderAlgorithm(this.flight_list);
        System.out.print(this.flight_list.getFlights().size());
        
        for(int i = 0; i < this.airportList.size();i++){
            System.out.println(this.airportList.get(i).getCode());
        }

    }
    
    public static JSystem getInstance(){
        return instance;
    }
    
    public void findPaths(DefaultTableModel table, String Source, String Destination){
        Airport Src = this.retAirportFromList(Source);
        Airport Dest = this.retAirportFromList(Destination);
        
        ViableRoutes myRoutes = PathFinder.findPaths(Src, Dest);
        
    
    }
    
    //CUSTOMER
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
    
    
    //ADMIN
    //admin session/profile funcitons
    public boolean adminSignIn(String username, String password){
        try (ResultSet result = database.checkAdmin(username, password);) {
            if (result == null || !result.next())
            return false;
        
            if (admin_session == null)
                admin_session = new Admin();

            //SET ADMIN SESSION VALUES
            admin_session.setFirstname(result.getString("FirstName"));
            admin_session.setLastname(result.getString("LastName"));
            admin_session.setCNIC(result.getString("CNIC"));
            admin_session.setAddress(result.getString("Address"));
            admin_session.setEmploymentDate(result.getDate("EmploymentDate").toLocalDate());
            admin_session.setSalary(result.getFloat("Salary"));
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public void closeSession(){
        admin_session = null;
    }
    public void editAdmin(String fname, String lname, String address){
        database.editAdmin(admin_session.getCNIC(), fname, lname, address);
    }
    //retrieve strings for home page
    public ArrayList<String> getAdmin(){
        ArrayList<String> fields = new ArrayList<String>();
        fields.add(admin_session.getFirstname());
        fields.add(admin_session.getLastname());
        fields.add(admin_session.getCNIC());
        fields.add(admin_session.getAddress());
        fields.add(admin_session.getEmploymentDate().toString());
        fields.add(Float.toString(admin_session.getSalary()));
        return fields;
    }
    
    //retrieve table of flights
    public void getTableFlights(DefaultTableModel table_model){
        try (ResultSet result = database.getTableFlights();) {
            if (result == null)
            return;
            
            //set table to result set
            while (result.next()){
                table_model.addRow(
                        new Object[] {
                            result.getString("FlightId"),
                            result.getString("From"),
                            result.getString("To"),
                            result.getDate("Departure"),
                            result.getTime("Duration"),
                            result.getString("Status"),
                            result.getFloat("Ticket")
                        }
                );
            }
                
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
