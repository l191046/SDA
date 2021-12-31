package Business;

public class Customer extends Person {
    private String contact;
    private boolean noFly;
    
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isNoFly() {
        return noFly;
    }

    public void setNoFly(boolean noFly) {
        this.noFly = noFly;
    }

    
    
    @Override
    void print()
    {
      System.out.println("Contact: "+contact);
    }
}
