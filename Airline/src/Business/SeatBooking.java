
package Business;

public class SeatBooking {
    private Flight Flight;
    private String seatNumber;

    public SeatBooking(Flight Flight, String seatNumber) {
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

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

}
