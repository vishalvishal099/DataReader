package practise1.model;


import java.util.*;
import java.util.stream.Collectors;

public class UserRepository {


    static Set<User> userListSet = new HashSet<User>();

    public static void addUser(User user) {
        if (userListSet.contains(user)) {
        } else
            userListSet.add(user);
    }

    public static User findUserByName(final String name) {
       return userListSet
               .stream()
               .filter(u -> u.getFristName().equals(name))
               .findFirst()
               .orElse(null);
    }
}

