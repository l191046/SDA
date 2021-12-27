package Business;

import java.util.ArrayList;
import Database.MSsql;
import java.sql.ResultSet;


public class NoFlyList {
    private ArrayList<Customer> customers;
    private MSsql database;
    
    public NoFlyList(){
        customers = new ArrayList<Customer>();
        database = MSsql.getInstance();
    }
    
    public void loadNoFlyList(){
        customers.clear();
        try (ResultSet result = database.getTableNoFly();){
            if (result == null)
                return;
            while(result.next()){
                Customer customer = new Customer();
                customer.setFirstname(result.getString("FirstName"));
                customer.setLastname(result.getString("LastName"));
                customer.setCNIC(result.getString("CNIC"));
                customer.setAddress(result.getString("Address"));
                customer.setContact(result.getString("Contact"));
                customers.add(customer);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    
}
