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
}