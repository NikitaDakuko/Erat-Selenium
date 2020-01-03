import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonConditions {
    protected static WebDriver driver;
    protected static Properties prop;

    @BeforeMethod
    public void geckoSetter() throws IOException {
        prop = new Properties();
        prop.load(new FileInputStream("src/Tests/TestProperties.properties"));
        System.setProperty("webdriver.gecko.driver", prop.getProperty("geckoDriver.location"));
        System.setProperty("webdriver.gecko.driver","R:\\Selenium\\geckodriver.exe");

    }

    @AfterMethod(alwaysRun = true)
    public void killBrowser(){
        driver.close();
    }
}
