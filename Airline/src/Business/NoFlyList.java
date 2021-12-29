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
    
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    public boolean addCustomer(Customer customer){
        if (searchCustomer(customer.getCNIC()) != -1)
            return false;
        customers.add(customer);
        //---------UPDATE DATABASE----------
        if (database.searchCustomer(customer.getCNIC())){
            database.addToNoFly(customer.getCNIC());
        }
        else{
            database.addToNoFly( 
                    customer.getCNIC(),
                    customer.getFirstname(),
                    customer.getLastname(),
                    customer.getContact(),
                    customer.getAddress()
            );
        }
        //----------------------------------
        return true;
    }
    public boolean removeCustomer(String cnic){
        int i = searchCustomer(cnic);
        if (i == -1)
            return false;
        
        customers.remove(i);
        //-----------UPDATE DATABASE------------
        database.removeFromNoFly(cnic);
        //--------------------------------------
        return true;
    }
    public int searchCustomer(String cnic){
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getCNIC().equals(cnic)){
                return i;
            }
        }
        return -1;
    }
}
