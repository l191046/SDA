package Business;
import java.util.ArrayList;

public class FlightList {
    public ArrayList<Flight> Flights;
    
    public FlightList(){
        Flights = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlights() {
        return Flights;
    }

    public void setFlights(ArrayList<Flight> Flights) {
        this.Flights = Flights;
    }
    
    
    
    
    public boolean addFlight(Flight new_flight){
        if (searchFlight(new_flight.getFlightID()) != null) //if flight already exists
            return false;
        Flights.add(new_flight);
        return true;
    }
    public Flight searchFlight(String id){
        for(int i=0; i<Flights.size(); i++){
            if (Flights.get(i).getFlightID() == id)
                return Flights.get(i);
        }
        return null;
    }
}
