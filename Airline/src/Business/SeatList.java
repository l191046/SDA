package Business;

import java.util.ArrayList;

public class SeatList {
    private ArrayList<Seat> seats;
    
    public SeatList(){
        seats = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }
    
    public Seat searchSeat(String seatID){
        for (Seat s : seats){
            if (s.getSeatID().equals(seatID))
                return s;
        }
        return null;
    }
    
    public Seat getFirstAvailable(){
        for (Seat s : seats){
            if (!s.isTaken())
                return s;
        }
        return null;
    }
    
    public void add(Seat seat){
        seats.add(seat);
    }
}
