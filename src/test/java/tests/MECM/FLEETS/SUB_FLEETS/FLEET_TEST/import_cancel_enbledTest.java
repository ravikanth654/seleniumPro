package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class import_cancel_enbledTest extends TestInit
{
    @Test(priority = 0)
    public void import_cancel_enbled() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Import button,verify cancel button is enabled", "verify cancel button enabled and clickable ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).imp_click();
        Thread.sleep(2000);

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
