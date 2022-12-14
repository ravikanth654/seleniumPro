package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkPreviousPage_DisabledTest extends TestInit
{
    @Test
    public void checkForPreviousPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for previous page is disabled ", "check for previous page is disabled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(5000);

        String state = SubFleetsPage.init(t1).getdisbledPageStatusprevious();
        System.out.println(state);
        String a = "pagination-previous disabled";

        Assertion.assertEqual(state, a, "previous page is disabled", t1);
    }
}
