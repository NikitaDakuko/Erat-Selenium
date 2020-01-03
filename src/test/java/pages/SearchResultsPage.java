package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Properties;

public class SearchResultsPage extends AbstractPage{
    @FindBy(id = "hotellist_inner")
    private WebElement hotelList;

    private List<WebElement> results;

    protected SearchResultsPage(WebDriver driver, Properties prop) {
        super(driver, prop);
    }

    List<WebElement> getResults(){
        if (results == null)
            results = hotelList.findElements(By.className("sr_item_new"));
        return results;
    }

    public void checkResults() throws Exception {
        List<WebElement> results = getResults();
        if(results.size() > 0)
            System.out.println("Test completed successfully with " + results.size() + " results");
        else
            throw new Exception("No results");
    }

    @Override
    protected AbstractPage openPage() {
        driver.get(props.getProperty("URL.Test.Search"));
        return null;
    }


}
