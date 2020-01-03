import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {
    @FindBy(id = "hotellist_inner")
    private WebElement hotelList;

    private List<WebElement> results;


    List<WebElement> getResults(){
        if (results == null)
            results = hotelList.findElements(By.className("sr_item_new"));
        return results;
    }

    void checkResults() throws Exception {
        List<WebElement> results = getResults();
        if(results.size() > 0)
            System.out.println("Test completed successfully with " + results.size() + " results");
        else
            throw new Exception("No results");
    }
}
