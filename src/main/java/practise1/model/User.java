package practise1.model;

import java.util.ArrayList;

public class User {
    private String fristName;
    private String lastName;
    private String address;
    private ArrayList<String> phone;

    public User(String name) {
        fristName = name;
    }

    public String getFristName() {
        return fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
