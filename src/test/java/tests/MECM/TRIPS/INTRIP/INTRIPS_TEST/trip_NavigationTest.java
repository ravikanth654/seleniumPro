package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class trip_NavigationTest extends TestInit
{
    @Test
    public void trip_Navigation()throws Exception {
        ExtentTest t1 = pNode.createNode("trip_Navigation", "trip_Navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        Robot robot = new Robot();



        String url = driver.getCurrentUrl();
        String url2 = "trip-management";


        Assertion.verifyContains(url, url2, "Both url same", t1);

    }
}
