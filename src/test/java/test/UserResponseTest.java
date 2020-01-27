package test;

import Probleams.PhoneNumHandler;
import Probleams.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserResponseTest {
    ArrayList<String> phoneNumber = new ArrayList<String>();
    PhoneNumHandler phoneN = new PhoneNumHandler();
    Map<String, String> mapInput = new HashMap<String, String>();
    Map<String, ArrayList> phone = new HashMap<String, ArrayList>();
    User user = null;

    @Test
    public void verifyDuplicatePhoneNumber() {
        phoneNumber = phoneN.addNumber("8123758353");
        try {
            phoneNumber = phoneN.addNumber("8123758353");
        } catch (Exception e) {
            Assert.assertTrue(e.toString().contains(" You have entered duplicate number ! Given number is all ready available in your phone directory"));
        }
    }

    @Test
    public void verifyMaxAllowedPhoneNumber() {

        try {
            phoneNumber = phoneN.addNumber("8123758353");
            phoneNumber = phoneN.addNumber("8123758354");
            phoneNumber = phoneN.addNumber("8123758355");
            phoneNumber = phoneN.addNumber("8123758356");
            phoneNumber = phoneN.addNumber("8123758357");
            phoneNumber = phoneN.addNumber("8123758358");
        } catch (Exception e) {
            System.out.println(e);
            Assert.assertTrue(e.toString().contains("java.lang.RuntimeException: You can't enter more than 5 phone numbers"));
        }
    }

    @Test
    public void verifyUserData() {
        phoneNumber = phoneN.addNumber("8123758353");
        phoneNumber = phoneN.addNumber("91919191919");
        phoneNumber = phoneN.addNumber("91919191918");
        phoneNumber = phoneN.addNumber("91919191917");
        phoneNumber = phoneN.addNumber("91919191916");
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

        Assert.assertEquals(user.getFristName() + "  " + user.getLastName() + "   " + user.getAddress() + "    " + user.getPhone(),
                "vishal  Ding   H.NO 102 , 2nd crossh , Landon     [8123758353, 91919191919, 91919191918, 91919191917, 91919191916]");
    }
}
