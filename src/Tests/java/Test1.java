import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void testDestination() throws Exception {

        driver = new FirefoxDriver();
        System.out.println("Starting Test 1");
        driver.get(prop.getProperty("testURL"));

        HotelSearchPage page = PageFactory.initElements(driver, HotelSearchPage.class);
        page.setDestination("Moscow");
        page.checkPrices();
        page.checkResults();
    }
}
