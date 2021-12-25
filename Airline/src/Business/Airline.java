package Business;

import GUI.JHome;
import Database.MSsql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Month;
import java.time.LocalDateTime;

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

        
        Airport a1 = new Airport(1,"A","Lahore","Pakistan");
        Airport a2 = new Airport(2,"A","Lahore","Pakistan");
        Airport a3 = new Airport(3,"A","Lahore","Pakistan");
        Airport a4 = new Airport(4,"A","Lahore","Pakistan");
        Airport a5 = new Airport(5,"A","Lahore","Pakistan");
        Airport a6 = new Airport(6,"A","Lahore","Pakistan");
        Airport a7 = new Airport(7,"A","Lahore","Pakistan");
        
        LocalDateTime date1 = LocalDateTime.of(2017,Month.FEBRUARY,3,6,30,0,0);
        Flight f1 = new Flight(1,a1,a2,date1,1000,"p", 15);
        
        LocalDateTime date2 = LocalDateTime.of(2017,Month.FEBRUARY,3,6,50,0,0);
        Flight f2 = new Flight(2,a2,a3,date2,1000,"p", 30);
        
        LocalDateTime date3 = LocalDateTime.of(2017,Month.FEBRUARY,3,7,30,0,0);
        Flight f3 = new Flight(3,a3,a4,date3,1000,"p", 40);
        
        LocalDateTime date4 = LocalDateTime.of(2017,Month.FEBRUARY,3,7,10,0,0);
        Flight f4 = new Flight(4,a2,a4,date4,1000,"p", 50);
        
        LocalDateTime date5 = LocalDateTime.of(2017,Month.FEBRUARY,3,6,20,0,0);
        Flight f5 = new Flight(5,a1,a4,date5,1000,"p", 100);
        
        LocalDateTime date6 = LocalDateTime.of(2017,Month.FEBRUARY,3,5,20,0,0);
        Flight f6 = new Flight(6,a2,a1,date6,1000,"p", 30);
        
        FlightList flightList = new FlightList();
        flightList.addFlight(f1);
        flightList.addFlight(f2);
        flightList.addFlight(f3);
        flightList.addFlight(f4);
        flightList.addFlight(f5);
        flightList.addFlight(f6);
        
        PathFinderAlgorithm calcPaths = new PathFinderAlgorithm(flightList);
        
        calcPaths.findPaths(a2, a4);
        
        database = new MSsql();
        system = JSystem.getInstance();
        
        JHome jHome = new JHome(system);
        jHome.setTitle("XYZ AIRWAYS");
        
    }
    
}
