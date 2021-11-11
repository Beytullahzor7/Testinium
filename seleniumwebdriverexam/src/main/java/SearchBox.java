import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("search_input");
    By submitButtonLocator = By.cssSelector("button.searchButton"); //düzenlenecek
    By clearButtonLocator = By.cssSelector("i.searchClear");

    public SearchBox(WebDriver driver) {
        super(driver);
    }
    public void search(String text) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("search_input"))).doubleClick().perform();

        type(searchBoxLocator, text);
        click(submitButtonLocator);

    }
}
