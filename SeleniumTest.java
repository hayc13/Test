import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumTest extends BaseTest {
    @Test //A  1th locator
    public void findBox() {
        driver.navigate().to("https://translate.google.com/");
        driver.findElement(By.className("orig")).sendKeys("dog");
    }
}
