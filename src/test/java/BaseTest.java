import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageObject.FirstPage;
import pageObject.SecondPage;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void testsSetUp(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

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
