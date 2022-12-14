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

public class checkTotalEntriesTest extends TestInit
{
    @Test
    public void checkTotalEntries() throws Exception
    {
        ExtentTest t1 = pNode.createNode("checkTotalEntries ", "Check total entries");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();

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
