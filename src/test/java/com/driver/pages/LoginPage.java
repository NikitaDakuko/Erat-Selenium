package com.driver.pages;

import com.driver.utils.ResourceReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends AbstractPage {


    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[3]/button")
    private WebElement sendEmailButton;

    @FindBy(xpath = "/html/body/div/div/div/div/div[1]/div[2]/div/div/div/form/button/span")
    private WebElement sendPasswordButton;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement sendEmail;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement sendPassword;

    @FindBy(id = "username-error")
    private WebElement emailErrorMessage;

    @FindBy(id = "password-error")
    private WebElement passwordErrorMessage;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public LoginPage openPage() {
        this.driver.get(ResourceReader.get("URL.Test.Login"));
        return this;
    }

    public LoginPage sendEmailData(){
        driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        sendEmailButton.click();
        return this;
    }

    public LoginPage sendEmailData(String email) {
        driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        sendEmail.sendKeys(email);
        sendEmailButton.click();
        return this;
    }

    public LoginPage sendPasswordData(){
        driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        sendPasswordButton.click();
        return this;
    }

    public LoginPage sendPasswordData(String password) {
        driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        sendPassword.sendKeys(password);
        sendPasswordButton.click();
        return this;
    }

    public String getEmailErrorMessage(){ return emailErrorMessage.getText(); }

    public String getPasswordErrorMessage(){
        return passwordErrorMessage.getText();
    }
}
