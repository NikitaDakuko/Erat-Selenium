import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

//booking.com driver


public class Test1 {
    private static WebDriver driver;
    private static String url = "https://www.booking.com";

    @Before
    public void init() {
        System.setProperty("webdriver.gecko.driver","R:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testDestination() throws Exception {
        init();
        System.out.println("Starting Test 1"    );
        driver.get(url);
        PageObject page = PageFactory.initElements(driver, PageObject.class);
        page.setDestination("Moscow");
        page.finish();
        driver.close();
    }
}
