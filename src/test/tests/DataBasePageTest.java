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
//    UserTLA userTLA;
    DataBasePage dataBasePage;

    @BeforeMethod
    public void setUp(Method method, ITestResult iTestResult) {
        super.setUp(method, iTestResult);
        commonPage = new CommonPage(getDriver());
        userMgtPage = new UserMgtPage(getDriver());
        commonPage.clickNavBtn("User-Mgt");
//        userTLA = new UserTLA();
       dataBasePage = new DataBasePage(getDriver());


    }
    @Test(description = "verify title of the page is User DB")
    public void verifyingUserDBTittle(){
        userMgtPage.click(userMgtPage.accessBtn);
        extentTest.log(LogStatus.INFO, "Verifying User DataBase");
        Assert.assertEquals(getDriver().getTitle(), "User Database");
        screenshot.takeScreenshotAndLog();

    }
    @Test(description = "verify all fields in registration form are present as table row headers")
   public void verifyingFieldsForms(){

    }

}
