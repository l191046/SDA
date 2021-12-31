package Business;

public class Seat {
    private String seatID;
    private boolean taken;
    
    public Seat(){
        
    }
    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }
    public void setTaken(boolean taken) {
        this.taken = taken;
    }
    public String getSeatID() {
        return seatID;
    }
    public boolean isTaken() {
        return taken;
    }
    
    
}
