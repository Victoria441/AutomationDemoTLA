package pages;

import base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //    @FindBy(id = "user-name")
//    public WebElement usernameField;
//    @FindBy(id = "password")
//    public WebElement passwordField;
//    @FindBy(id = "login-button")
//    public WebElement loginInBtn;
//
//    public void logIn(String userType) {
//        String username = "";
//        String password = "";
//
//        switch (userType) {
//            case "standard":
//                username = "standard user";
//                break;
//            default:
//                System.out.println("Invalid username");
//        }
//        sendKeys(usernameField, username);
//        sendKeys(passwordField, password);
//        click(loginInBtn);
    @FindBy(className = "product_label")
    public WebElement headerText;
}

