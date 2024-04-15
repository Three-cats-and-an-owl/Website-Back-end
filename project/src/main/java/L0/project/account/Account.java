package L0.project.account;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.*;
public class Account {
    @Id
    private ObjectId userId;

    private String username;
    private String password;
    private String email;
    private String address;
    private String phone;

    private String role;
}

public Account(ObjectId userId, String username, String password, String email, String address, String phone, String role) {
    this.userId = userId; //Unique identifier for the account
    this.username = username;
    this.password = password;
    this.email = email;
    this.address = address;
    this.phone = phone;
    
    this.role = role;
}

