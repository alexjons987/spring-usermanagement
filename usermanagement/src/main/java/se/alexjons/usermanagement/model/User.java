package se.alexjons.usermanagement.model;

import java.time.LocalDate;

public class User {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private int age;
    private LocalDate created;

    public User(int id, String fname, String lname, String email, int age, LocalDate created) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
