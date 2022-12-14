package framework.features;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import framework.entity.Users;
import framework.pageObjects.Common.login.LoginPage_pg1;
import framework.util.common.Assertion;
import framework.util.common.ConfigInput;
import framework.util.common.DataFactory;
import framework.util.common.DriverFactory;
import framework.util.reportManagement.ScreenShot;
import org.testng.asserts.SoftAssert;
import tests.TestInit;

import java.io.IOException;

public class Login extends TestInit {
    public static ExtentTest pNode;

    public static Login init(ExtentTest t1) {
        pNode = t1;
        return new Login();
    }

    public void validLogin(String user) throws IOException {
        Users us = DataFactory.getUserDetails(user);
        Markup m = MarkupHelper.createLabel("validLogin:"+ us.UN, ExtentColor.TEAL);
        pNode.info(m);
//        ExtentTest t1 = pNode.createNode("Valid login", "Login as: '"+us.UN+"'");
        try {
            DriverFactory.getDriver().get(ConfigInput.URL);

            LoginPage_pg1.init(pNode)
                    .setUserName(us.UN)
                    .setPassword(us.PWD)
                    .clickLogin();
            Thread.sleep(5000);
            String title = driver.getTitle();

            if(title.equals(ConfigInput.title)){
                pNode.pass("Logged in successfully as : '"+us.UN+"'");
                pNode.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
            }
            else {
                pNode.fail("failed to login");
                pNode.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
            }
        } catch (Exception e) {
            Assertion.raiseExceptionAndStop(e, pNode);
        }
    }
}
