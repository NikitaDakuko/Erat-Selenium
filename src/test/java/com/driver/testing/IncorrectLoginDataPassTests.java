package com.driver.testing;

import com.driver.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncorrectLoginDataPassTests extends CommonConditions{

    @Test
    public void sendDealToIncorrectEmail() {
        String errorMessage = new LoginPage(driver, prop)
                .openPage()
                .sendDealTo("asdfadf")
                .getErrorMessageFromSendDeal();
        Assert.assertEquals(errorMessage, prop.getProperty("INVALID_EMAIL_ERROR_MESSAGE"));
    }

 /*   @Test
    public void signInWithEmptyEmail(){

        UserModel testUser = UserCreator.withEmptyUserEmail();
        String errorMessage = new LoginPage(driver, prop)
                .openPage()
                .loginWithEmptyEmail(testUser)
                .getErrorMessageFromSignInEmailInput();
        Assert.assertEquals(errorMessage, prop.getProperty("BLANK_EMAIL_ERROR_MESSAGE"));
    }

    @Test
    public void signInWithEmptyPassword(){
        UserModel testUser = UserCreator.withEmptyPassword();
        String errorMessage = new LoginPage(driver, prop)
                .openPage()
                .loginWithEmptyPassword(testUser)
                .getErrorMessageFromSignInPasswordInput();
        Assert.assertEquals(errorMessage, prop.getProperty("BLANK_PASSWORD_ERROR_MESSAGE"));
    }*/
}