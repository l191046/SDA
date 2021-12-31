package Business;

import java.util.ArrayList;
import Database.MSsql;

public class TicketList {
    ArrayList<Ticket> history;
    MSsql database;
    
    public TicketList(){
        history = new ArrayList<Ticket>();
        database = MSsql.getInstance();
    }

    public ArrayList<Ticket> getHistory() {
        return history;
    }
    
    public void addTicket(Ticket ticket){
        history.add(ticket);
        //----------DATABASE----------
        for (SeatBooking booking : ticket.getBookings()){
            database.addTicket(
                    ticket.getTicketID(), 
                    booking.getFlight().getFlightID(),
                    booking.getSeat().getSeatID(),
                    ticket.getCustomer().getCNIC()
            );
        }
        //----------------------------
    }
    public void removeTicket(String ticketID){
        Ticket ticket = searchTicket(ticketID);
        if (ticket == null)
            return;
        history.remove(ticket);
        //----------DATABASE----------
        database.cancelTicket(ticketID);
        //----------------------------
    }
    public Ticket searchTicket(String ticketID){
        for (Ticket ticket : history){
            if (ticket.getTicketID().equals(ticketID)){
                return ticket;
            }
        }
        return null;
    }
        
    
}
