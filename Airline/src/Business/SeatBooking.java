
package Business;

public class SeatBooking {
    private Flight Flight;
    private int seatNumber;

    public SeatBooking(Flight Flight, int seatNumber) {
        this.Flight = Flight;
        this.seatNumber = seatNumber;
    }
    public SeatBooking(){}

    public Flight getFlight() {
        return Flight;
    }

    public void setFlight(Flight Flight) {
        this.Flight = Flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

}
