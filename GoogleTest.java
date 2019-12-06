import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTest {
    private static WebDriver driver;
    @BeforeClass
    public static void openBrow() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();//יצירת אובייקט
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    @Test
    public void serch (){
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("5 USD to ILS");
        driver.findElement(By.name("q")).click();

    }
}
