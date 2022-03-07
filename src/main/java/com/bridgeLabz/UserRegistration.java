package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
