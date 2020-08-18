package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMgtPage extends BasePage {
    WebDriver driver;


    public UserMgtPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "login-btn")
    public WebElement loginBtn;

    @FindBy(id = "access-db-btn")
    public WebElement accessBtn;

    public String[] registrationFormField = {"Firstname", "Lastname", "Email", "Phonenumber", "Select-role"};

    public WebElement findById(String id) {
        return driver.findElement(By.id(id));

    }
    @FindBy(xpath = "//table[@id='list-table']//tbody")
    public WebElement dataTable;

    @FindBy(id = "submit-btn")
    public WebElement submitBtn;

    @FindBy(id = "clear-btn")
    public WebElement clearBtn;

    @FindBy(xpath = "//*[text()='User Database']")
    public WebElement userDB;

//    public String[] registrationTable = {"Firstname", "Lastname", "Role", "Phonenumber", "Email", "Password"};
//    public WebElement findByXpath(String xpath) {
//        return driver.findElement(By.xpath(xpath));
    }



