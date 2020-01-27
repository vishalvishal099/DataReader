package practise1;

import practise1.model.User;
import practise1.model.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        User user = new User("Vishal");
        user.setLastName("Jek");
        user.setAddress("H.NO 102 , 2nd crossh , Landon ");
        List<String> phoneNumbers = Arrays.asList("0812300000", "0812300001", "0812300002");
        user.setPhone(new ArrayList<String>(phoneNumbers));

        UserRepository.addUser(user);

        User vishal = UserRepository.findUserByName("Vishal");
        System.out.println(vishal);

    }
}
