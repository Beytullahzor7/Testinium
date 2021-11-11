import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By productNameLocator = By.cssSelector("a.a_model_item ");
    By seeMoreLocator = By.cssSelector("a.lazy-load-button");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }

    public void scrolldonw() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
    }

    public void seeMore() {
        click(seeMoreLocator);
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
