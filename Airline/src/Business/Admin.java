package Business;

import java.time.*;

public class Admin extends Person {
    
    private LocalDate employment_date;
    private float salary;

    public LocalDate getEmploymentDate() {
        return employment_date;
    }

    public float getSalary() {
        return salary;
    }

    public void setEmploymentDate(LocalDate employment_date) {
        this.employment_date = employment_date;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    void  print() {
        System.out.println("Employment Date: "+ employment_date.toString());
        System.out.println("Salary: "+salary);
    }
    
}
