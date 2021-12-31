
package Business;

public class SeatBooking {
    private Flight Flight;
    private Seat seat;

    public SeatBooking() {
        Flight = null;
        seat = null;
    }

    public Flight getFlight() {
        return Flight;
    }
    public Seat getSeat() {
        return seat;
    }
    

    public void setFlight(Flight Flight) {
        this.Flight = Flight;
    }
    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    
    

}
