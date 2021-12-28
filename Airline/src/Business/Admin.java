package Business;

import java.time.*;
import Database.MSsql;

public class Admin extends Person {
    
    private LocalDate employment_date;
    private float salary;

    //-----GETTERS-------
    public LocalDate getEmploymentDate() {
        return employment_date;
    }
    public float getSalary() {
        return salary;
    }
    //-----SETTERS-------
    public void setEmploymentDate(LocalDate employment_date) {
        this.employment_date = employment_date;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
   
    //---------DATABASE----------
    public void updateRecord(String cnic, String fname, String lname, String address){
        this.CNIC = cnic;
        this.Firstname = fname;
        this.Lastname = lname;
        this.Address = address;
        MSsql database = MSsql.getInstance();
        database.editAdmin(CNIC, Firstname, Lastname, Address);
    }
    
    @Override
    void  print() {
        System.out.println("Employment Date: "+ employment_date.toString());
        System.out.println("Salary: "+salary);
    }
    
}
