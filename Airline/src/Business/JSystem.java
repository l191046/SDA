package Business;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JSystem {
    private static final JSystem instance = new JSystem();
    private FlightList flight_list;
    
    private JSystem(){
        flight_list = new FlightList();
    }
    public static JSystem getInstance(){
        return instance;
    }
    public void test(){
        System.out.println("Test successful");
    }
    public boolean checkFlightStatus(int flight_id, DefaultTableModel table_model){
        Flight flight = flight_list.searchFlight(flight_id);
        if (flight == null)
            return false;
        
        table_model.addRow(
                new Object[] {
                    flight.getFlightID(), 
                    flight.getSource().getCode(), 
                    flight.getDestination().getCode(),
                    flight.getTime(),
                    flight.getTime(),
                    flight.getStatus()
                }
        );
        return true;
    }
    
}
