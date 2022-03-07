package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean lastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean emailAddress(String emailId) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }

    public boolean mobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean passwordRule1(String password) {
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z!,@#$&*().]{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean passwordRule2(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean passwordRule3(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean passwordRule4(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean emailIdValidator(String emailId) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}
