package Business;

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
