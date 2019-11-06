package MVC_Model.Practice.customers.model;

public class Customer {
    private int ID;
    private String name;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int ID, String name, String email, String address) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
