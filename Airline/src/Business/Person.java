package Business;

public class Person {
    protected String CNIC;
    protected String Firstname;
    protected String Lastname;
    protected String Address;
    

    public String getCNIC() {
        return CNIC;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    void print() {
      System.out.println("CNIC: "+CNIC);
      System.out.println("Firstname: "+Firstname);
      System.out.println("Lastname: "+Lastname);
      System.out.println("Address: "+Address);
      
    }
}
