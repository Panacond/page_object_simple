package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SecondPage extends BasePage{
    By xpath = By.xpath("//div[@id='mw-content-text']/div[1]/p[1]/b");

    public SecondPage(WebDriver driver){
        super(driver);
    }

    public String getData(){
        return driver.findElement(xpath).getText();
    }
}
