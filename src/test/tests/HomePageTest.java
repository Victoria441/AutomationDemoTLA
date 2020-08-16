package tests;
import base.BaseTest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

import java.lang.reflect.Method;


public class HomePageTest extends BaseTest {
    LogInPage LogInPage;
    HomePage HomePage;

    @BeforeMethod(alwaysRun = true)
    public void localSetUp(Method method, ITestResult result) {
        setUp(method, result);
        LogInPage = new LogInPage(getDriver());
        HomePage = new HomePage(getDriver());

    }
    @Test
    public void validatePageHeader() {
        LogInPage.logIn("standard");
        Assert.assertEquals(HomePage.headerText.getText(), "Products");
    }
}
