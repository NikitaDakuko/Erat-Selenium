package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginPage extends AbstractPage {


    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[3]/button")
    private WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement sendInput;

    @FindBy(id = "username-error")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver, Properties props){
        super(driver, props);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public LoginPage openPage() {
        driver.get(props.getProperty("URL.Test.Login"));
        return this;
    }

    public LoginPage sendDealTo(String email) {
        driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        sendInput.sendKeys(email);
        sendButton.click();
        return new LoginPage(driver, props);
    }

    public String getErrorMessageFromSendDeal(){
        return errorMessage.getText();
    }
}
