package com.example.ems.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "EMS_user")
public class User {

    @Id
    private String id; // Use String for MongoDB ObjectId
    private String username;
    private String email;
    private String password;

    // Getters and Setters
    public String getId() {
        return id;
    }

    // No setId method to prevent direct setting of id

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
