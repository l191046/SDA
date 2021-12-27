package Business;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class PathFinderAlgorithm {
    
    public Map<Airport, ArrayList<Flight>> adjacencyList;
    
    private int timeToInt(LocalTime obj){
        return obj.getHour()*60 + obj.getMinute();
    }

    public PathFinderAlgorithm(FlightList obj) {
        //creating adjacencylist
        this.adjacencyList = new HashMap<Airport, ArrayList<Flight>>();
        
        for(int i = 0; i < obj.Flights.size();i++){
            if(!adjacencyList.containsKey(obj.Flights.get(i).getSource())){
                this.adjacencyList.put(obj.Flights.get(i).getSource(), new ArrayList<Flight>());
                this.adjacencyList.get(obj.Flights.get(i).getSource()).add(obj.Flights.get(i));
            }
            else{
                this.adjacencyList.get(obj.Flights.get(i).getSource()).add(obj.Flights.get(i));
            }
        }
        
    }
    
   private void DFS(Airport Source, Airport Destination, HashSet<Airport> visited, ArrayList<Flight> currentRoute, ViableRoutes viableRoutes, LocalDateTime currentTime){
       LocalDateTime currentTimeCopy = currentTime;
       
       if(Source==Destination){
           
           Route thisRoute = new Route(currentRoute);
           viableRoutes.addRoute(thisRoute);
           
           return;
       }
       
       visited.add(Source);
       
       for(int i = 0; i < this.adjacencyList.get(Source).size();i++){
           if(!visited.contains(this.adjacencyList.get(Source).get(i).getDestination())){
               currentRoute.add(this.adjacencyList.get(Source).get(i));
               //manage time
               if(currentTime==null){
                   currentTime = this.adjacencyList.get(Source).get(i).getTime();
                   currentTime = currentTime.plusMinutes(timeToInt(this.adjacencyList.get(Source).get(i).getDuration())); //update time since we are taking this flight
                   DFS(this.adjacencyList.get(Source).get(i).getDestination(),Destination, visited, currentRoute, viableRoutes, currentTime);
                   currentTime = currentTimeCopy;   //restore to local time
               }
               else{
                   currentTimeCopy = currentTime.plusMinutes(0);
                   LocalDateTime nextFlightTime = this.adjacencyList.get(Source).get(i).getTime();
                   LocalDateTime maxWaitTime = currentTime.plusHours(10);
                   if(nextFlightTime.isAfter(currentTime) && nextFlightTime.isBefore(maxWaitTime)){
                       currentTime = this.adjacencyList.get(Source).get(i).getTime();
                       currentTime = currentTime.plusMinutes(timeToInt(this.adjacencyList.get(Source).get(i).getDuration())); //update time since we are taking this flight
                       DFS(this.adjacencyList.get(Source).get(i).getDestination(),Destination, visited, currentRoute, viableRoutes, currentTime);
                       currentTime = currentTimeCopy;// restore to local time
                   }
                   
               }
               int index = currentRoute.size()-1;
               currentRoute.remove(index);
           }
       }
       
   }
    
    public ViableRoutes findPaths(Airport Source, Airport Destination){
        LocalDateTime currentTime = null;
        ViableRoutes viableRoutes = new ViableRoutes();
        HashSet<Airport> visited = new HashSet<Airport>();
        ArrayList<Flight> currentRoute = new ArrayList<Flight>();
        DFS(Source, Destination, visited, currentRoute, viableRoutes, currentTime);
                
        SorterByCost sorterByCost = new SorterByCost();
        sorterByCost.sort(viableRoutes);
        viableRoutes.printRoutes();
        
        SorterByTime sorterByTime = new SorterByTime();
        sorterByTime.sort(viableRoutes);
        viableRoutes.printRoutes();
        
        return viableRoutes;
    }
    
        
}
