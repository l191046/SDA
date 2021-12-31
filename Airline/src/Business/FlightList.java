package Business;
import java.util.ArrayList;
import Database.MSsql;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FlightList {
    public ArrayList<Flight> Flights;
    private MSsql database;
    
    public FlightList(){
        Flights = new ArrayList<Flight>();
        database = MSsql.getInstance();
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
    public boolean addNewFlight(Flight new_flight){
        if (searchFlight(new_flight.getFlightID()) != null) //if flight already exists
            return false;
        Flights.add(new_flight);
        
        //---------UPDATE DATABASE------------
        database.addFlight(
                new_flight.getFlightID(),
                new_flight.getSource().getCode(),
                new_flight.getDestination().getCode(),
                new_flight.getDuration(), 
                new_flight.getTime(),
                new_flight.getStatus(),
                new_flight.getCost()
        );
        //------------------------------------
        
        return true;
    }
    public Flight searchFlight(String id){
        for(int i=0; i<Flights.size(); i++){
            if (Flights.get(i).getFlightID().equals(id))
                return Flights.get(i);
        }
        return null;
    }
    public boolean removeFlight(String flightID){
        int i=0;
        while(i < Flights.size() && !Flights.get(i).getFlightID().equals(flightID)){
            i++;
        }
        if (i >= Flights.size())
            return false;
        
        Flights.remove(i);
        //--------UPDATE DATABASE---------
        database.removeFlight(flightID);
        //--------------------------------
        return true;
    }
    public boolean changeStatus(String flightID, String status){
        Flight flight = searchFlight(flightID);
        if (flight == null)
            return false;
        flight.setStatus(status);
        //--------UPDATE DATABASE--------
        database.updateStatus(flightID, status);
        //-------------------------------
        return true;
    }
            
}
