import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AmazonTest {
    private static WebDriver driver;

    @BeforeClass
    public static void openBrow() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();//יצירת אובייקט
//        options.addArguments("-incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    @Test //A  1th locator
    public void findBox() {
        driver.navigate().to("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("twotabsearchtextbox")).submit();
        List<WebElement> list = driver.findElements(By.className("s-image"));
        list.get(0).click();
    }

}
