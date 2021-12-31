package Business;

import java.util.ArrayList;
import Database.MSsql;

public class CustomerList {
    ArrayList<Customer> customers;
    MSsql database;
    
    
    
    public CustomerList(){
        customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean addCustomer (Customer customer){
        if (searchCustomer(customer.getCNIC()) != null)
            return false;
        customers.add(customer);
        
        //---------UPDATE DATABASE----------
        database.addCustomer(
                customer.getCNIC(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getAddress(),
                customer.getContact()
                
        );
        //----------------------------------
        return true;
    }
    
    public Customer searchCustomer (String CNIC){
        for (Customer customer : customers){
            if (customer.getCNIC().equals(CNIC)){
                return customer;
            }
        }
        return null;
    }
    
}
