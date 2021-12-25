package Business;

import java.util.ArrayList;

public class FlightList {
    private ArrayList<Flight> flights;
    
    public FlightList(){
        flights = new ArrayList<Flight>();
    }
    
    public boolean addFlight(Flight new_flight){
        if (searchFlight(new_flight.getFlightID()) != null) //if flight already exists
            return false;
        flights.add(new_flight);
        return true;
    }
    public Flight searchFlight(int id){
        for(int i=0; i<flights.size(); i++){
            if (flights.get(i).getFlightID() == id)
                return flights.get(i);
        }
        return null;
    }
}
