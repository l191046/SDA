package Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MSsql {
    //CHANGE SERVER NAME ACCORDINGLY AND SAVE
    //protected String url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;";   //Abdul Muneem
    //protected String url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;"; //Razi
    //protected String url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;"; //Sukhan
    protected String url="jdbc:sqlserver://DESKTOP-21OEGT1\\SQLEXPRESS;"+"databaseName=airline;integratedSecurity=true;"; //Behzad
    
    public ResultSet demo(){
        ResultSet result = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [Person]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            result = pst.executeQuery();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
