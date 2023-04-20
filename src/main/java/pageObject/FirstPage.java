package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage extends BasePage{
    By xpath = By.xpath("//*[@id='mw-content-text']/div[1]/table[1]/tbody/tr[4]/td/span/a");

    public FirstPage(WebDriver driver) {
        super(driver);
    }

    public void clickLink(){
        driver.findElement(xpath).click();
    }
}
