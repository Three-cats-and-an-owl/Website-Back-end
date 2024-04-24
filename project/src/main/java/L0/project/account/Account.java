package L0.project.account;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Account {
    @Id
    private ObjectId userId;

    private String username;
    private String password;
    private String email;
    private String address;
    private String phone;

    private String role;

    public Account (ObjectId userId, String username, String password, String email, String address, String phone, String role) {
        this.userId = userId; //Unique identifier for the account
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
        
        this.role = role;
    }

    //Getters
    public ObjectId getUserI() {
        return this.userId;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getEmail() {
        return this.email;
    }
    public String getAddress() {
        return this.address;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getRole() {
        return this.role;
    }



    //Setters
    public void setEmail (String email) {
        this.email = email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setRole(String role) {
        this.role = role;
    }
}



