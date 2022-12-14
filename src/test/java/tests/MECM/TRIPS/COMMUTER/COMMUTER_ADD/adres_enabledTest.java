package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

public class adres_enabledTest extends TestInit
{
    @Test
    public void adres_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("adres field is enabled ", "adres field is enabled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(2000);
        commuter.init(t1).addCommuter();
        Thread.sleep(2000);

        //fleetDriverPage.init(t1).clcikOnAddDriver();
        boolean isIt =  fleetDriverPage.init(t1).isAdresEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }
}
