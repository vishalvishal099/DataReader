package Probleams;

import pojo.User;

import java.util.Map;

public class UserEndResponse {
    public static void main(String[] args) {
        GetUserDetails getUserDetails = new GetUserDetails();
        SetUserDetails setUserDetails = new SetUserDetails();
        setUserDetails.setDataForUser();
        User user = getUserDetails.printUser("1");
        System.out.println(user.getFristName()+"  " + user.getLastName()+ "   " +user.getAddress()+"    "+user.getPhone());
    }
}
