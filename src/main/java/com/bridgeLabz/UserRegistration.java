package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean lastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean emailAddress(String emailId){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }

    public boolean mobileNumber(String mobileNumber){
        Pattern pattern = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
}
