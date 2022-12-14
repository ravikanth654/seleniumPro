package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTotalEntries_withTotalNumOfFleetsTest extends TestInit
{
    @Test
    public void checkTotalEntries() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Check total entries ", "Check total entries");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(7000);


        String ss = fleetVehiclesPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        String t = fleetVehiclesPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int sss = Integer.parseInt(s);
        System.out.println("row2 " + ss);

        Assertion.assertEqual(ttlcnt, sss, "Verifying total entries", t1);
    }

}
