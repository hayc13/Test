import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonTest extends BaseTest {
    @Test //A  1th locator
    public void findBox() {
        driver.navigate().to("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        searchBox.submit();
        driver.findElements(By.className("s-image")).get(0).click();
    }
}
