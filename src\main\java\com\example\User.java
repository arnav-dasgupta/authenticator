package com.example;

public class User {
    private String id;
    private String name;
    private String email;
    // Getters and setters
    public Object getId() {
        return id;
    }
    public Object getName() {
        return name;
    }
    public Object getEmail() {
        return email;
    }
    public void setEmail(Object email2) {
        email = (String) email2;
    }
    public void setName(Object name2) {
        name = (String) name2;
    }
}
