/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author Fajar
 */
public class CostCalculator implements RouteCalculations {
   
    public float returnTotalCost(Route obj){
        ArrayList<Flight> myFlights = obj.getFlights();
        int totalCost = 0;
        for(int i = 0; i< myFlights.size();i++){
            totalCost+=myFlights.get(i).getCost();
        }
        
        return totalCost;
    }
}
