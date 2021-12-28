package Business;

import Database.MSsql;
import java.sql.ResultSet;

public class AdminSession {
    private Admin user;
    private String username;
    private String password;
    private MSsql database;
    
    private static final AdminSession instance = new AdminSession();
    private AdminSession(){
        database = MSsql.getInstance();
    }
    public static AdminSession getInstance(){
        return instance;
    }
    
    public Admin getAdmin(){
        return user;
    }
    
    public boolean createSession(String username, String password){
        try (ResultSet result = database.checkAdmin(username, password);){
            if (result == null || !result.next())
                return false;
            
            user = new Admin();
            user.setFirstname(result.getString("FirstName"));
            user.setLastname(result.getString("LastName"));
            user.setCNIC(result.getString("CNIC"));
            user.setAddress(result.getString("Address"));
            user.setEmploymentDate(result.getDate("EmploymentDate").toLocalDate());
            user.setSalary(result.getFloat("Salary"));
            this.username = username;
            this.password = password;
            
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public void closeSession(){
        username = null;
        password = null;
        user = null;
    }
    
}
