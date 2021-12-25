package Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MSsql {
    //CHANGE SERVER NAME ACCORDINGLY AND SAVE
    protected String url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=SDA;integratedSecurity=true;";   //Abdul Muneem
    //protected String url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;"; //Razi
    //protected String url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;"; //Sukhan
    //protected String url="jdbc:sqlserver://RAMHP\\MSSQLSERVER;"+"databaseName=Airline;integratedSecurity=true;"; //Behzad
    
    private static final MSsql instance = new MSsql();
    
    private MSsql(){
        
    }
    public static MSsql getInstance(){
        return instance;
    }
    
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
}
