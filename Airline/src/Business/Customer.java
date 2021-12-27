package Business;

public class Customer extends Person {
    private String contact;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    @Override
    void print()
    {
      System.out.println("Contact: "+contact);
    }
}
