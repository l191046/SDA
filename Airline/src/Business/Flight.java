package Business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {
    private String FlightID;
    private Airport Source;
    private Airport Destination;
    private LocalDateTime Time;
    private float Cost;
    private String Status;
    private LocalTime Duration;
    private SeatList seats;
    
    public Flight(){
        seats = new SeatList();
    }

    public Flight(String FlightID, Airport Source, Airport Destination, LocalDateTime Time, float Cost, String Status, LocalTime Duration) {
        this.FlightID = FlightID;
        this.Source = Source;
        this.Destination = Destination;
        this.Time = Time;
        this.Cost = Cost;
        this.Status = Status;
        this.Duration = Duration;
    }

    public String getFlightID() {
        return FlightID;
    }

    public void setFlightID(String FlightID) {
        this.FlightID = FlightID;
    }

    public Airport getSource() {
        return Source;
    }

    public void setSource(Airport Source) {
        this.Source = Source;
    }

    public Airport getDestination() {
        return Destination;
    }

    public void setDestination(Airport Destination) {
        this.Destination = Destination;
    }

    public LocalDateTime getTime() {
        return Time;
    }

    public void setTime(LocalDateTime Time) {
        this.Time = Time;
    }

    public float getCost() {
        return Cost;
    }

    public void setCost(float Cost) {
        this.Cost = Cost;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public LocalTime getDuration() {
        return Duration;
    }

    public void setDuration(LocalTime Duration) {
        this.Duration = Duration;
    }

    public SeatList getSeats() {
        return seats;
    }

}
