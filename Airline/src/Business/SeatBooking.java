
package Business;

public class SeatBooking {
    private int Flight;
    private int seatNumber;

    public SeatBooking(int Flight, int seatNumber) {
        this.Flight = Flight;

        this.seatNumber = seatNumber;
    }

    public SeatBooking() {
        
    }

    public int getFlight() {
        return Flight;
    }

    public void setFlight(int Flight) {
        this.Flight = Flight;
    }

    public int getseatNumber() {
        return seatNumber;
    }

    public void setseatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
}
