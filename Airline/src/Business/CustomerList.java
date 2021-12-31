package Business;
import java.util.ArrayList;
import java.sql.ResultSet;

import Database.MSsql;

public class CustomerList {
    ArrayList<Customer> customers;
    private MSsql database;
    
    public CustomerList(){
        customers = new ArrayList<Customer>();
        database = MSsql.getInstance();
    }
    
    public void loadCustomerList(String flightID){
        try (ResultSet result = database.getTableCustomer(flightID);){
            if (result == null)
                return;
            while (result.next()){
                Customer customer = new Customer();
                customer.setFirstname(result.getString("FirstName"));
                customer.setLastname(result.getString("LastName"));
                customer.setCNIC(result.getString("CNIC"));
                customer.setAddress((result.getString("Address")));
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
