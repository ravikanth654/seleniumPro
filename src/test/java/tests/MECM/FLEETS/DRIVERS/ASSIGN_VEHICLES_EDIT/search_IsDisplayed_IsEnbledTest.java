package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

public class search_IsDisplayed_IsEnbledTest extends TestInit
{
    @Test(priority = 0)
    public void Search_displayed() throws Exception {
        ExtentTest t1 = pNode.createNode("search is displayed ", "verify search displayed");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);
        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);

        String theText = fleetDriverPage.init(t1).clickOnassignAndRemoveButton();
        Thread.sleep(3000);

        if(theText.equals("ASSIGN VEHICLE")) {
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(2000);


            boolean isIt = fleetVehiclesPage.init(t1).searchIsDisplayed();
            if (isIt) {
                t1.pass("is displayed");
                t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
            } else {
                t1.fail("not displayed");
                t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
            }
        }
        else {

            fleetDriverPage.init(t1).removeVehiclesinEdit();
            Thread.sleep(2000);
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(2000);

            boolean isIt = fleetVehiclesPage.init(t1).searchIsDisplayed();
            if (isIt) {
                t1.pass("is displayed");
                t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
            } else {
                t1.fail("not displayed");
                t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
            }
        }
    }

    @Test(priority = 1)
    public void Search_enabled() throws Exception {
        ExtentTest t1 = pNode.createNode("search is enabled ", "verify search enabled");
        boolean isIt = fleetVehiclesPage.init(t1).searchIsEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }

    }
}
