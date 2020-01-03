import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void testDestination() throws Exception {

        driver = new FirefoxDriver();
        System.out.println("Starting Test 1");
        driver.get(prop.getProperty("testURL"));

        PageObject page = PageFactory.initElements(driver, PageObject.class);
        page.setDestination("Moscow");
        page.finish();
    }
}
