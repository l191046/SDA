/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP PC
 */
public class Person {
    int CNIC;
    String Firstname;
    String Lastname;
    String Address;
    
  void changeCNIC(int x)
  { 
      CNIC=x;
  }
  void changefirstname(String x)
  {
      Firstname=x;
  }
  void changelastname(String x)  
  {
      Lastname=x;
  }
  void changeaddress(String x)
  {
      Address=x;
  }
  void print()
  {
      System.out.println("CNIC: "+CNIC);
      System.out.println("Firstname: "+Firstname);
      System.out.println("Lastname: "+Lastname);
      System.out.println("Address: "+Address);
      
  }
}
