package Probleams;

import pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SetUserDetails {
    User user = new User();
    GetUserDetails getUserDetails = new GetUserDetails();
    ArrayList<String> phoneNumber = new ArrayList<String>();
    Map<String, String> mapInput = new HashMap<String, String>();
    Map<String, ArrayList> phone = new HashMap<String, ArrayList>();

    public void setDataForUser() {
        phone.put("phone", phoneNumber);

        mapInput.put("fristName", "Jek");
        mapInput.put("lastName", "Ding");
        mapInput.put("address", "H.NO 102 , 2nd crossh , Landon ");
        phoneNumber.add("0812300000");
        phoneNumber.add("0812300001");
        phoneNumber.add("0812300002");

        user.setFristName(mapInput.get("fristName"));
        user.setLastName(mapInput.get("lastName"));
        user.setAddress(mapInput.get("address"));
        user.setPhone(phone.get("phone"));
        getUserDetails.addUser("1", user);
    }

}
