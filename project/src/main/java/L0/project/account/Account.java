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

    //Getters and Setters
    public ObjectId getUserId() {
        return this.userId;
    }
    public String getUsername() {
        return this.username;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail (String email) {
        this.email = email;
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
}



