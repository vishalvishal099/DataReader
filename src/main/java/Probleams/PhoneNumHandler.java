package Probleams;

import java.util.ArrayList;

public class PhoneNumHandler {
    int allowedPhoneNumbers = 5;
    ArrayList<String> phoneNumber = new ArrayList<String>();

    public ArrayList<String> addNumber(String number) {
        if (phoneNumber.contains(number)) {
            throw new RuntimeException("You have entered duplicate number ! Given number is all ready available in your phone directory");
        } else if (phoneNumber.size() >= allowedPhoneNumbers) {
            throw new RuntimeException("You can't enter more than 5 phone numbers");
        } else {
            if (phoneNumber.size() < allowedPhoneNumbers) {
                phoneNumber.add(number);
            }
        }
        return phoneNumber;
    }
}
