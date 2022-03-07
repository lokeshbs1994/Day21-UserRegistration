package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.firstName("Loki");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.firstName("loki");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.lastName("Hassan");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.lastName("hassan");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLAstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.lastName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.lastName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.emailAddress("lokeshbs619@gmail.com");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.emailAddress("lok_sd@");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = userRegistration.firstName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.mobileNumber("91 9898989898");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.mobileNumber("919898989898");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.mobileNumber(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.mobileNumber("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    //password
    @Test
    public void givenPasswordAsPerRule1_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.passwordRule1("abcAGH123@#");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule1_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.passwordRule1("AG67@");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordRule1_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule1(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule1_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule1("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.passwordRule2("ASasc123@");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnFalse() {
        try {
            boolean valid = userRegistration.passwordRule2("abc1234@df1");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule2(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule2("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.passwordRule3("ABCabc123@");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenInvalid_ShouldReturnFalse() {
        try {
            boolean valid = userRegistration.passwordRule3("abcAFG$%");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule3_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule3(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule3_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule3("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.passwordRule4("ABCabcB123$");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.passwordRule4("abcAOP123");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule4_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule4(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule4_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule4("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc123@.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator(".abc@abc.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.emailAddress(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.emailAddress("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        try {
            String result = MoodAnalyser.analyseMood("User is Happy");
            Assert.assertEquals("Entry Successful", result);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() {
        try {
            String result = MoodAnalyser.analyseMood("User is Sad");
            Assert.assertEquals("Entry Failed", result);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_NULL_ShouldReturnMoodAnalyserException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.type.NULL, e.type);
        }
    }

    @Test
    public void givenMessage_EMPTY_ShouldReturnMoodAnalyserException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyseMood("");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.type.EMPTY, e.type);
        }
    }
}