package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

public class search_IsDisplayed_IsEnbledTest extends TestInit
{
    @Test
    public void search_IsDisplayed_IsEnbled() throws Exception {
        ExtentTest t1 = pNode.createNode("search_IsDisplayed_IsEnbled ", "search_IsDisplayed_IsEnbled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);

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
