package Business;

import java.util.ArrayList;
import Database.MSsql;

public class FlightHistory {
    ArrayList<Ticket> history;
    MSsql database;
    
    public FlightHistory(){
        history = new ArrayList<Ticket>();
    }

    public ArrayList<Ticket> getHistory() {
        return history;
    }
    
    public void addTicket(Ticket ticket){
        history.add(ticket);
        //----------DATABASE----------
        
        
        }
        //----------------------------
    
}
