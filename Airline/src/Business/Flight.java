/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Flight {
    private int FlightID;
    private Airport Source;
    private Airport Destination;
    private LocalDateTime Time;
    private float Cost;
    private String Status;
    private int Duration;

    public Flight(int FlightID, Airport Source, Airport Destination, LocalDateTime Time, float Cost, String Status, int Duration) {
        this.FlightID = FlightID;
        this.Source = Source;
        this.Destination = Destination;
        this.Time = Time;
        this.Cost = Cost;
        this.Status = Status;
        this.Duration = Duration;
    }

    public int getFlightID() {
        return FlightID;
    }

    public void setFlightID(int FlightID) {
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

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }
    
    
    
    
}
