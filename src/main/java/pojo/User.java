package pojo;

import java.util.ArrayList;

public class User {
    String fristName;
    String lastName;
    String address;
    ArrayList<String> phone;

    public User(String name) {
        fristName = name;
    }

    public String getFristName() {
        return fristName;
    }

//    public void setFristName(String fristName) {
//        this.fristName = fristName;
//    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }
}
