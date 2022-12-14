package tests.MECM.ALERTS.VEHICLES_ALERT;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

public class searchIsEnbls_IsDisplayedTest extends TestInit
{
    @Test
    public void searchIsEnbls_IsDisplayed() throws Exception {
        ExtentTest t1 = pNode.createNode("searchIsEnbls_IsDisplayedTest ", "searchIsEnbls_IsDisplayedTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        alerts.init(t1).vehicleALertClick();
        Thread.sleep(2000);

        boolean isIt = SubFleetsPage.init(t1).searchIsDisplayed();
        if (isIt) {
            t1.pass("is displayed");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not displayed");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }

    }
}
