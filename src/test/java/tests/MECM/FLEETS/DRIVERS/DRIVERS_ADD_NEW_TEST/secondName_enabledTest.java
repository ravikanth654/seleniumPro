package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

public class secondName_enabledTest extends TestInit
{
    @Test
    public void second_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("second name text feild is enabled ", "second name text feild is enabled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        boolean isIt =  fleetDriverPage.init(t1).issecondNameEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }
}
