import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Test2 {
    private static WebDriver driver;
    private static String url = "https://www.booking.com";

    @Before
    public void init() {
        System.setProperty("webdriver.gecko.driver","R:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testDate() throws Exception {
        init();
        System.out.println("Starting Test 2");
        driver.get(url);
        PageObject page = PageFactory.initElements(driver, PageObject.class);
        page.setCalendar("2020-01-15", "2020-02-01");
        page.setDestination("London");
        page.finish();
        driver.close();
    }
}
