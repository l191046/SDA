/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Route{
    
    private ArrayList<Flight> Flights;
    
    public Route(ArrayList<Flight> obj){
        Flights = new ArrayList<Flight>();
        for(int i = 0; i < obj.size();i++){
            this.Flights.add(obj.get(i));
        }
    }
    
    public Route(){
        Flights = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlights() {
        return Flights;
    }

    public void setFlights(ArrayList<Flight> Flights) {
        this.Flights = Flights;
    }
    
    public void addFlight(Flight obj){
        Flights.add(obj);
    }
    
    public int getRouteCost(){
        int cost = 0;
        for(Flight flight: Flights){
            cost += flight.getCost();
        }
        return cost;
    }
    
    public Airport getSource(){
        return Flights.get(0).getSource();
    }
    public Airport getDestination(){
        return Flights.get(Flights.size()-1).getDestination();
    }
}
