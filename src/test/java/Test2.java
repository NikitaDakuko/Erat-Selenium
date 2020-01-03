import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test2 extends TestBase{

    @Test
    public void testDate() throws Exception {

        driver = new FirefoxDriver();
        System.out.println("Starting Test 1");
        driver.get(prop.getProperty("testURL"));

        PageObject page = PageFactory.initElements(driver, PageObject.class);
        page.setCalendar("2020-01-15", "2020-02-01");
        page.setDestination("London");
        page.finish();
    }
}
