/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
public class Ticket {
    private int TicketID;
    private ArrayList<SeatBooking> routeBookings;
    private Customer customer;

    public Ticket(int TicketID) {
        this.TicketID = TicketID;
    }
    
    public void addBooking(SeatBooking obj){
        this.routeBookings.add(obj);
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
