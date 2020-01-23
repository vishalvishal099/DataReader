package Probleams;

import pojo.User;

import java.util.HashMap;
import java.util.Map;

public class GetUserDetails {

        User user = new User();
        static Map<String, User> userMap = new HashMap<String, User>();

        public static void addUser (String id, User user){
            if (userMap.containsKey(id)) {
            } else
                userMap.put(id, user);
        }

        public User printUser (String id){
           return userMap.get(id);
        }
    }

