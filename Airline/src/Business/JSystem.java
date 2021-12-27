package Business;

import javax.swing.table.DefaultTableModel;
import Database.MSsql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

public class JSystem {
    private static final JSystem instance = new JSystem();
    
    private MSsql database;
    private Admin admin_session;
    private FlightList flight_list;
    private NoFlyList nofly_list;
    
    private JSystem(){
        database = MSsql.getInstance();
        flight_list = new FlightList();
        nofly_list = new NoFlyList();
        nofly_list.loadNoFlyList();
    }
    public static JSystem getInstance(){
        return instance;
    }
    
    //CUSTOMER
    //Populate table_model with results of search in flightlist
    public boolean checkFlightStatus(int flight_id, DefaultTableModel table_model){
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
        admin_session.setFirstname(fname);
        admin_session.setLastname(lname);
        admin_session.setAddress(address);
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
    
    //FLIGHT MANAGEMENT
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
    //remove flight
    public boolean removeFlight(String flightID){
        //awaiting implementation
        return false;
    }
    
    //NOFLY LIST MANAGEMENT
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
        database.removeFromNoFly(cnic);
        nofly_list.loadNoFlyList();
    }
    public void addToNoFly(String cnic, String fname, String lname, String contact, String address){
        boolean exists = database.searchCustomer(cnic);
        if (exists){
            database.addToNoFly(cnic);
        }
        else {
            database.addToNoFly(cnic, fname, lname, contact, address);
        }
        nofly_list.loadNoFlyList();
    }
}
