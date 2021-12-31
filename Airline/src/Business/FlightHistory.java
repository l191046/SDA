package Business;

import java.util.ArrayList;

public class FlightHistory {
    ArrayList<Ticket> history;
    
    public FlightHistory(){
        history = new ArrayList<Ticket>();
    }

    public ArrayList<Ticket> getHistory() {
        return history;
    }
    
    public void addTicket(Ticket ticket){
        history.add(ticket);
        //----------DATABASE----------
        for (SeatBooking booking : ticket.getBookings()){
            
        }
        //----------------------------
    }
}
