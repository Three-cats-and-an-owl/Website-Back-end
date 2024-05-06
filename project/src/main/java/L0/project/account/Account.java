package L0.project.account;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Account {
    @Id
    private ObjectId userId;

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String address;
    private String phone;

    private String role;

    public Account (ObjectId userId, String username, String firstName, String lastName, String password, String email, String address, String phone, String role) {
        this.userId = userId; //Unique identifier for the account
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
        
        this.role = role;
    }

    // Getters
    public ObjectId getUserId() {
        return this.userId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getUsername() {
        return this.username;
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
    public String getPassword() {
        return this.password;
    }
    // Setters
    public void setPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(password);
    }
    public void setEmail (String email) {
        this.email = email;
    }
}



