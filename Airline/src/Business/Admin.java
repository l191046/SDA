/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP PC
 */
public class Admin extends Person {
    String EmploymentDate;
    int salary;
    
    void changeEmpDate(String x)
  { 
      EmploymentDate=x;
  }
    void changesalary(int x)
    {
        salary=x;
    }
    @Override
    void  print()
    {
        System.out.println("Employment Date: "+EmploymentDate);
      System.out.println("Salary: "+salary);
    }
    
}
