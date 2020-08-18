package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DataBasePage extends BasePage {
    WebDriver driver;

    public DataBasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='User Database']")
    public WebElement userDb;


    @FindBy(xpath = "(//tr)[1]")
    public List<WebElement> fieldsRows;


    public void fieldTheForm(String firstname, String lastname, String role, String phonenumber, String email, String password) {
        sendKeys(fieldsRows.get(0), firstname);
        sendKeys(fieldsRows.get(1), lastname);
        sendKeys(fieldsRows.get(2), role);
        sendKeys(fieldsRows.get(3), phonenumber);
        sendKeys(fieldsRows.get(4), email);
        sendKeys(fieldsRows.get(5), password);


    }
}

