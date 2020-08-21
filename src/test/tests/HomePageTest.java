package tests;
import base.BaseTest;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;


import java.lang.reflect.Method;


public class HomePageTest extends BaseTest {

    HomePage HomePage;
    CommonPage CommonPage;

    @BeforeMethod(alwaysRun = true)
    public void localSetUp(Method method, ITestResult result) {
        setUp(method, result);

        HomePage = new HomePage(getDriver());

    }

    //    @Test
//    public void validatePageHeader() {
//        LogInPage.logIn("standard");
//        Assert.assertEquals(HomePage.headerText.getText(), "Products");
//    }
    @Test
    public void verifyTitle() {
        extentTest.log(LogStatus.INFO, "Verifying title of homepage");
        screenshot.takeScreenshotAndLog();
        Assert.assertEquals(getDriver().getTitle(), "TLA Automation");

    }
}




//    }

