import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest{
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
        driver.navigate().to("https://translate.google.com/");
        driver.findElement(By.className("orig")).sendKeys("dog");
        }
        @AfterClass
        public static void quit(){
        driver.quit();
        }
        }



