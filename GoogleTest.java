import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleTest extends BaseTest {
    @Test
    public void search() {
        driver.navigate().to("https://www.google.com/");
        WebElement box = driver.findElement(By.name("q"));
        box.sendKeys("5 USD to ILS");
        box.click();
    }
}
