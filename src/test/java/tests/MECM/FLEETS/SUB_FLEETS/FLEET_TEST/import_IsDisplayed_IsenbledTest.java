package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class import_IsDisplayed_IsenbledTest extends TestInit
{
    @Test(priority = 0)
    public void import_button_Displayed() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Import button,verify import button is display", "verify import button enabled and clickable ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        boolean verify = SubFleetsPage.init(t1).import_button();
        if(verify)
        {
            t1.pass("is displayed");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not displayed");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 1)
    public void import_button_enabled() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verify import button is enabled", "verify import button enabled and clickable ");
        boolean verify1 = SubFleetsPage.init(t1).import_button1();
        if(verify1)
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
}
