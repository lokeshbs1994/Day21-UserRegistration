package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("Loki");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenFirstName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("loki");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenLastName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("Hassan");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenLastName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("hassan");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenEmailAddress_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("lokeshbs619@gmail.com");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenEmailAddress_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("lok_sd@");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenMobileNumber_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("91 9898989898");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenMobileNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("919898989898");
        Assert.assertEquals(false,valid);
    }
    //password
    @Test
    public void  givenPasswordAsPerRule1_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("abcAGH123@#");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("AG67@");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("ASasc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("abc1234@df1");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule3("ABCabc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule3("abcAFG$%");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule4("ABCabcB123$");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule4("abcAOP123");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator(".abc@abc.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }
}