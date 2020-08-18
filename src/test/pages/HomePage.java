package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.List;
public class HomePage extends BasePage {
    protected WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(@class,'navbar-brand ml-3')]")
    public List<WebElement> buttons;
    public WebElement[] getNavigationButtonArray(){
        WebElement[] arr = new WebElement[buttons.size()];
        for(int i = 0; i < buttons.size(); i++){
            arr[i] = buttons.get(i);
        }
        return arr;
    }
    public void clickNavBtn(String buttonName) {
        click(driver.findElement(By.linkText(buttonName)));

    }

}

