package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class import_checkSubmit_isDisplayedTest extends TestInit
{
    @Test
    public void import_checkSubmit_isDisplayed() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Import button,verify submit button is display", "verify submit button is display ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).imp_click();
        Thread.sleep(2000);

        boolean checksbmt = SubFleetsPage.init(t1).CheckSubmit();
        if(checksbmt)
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
}
