package tests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DataBasePage;
import pages.UserMgtPage;
import pojos.UserTLA;
import sun.nio.cs.ext.DoubleByte;

import java.lang.reflect.Method;

public class DataBasePageTest extends BaseTest {
    CommonPage commonPage;
    UserMgtPage userMgtPage;
    UserTLA userTLA;
    DataBasePage dataBasePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method, ITestResult iTestResult) {
        super.setUp(method, iTestResult);
        commonPage = new CommonPage(getDriver());
        userMgtPage = new UserMgtPage(getDriver());
        commonPage.clickNavBtn("User-Mgt");
//        userTLA = new UserTLA();
       dataBasePage = new DataBasePage(getDriver());


    }
    @Test(description = "verify title of the page is User DB")
    public void verifyingUserDBTittle() {
        dataBasePage.click(userMgtPage.accessBtn);
        dataBasePage.waitForPageToLoad();
        dataBasePage.handleWindow();
        Assert.assertEquals(getDriver().getTitle(), "User DB");
        extentTest.log(LogStatus.INFO, "verify title in User DB page");
        screenshot.takeScreenshotAndLog();

    }

}
