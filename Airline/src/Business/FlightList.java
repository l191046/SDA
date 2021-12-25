/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import java.util.ArrayList;

public class FlightList {
    public ArrayList<Flight> Flights;
    
    public FlightList(){
        Flights = new ArrayList<Flight>();
    }
    
    public void addFlight(Flight obj){
        Flights.add(obj);
    }
    
}
