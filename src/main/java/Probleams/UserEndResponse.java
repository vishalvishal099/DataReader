package Probleams;

import pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class UserEndResponse {
    public static void main(String[] args) {
        User user = null;
        UserRepository getUserDetails = new UserRepository();
        ArrayList<String> phoneNumber = new ArrayList<String>();
        PhoneNumHandler phoneN = new PhoneNumHandler();
        Map<String, String> mapInput = new HashMap<String, String>();
        Map<String, ArrayList> phone = new HashMap<String, ArrayList>();
        phoneNumber= phoneN.addNumber("8123758353");
        phoneNumber =phoneN.addNumber("91919191919");

        //phoneNumber =phoneN.addNumber("91919191919");

        phoneNumber =phoneN.addNumber("91919191918");
        phoneNumber =phoneN.addNumber("91919191917");
        phoneNumber =phoneN.addNumber("91919191916");
       // phoneNumber =phoneN.addNumber("91919191915");


        mapInput.put("fristName", "Jek");
        mapInput.put("lastName", "Ding");
        mapInput.put("address", "H.NO 102 , 2nd crossh , Landon ");
        phone.put("phone", phoneNumber);
        user = new User("vishal");
        user.setLastName(mapInput.get("lastName"));
        user.setAddress(mapInput.get("address"));
        user.setPhone(phone.get("phone"));
        UserRepository.addUser(user);
        user = UserRepository.findUserByName("Vishal");
        System.out.println(user.getFristName() + "  " + user.getLastName() + "   " + user.getAddress() + "    " + user.getPhone());
    }
}
