package Business;

import GUI.JHome;
import Database.MSsql;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Airline {
    
    private static MSsql database;
    private static JSystem system;
    
    public static void main(String[] args) {
        system = JSystem.getInstance();
        
        JHome jHome = new JHome(system);
        jHome.setTitle("XYZ AIRWAYS");
        
    }
    
}
