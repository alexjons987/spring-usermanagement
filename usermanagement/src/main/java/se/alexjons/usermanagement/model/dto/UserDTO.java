package se.alexjons.usermanagement.model.dto;

public class UserDTO {
    private final String fname;
    private final String lname;
    private final String email;
    private final int age;

    public UserDTO(String fname, String lname, String email, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
