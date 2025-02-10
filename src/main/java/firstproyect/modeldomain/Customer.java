package firstproyect.modeldomain;

public class Customer {

    private int Id;
    private String Name;
    private String user;
    private String Password;

    public Customer(int id, String name, String user, String password) {
        Id = id;
        Name = name;
        this.user = user;
        Password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
