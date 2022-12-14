package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

public class import_checkSubmit_isDisplayedTest extends TestInit {
    @Test
    public void import_checkSubmit_isDisplayed() throws Exception {
        ExtentTest t1 = pNode.createNode("import_checkSubmit_isDisplayed ", "import_checkSubmit_isDisplayed");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).uploadTrips();

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
}}