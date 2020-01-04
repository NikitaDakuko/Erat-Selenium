package com.driver.testing;

import com.driver.pages.LoginPage;
import com.driver.utils.ResourceReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDataTests extends CommonConditions{

    @Test
    public void sendIncorrectEmail() {
        String errorMessage = new LoginPage(driver)
                .openPage()
                .sendEmailData("asdfadf")
                .getEmailErrorMessage();
        Assert.assertEquals(errorMessage, ResourceReader.get("INVALID_EMAIL_ERROR_MESSAGE"));
    }

    @Test
    public void signInWithEmptyEmail(){
        String errorMessage = new LoginPage(driver)
                .openPage()
                .sendEmailData()
                .getEmailErrorMessage();
        Assert.assertEquals(errorMessage, ResourceReader.get("BLANK_EMAIL_ERROR_MESSAGE"));
    }

    @Test
    public void signInWithIncorrectPassword(){
        String errorMessage = new LoginPage(driver)
                .openPage()
                .sendEmailData(ResourceReader.get("Login.Email"))
                .sendPasswordData("asdfadf")
                .getPasswordErrorMessage();
        Assert.assertEquals(errorMessage, ResourceReader.get("WRONG_PASSWORD_ERROR_MESSAGE"));
    }

    @Test
    public void signInWithEmptyPassword(){
        String errorMessage = new LoginPage(driver)
                .openPage()
                .sendEmailData(ResourceReader.get("Login.Email"))
                .sendPasswordData()
                .getPasswordErrorMessage();
        Assert.assertEquals(errorMessage, ResourceReader.get("BLANK_PASSWORD_ERROR_MESSAGE"));
    }

    @Test
    public void signInWithEmailAndPassword(){
        String welcomeMessage = new LoginPage(driver)
                .openPage()
                .sendEmailData(ResourceReader.get("Login.Email"))
                .sendPasswordData(ResourceReader.get("Login.Password"))
                .getWelcomeText();
        Assert.assertEquals(welcomeMessage, ResourceReader.get("SUCCESS_LOGIN_WELCOME_TEXT"));
    }
}