import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageObject.FirstPage;
import pageObject.SecondPage;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/wiki/Selenium");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


    public FirstPage getFirstPage() {
        return new FirstPage(driver);
    }

    public SecondPage getSecondPage() {
        return new SecondPage(driver);
    }
}
