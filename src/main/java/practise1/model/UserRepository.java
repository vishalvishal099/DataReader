package practise1.model;


import java.util.*;

public class UserRepository {


    static Set<User> userListSet = new HashSet<User>();

    public static void addUser(User user) {
        if (userListSet.contains(user)) {
        } else
            userListSet.add(user);
    }

    public static User findUserByName(String name) {
        User findUser = null;
        Iterator<User> itr = userListSet.iterator();
        while (itr.hasNext()) {
            findUser = itr.next();
            if (findUser.getFristName() == name) {
                return findUser;
            }

        }
        return findUser;
    }
}

