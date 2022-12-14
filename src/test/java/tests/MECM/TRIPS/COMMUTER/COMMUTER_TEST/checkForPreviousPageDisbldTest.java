package tests.MECM.TRIPS.COMMUTER.COMMUTER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkForPreviousPageDisbldTest extends TestInit
{
    @Test
    public void checkForPreviousPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for previous page is disabled ", "check for previous page is disabled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(4000);


        String state = fleetDriverPage.init(t1).getdisbledPageStatusprevious();
        System.out.println(state);
        String a = "pagination-previous disabled";

        Assertion.assertEqual(state, a, "previous page is disabled", t1);
    }
}
