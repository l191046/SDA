package Business;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Database.MSsql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

public class JSystem {
    private static final JSystem instance = new JSystem();
    
    private MSsql database;
    private Admin admin_session;
    private FlightList flight_list;
    
    private JSystem(){
        database = MSsql.getInstance();
        flight_list = new FlightList();
    }
    public static JSystem getInstance(){
        return instance;
    }
    
    public void test(){
        System.out.println("Test successful");
    }
    
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
    
    //Set admin session
    public boolean adminSignIn(String username, String password){
        try (ResultSet result = database.checkAdmin(username, password);) {
            if (result == null)
            return false;
        
            if (admin_session == null)
                admin_session = new Admin();

            //SET ADMIN SESSION VALUES
            result.next();
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
    
}
