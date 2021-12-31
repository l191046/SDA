package Business;

import java.util.ArrayList;
import java.time.LocalTime;



public class Ticket {
    String ticketID;
    ArrayList<SeatBooking> bookings;
    Customer customer;
    
    public Ticket(){
        ticketID = LocalTime.now().toString();
        bookings = new ArrayList<SeatBooking>();
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    
    
    public ArrayList<SeatBooking> getBookings() {
        return bookings;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setBookings(ArrayList<SeatBooking> bookings) {
        this.bookings = bookings;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTicketID() {
        return ticketID;
    }
    
    public int getTotal(){
        int total = 0;
        for (SeatBooking booking : bookings){
            total += booking.getFlight().getCost();
        }
        return total;
    }
    
    public int getFlightCount(){
        return bookings.size();
    }
    
    public String getSource(){
        return bookings.get(0).getFlight().getSource().getCode();
    }
    public String getDestination(){
        return bookings.get(0).getFlight().getDestination().getCode();
    }
    public String getDeparture(){
        return bookings.get(0).getFlight().getTime().toLocalDate().toString();
    }
    public String getDepartureTime(){
        return bookings.get(0).getFlight().getTime().toLocalTime().toString();
    }
    
    public void printToConsole(){
        System.out.println(customer.getFirstname());
        System.out.println(ticketID);
        System.out.println(bookings.get(0).getFlight().getFlightID());
    }
    
}
