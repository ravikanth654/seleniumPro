package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkPreviousPage_Disabled_DriverTest extends TestInit
{
    @Test
    public void checkForPreviousPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for previous page is disabled ", "check for previous page is disabled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(2000);

        String state = fleetDriverPage.init(t1).getdisbledPageStatusprevious();
        System.out.println(state);
        String a = "pagination-previous disabled";

        Assertion.assertEqual(state, a, "previous page is disabled", t1);
    }
}
