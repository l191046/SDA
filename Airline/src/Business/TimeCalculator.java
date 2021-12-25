/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

public class TimeCalculator implements RouteCalculations {
    
    public float returnTotalTime(Route obj){
        ArrayList<Flight> myFlights = obj.getFlights();
        int totalTime = 0;
        for(int i = 0; i< myFlights.size();i++){
            totalTime+=myFlights.get(i).getDuration();
        }
        return totalTime;
    }
    
}
