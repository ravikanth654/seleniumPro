package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTotalEntriesTest extends TestInit
{
    @Test
    public void checkTotalEntries()throws Exception {
        ExtentTest t1 = pNode.createNode("checkTotalEntries", "checkTotalEntries");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(5000);
        inTrips.init(t1).startDate("10122019");
        Thread.sleep(7000);
        String ss = SubFleetsPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int sss = Integer.parseInt(s);
        System.out.println("row2 " + sss);

        Assertion.assertEqual(s,ss, "Verifying total entries", t1);
    }



}
