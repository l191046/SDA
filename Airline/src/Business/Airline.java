package Business;

import GUI.JHome;
import Database.MSsql;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Airline {
    
    private static MSsql database;
    private static JSystem system;
    public static void printDemo(){
        try(ResultSet result = database.demo()){
            while(result.next()){
                String row = new String();
                for(int i=1; i<=4; i++){
                    row += result.getString(i) + ' ';
                }
                System.out.println(row);
            }
        }
        catch(SQLException e){
             e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        database = new MSsql();
        system = JSystem.getInstance();
        
        JHome jHome = new JHome(system);
        jHome.setTitle("XYZ AIRWAYS");
        
    }
    
}
