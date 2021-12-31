package Business;

import java.util.ArrayList;
import Database.MSsql;
import java.sql.ResultSet;


public class NoFlyList {
    private CustomerList customer_list;
    private ArrayList<Customer> customers;
    private MSsql database;
    
    public NoFlyList(CustomerList customer_list){
        customers = new ArrayList<Customer>();
        database = MSsql.getInstance();
        this.customer_list = customer_list;
    }
    public void loadNoFlyList(){
        for (Customer c : customer_list.getCustomers()){
            if (c.isNoFly()){
                customers.add(c);
            }
        }
    }
    
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    public boolean addCustomer(Customer customer){
        customer.setNoFly(true);
        Customer c = customer_list.searchCustomer(customer.getCNIC());
        if (c!=null){        //if existing customer
            customers.add(c);
            c.setNoFly(true);
            //----------UPDATE DATABASE-------------
            database.addToNoFly(c.CNIC);
            //--------------------------------------
        }
        else {              //if customer not in system
            customer_list.addCustomer(customer);
            customers.add(customer);
        }
        return true;
    }
    public boolean removeCustomer(String cnic){
        Customer c = searchCustomer(cnic);
        if (c == null)
            return false;
        c.setNoFly(false);
        customers.remove(c);
        
        //-----------UPDATE DATABASE------------
        database.removeFromNoFly(cnic);
        //--------------------------------------
        return true;
    }
    public Customer searchCustomer(String cnic){
        for (Customer c : customers){
            if (c.getCNIC().equals(cnic)){
                return c;
            }
        }
        return null;
    }
}
