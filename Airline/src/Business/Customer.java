/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP PC
 */
public class Customer extends Person {
    String contact;
    
    void changecontact(String x)
    {
        contact=x;
    }
    
    @Override
    void print()
    {
      System.out.println("Contact: "+contact);
    }
}
