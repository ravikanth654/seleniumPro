package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTotalEntries_withTotalNumOfFleets_DriversTest extends TestInit
{
    @Test
    public void checkTotalEntries() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Check total entries ", "Check total entries");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(6000);
        String ss = fleetDriverPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        String t = fleetDriverPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int sss = Integer.parseInt(s);
        System.out.println("row2 " + ss);

        Assertion.assertEqual(ttlcnt, sss, "Verifying total entries", t1);
    }
}
