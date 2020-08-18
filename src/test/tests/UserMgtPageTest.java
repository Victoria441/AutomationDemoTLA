package tests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.UserMgtPage;
import pojos.UserTLA;

import java.lang.reflect.Method;

public class UserMgtPageTest extends BaseTest {
   CommonPage commonPage;
    UserMgtPage userMgtPage;
    UserTLA userTLA;

    @BeforeMethod
    public void setUp(Method method, ITestResult iTestResult) {
        super.setUp(method, iTestResult);
        commonPage = new CommonPage(getDriver());
        userMgtPage = new UserMgtPage(getDriver());
        commonPage.clickNavBtn("User-Mgt");
        userTLA = new UserTLA();
    }
    @Test(description = "Verifying title of User Management Page")
    public void verifyTitle(){
        Assert.assertEquals(getDriver().getTitle(), "Register New User");
        screenshot.takeScreenshotAndLog();


    }
    @Test(description = "Validating <Login> and <Access DB> buttons")
    public void verifyLoginAccessDB_buttons(){
        Assert.assertTrue(userMgtPage.accessBtn.isDisplayed());
        Assert.assertTrue(userMgtPage.loginBtn.isDisplayed());
        screenshot.takeScreenshotAndLog();
    }
    @Test(description = "Testing Registration Form fields")
    public void verifyRgtForm(){
        commonPage.clickNavBtn("User-Mgt");
        for(String field: userMgtPage.registrationFormField){
            Assert.assertTrue(userMgtPage.findById(field).isDisplayed());
            extentTest.log(LogStatus.PASS, commonPage.findById(field).getAttribute("name") + "was displayed");

        }
        screenshot.takeScreenshotAndLog();
    }
    @Test(description = "Verifying Data Table is Empty")
    public void verifyDataTableEmpty(){
        userMgtPage.moveIntoView(userMgtPage.dataTable);
        screenshot.takeScreenshotAndLog();
        Assert.assertEquals(userMgtPage.dataTable.getText().length(), 0);
        extentTest.log(LogStatus.PASS, "Tested Table Data: " + userMgtPage.dataTable.getText() + " - with success");
    }

    @Test(description = "verifying filling and deleting")
    public void verifyingFormsAndDelete() {
        commonPage.fieldTheForm(userTLA.getFirstName(), userTLA.getLastName(), userTLA.getPhoneNumber(), userTLA.getEmail());
        commonPage.selectByText("Student");
        userMgtPage.click(userMgtPage.submitBtn);
        userMgtPage.moveIntoView(userMgtPage.dataTable);
        screenshot.takeScreenshotAndLog();

        }
        @Test(description = "verifying if table is clear")
    public void verifyingClearTable(){
        userMgtPage.click(userMgtPage.clearBtn);
            userMgtPage.moveIntoView(userMgtPage.dataTable);
            screenshot.takeScreenshotAndLog();

        }

    }



