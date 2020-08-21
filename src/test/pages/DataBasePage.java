package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class DataBasePage extends BasePage {
    WebDriver driver;

    public DataBasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//tr/th")
    public List<WebElement> thHeader;

    @FindBy(xpath = "//button[id='access-db-btn']")
    public WebElement accessBtn;

    //handle window when switch to DataBasePage
    public void handleWindow() {

        String mainWindow = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();

        for(String e : set) {
            if(!e.equals(mainWindow)) {
                driver.switchTo().window(e);
            }
        }
    }
    @FindBy(xpath = "//tbody/tr/td[7]")
    public List<WebElement> allEditDeleteRow;


}

