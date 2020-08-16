import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.IResultMap;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;


import java.lang.reflect.Method;

public class LoginPageTest extends BaseTest {
    LogInPage LogInPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method, ITestResult result) {
        super.setUp(method, result);
        LogInPage = new LogInPage(getDriver());
    }

    @Test
    public void verifyTitle() {
        LogInPage.sleep(2000);
        Assert.assertEquals(getDriver().getTitle(), "Swap Labs");
    }
    @Test
    public void verifyLogInStandardUser() {
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        extentTest.log(LogStatus.INFO,"current URL: " + getDriver().getCurrentUrl());
        extentTest.log(LogStatus.INFO, "expected URL: https://www.saucedemo.com/inventory.html");
        screenshot.takeScreenshotAndLog();
    }
    @Test
    public void verifyLockedUser() {
        LogInPage.logIn("locked");
        Assert.assertEquals(LogInPage.errorMsg.getText(), "Epic sadface: Sorry, this user has been locked out");
    }
}
