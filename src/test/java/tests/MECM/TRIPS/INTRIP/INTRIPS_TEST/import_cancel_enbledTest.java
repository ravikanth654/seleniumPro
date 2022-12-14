package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

public class import_cancel_enbledTest extends TestInit {
    @Test
    public void import_cancel_enbled() throws Exception {
        ExtentTest t1 = pNode.createNode("import_cancel_enbled ", "import_cancel_enbled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).uploadTrips();

        boolean verify2 = SubFleetsPage.init(t1).CheckCancel();
        if(verify2)
        {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 1)
    public void Cancel_browse()
    {
        ExtentTest t1 = pNode.createNode("Cancel button,verify cancel cancel button click", "verify cancel cancel button click");
        SubFleetsPage.init(t1).cickOnCancel();
    }
}
