import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void openBrowser() {
        DriverConfig.chromeDriverPath(System.getProperties(), System.getenv())
                .ifPresent(path -> System.setProperty(DriverConfig.PROPERTY, path));
        driver = new ChromeDriver(new ChromeOptions());
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
