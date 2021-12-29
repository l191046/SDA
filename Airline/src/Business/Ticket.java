/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;



public class Ticket {
    
    public class BookedFlight {

        private Flight flight;
        private String seatId;

        BookedFlight(Flight flight) {
            this.flight = flight;
            this.seatId = "";
        }

        public void setSeatId(String seatId) {
            this.seatId = seatId;
        }
        
        public Flight getFlight(){
            return flight;
        }

        public String getSeatId() {
            return seatId;
        }
        
        
    };

    private int TicketID;
    private ArrayList<SeatBooking> routeBookings;
    //private ArrayList<Flight> bookedFlights;

    private ArrayList<BookedFlight> bookedFlights;
    private Customer customer;

    public Ticket(int TicketID) {
        this.TicketID = TicketID;
        bookedFlights = new ArrayList<BookedFlight>();
    }

    public void addBooking(SeatBooking obj) {
        this.routeBookings.add(obj);
    }

    public void addBookedFlight(Flight obj) {
        this.bookedFlights.add(new BookedFlight(obj));
    }
    
    public void setBookedFlightSeat(int index, String seatId) {
        this.bookedFlights.get(index).setSeatId(seatId);
    }

    public ArrayList<BookedFlight> getBookedFlights() {
        return bookedFlights;
    }

    public int getTicketID() {
        return TicketID;
    }

    public void setTicketID(int TicketID) {
        this.TicketID = TicketID;
    }

    public ArrayList<SeatBooking> getRouteBookings() {
        return routeBookings;
    }

    public void setRouteBookings(ArrayList<SeatBooking> routeBookings) {
        this.routeBookings = routeBookings;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
