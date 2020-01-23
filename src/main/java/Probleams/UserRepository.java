package Probleams;

import pojo.User;

import java.util.*;

public class UserRepository {


        static Set<User> userListSet = new HashSet<User>();

        public static void addUser (User user){
            if (userListSet.contains(user)) {
            } else
                userListSet.add(user);
        }

        public User printUser (String name){
           return userListSet.contains( new User(name));
        }
    }

