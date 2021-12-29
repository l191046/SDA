package Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Time;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MSsql {
    protected String url;
    private static final MSsql instance = new MSsql();
    private MSsql(){
        try {
            //AUTO-ASSIGN SQL CONNECTION STRING
            url = "jdbc:sqlserver://";
            url += InetAddress.getLocalHost().getHostName().toUpperCase();
            url += "\\MSSQLSERVER;databaseName=SDA;integratedSecurity=true;";
            
            //CHOOSE MANUALLY incase it (inevitably) fails
            //url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=SDA;integratedSecurity=true;";   //Abdul Muneem
            //url="jdbc:sqlserver://MOHAMMAD\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;"; //Razi
            //url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;"; //Sukhan
            url="jdbc:sqlserver://DESKTOP-21OEGT1\\SQLEXPRESS;"+"databaseName=SDA;integratedSecurity=true;"; //Behzad
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MSsql getInstance(){
        return instance;
    }
    
    
    //retrieve table of flights
    public ResultSet getTableFlights(){
        ResultSet result = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [get_flights]}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            result=Cmt.executeQuery();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public ResultSet getAirport(String airportCode){
        ResultSet result = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [get_airport](?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString(1, airportCode);
            result=Cmt.executeQuery();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public ResultSet getTableAirports(){
        ResultSet result = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [get_airport_list]}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            result=Cmt.executeQuery();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    
    //===========ADMIN===================
    //PROFILE MANAGEMENT
    public ResultSet checkAdmin(String username, String password){
        ResultSet result = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [admin_signin](?,?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString(1, username);
            Cmt.setString(2, password);
            result=Cmt.executeQuery();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public boolean editAdmin(String CNIC, String fName, String lName, String address){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [edit_admin](?,?,?,?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString(1, CNIC);
            Cmt.setString(2, fName);
            Cmt.setString(3, lName);
            Cmt.setString(4, address);
            Cmt.execute();
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //NOFLY MANAGEMENT
    public ResultSet getTableNoFly(){
        ResultSet result = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [get_nofly]}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            result=Cmt.executeQuery();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public boolean removeFromNoFly(String CNIC){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [Remove_nofly](?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("cnic", CNIC);
            Cmt.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean addToNoFly(String CNIC, String fname, String lname, String contact, String address){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [add_customer](?,?,?,?,?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("cnic", CNIC);
            Cmt.setString("contact", contact);
            Cmt.setString("fname", fname);
            Cmt.setString("lname", lname);
            Cmt.setString("address", address);
            Cmt.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean addToNoFly(String CNIC){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [Add_nofly](?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("cnic", CNIC);
            Cmt.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean addCustomer(String CNIC, String fname, String lname, String contact, String address){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [add_customer_0](?,?,?,?,?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("cnic", CNIC);
            Cmt.setString("contact", contact);
            Cmt.setString("fname", fname);
            Cmt.setString("lname", lname);
            Cmt.setString("address", address);
            Cmt.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

        
    public boolean searchCustomer(String CNIC){
        boolean found = false;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [search_customer](?,?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("cnic", CNIC);
            Cmt.registerOutParameter("found", java.sql.Types.INTEGER);
            Cmt.execute();
            found = (Cmt.getInt("found") == 1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return found;
    }
    //FLIGHT MANAGEMENT
    public boolean removeFlight(String flightID){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [delete_flight](?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("flightid", flightID);
            Cmt.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateStatus(String flightID, String status){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [update_status](?,?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("flightid", flightID);
            Cmt.setString("status", status);
            Cmt.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean addFlight(String flightID, String source, String dest, LocalTime duration, LocalDateTime departure, String status, float cost){
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //CALLING STORED PROCEDURE
            String SQL = "{call [add_flight](?,?,?,?,?,?,?,?)}";
            //PROCEDURE PARAMETERS
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("flightID", flightID);
            Cmt.setString("source", source);
            Cmt.setString("destination", dest);
            Cmt.setTime("duration", Time.valueOf(duration));
            Cmt.setInt("cost", (int)cost);
            Cmt.setString("status", status);
            Cmt.setDate("dDate", Date.valueOf(departure.toLocalDate()));
            Cmt.setTime("dTime", Time.valueOf(departure.toLocalTime()));
            Cmt.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

  
}
