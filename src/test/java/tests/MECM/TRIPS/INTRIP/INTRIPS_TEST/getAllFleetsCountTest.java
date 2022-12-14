package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

public class getAllFleetsCountTest extends TestInit
{
    @Test
    public void getallFleetsCount()throws Exception {
        ExtentTest t1 = pNode.createNode("getallFleetsCount", "getallFleetsCount");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(5000);

        String ss = SubFleetsPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);

        inTrips.init(t1).TRIPS();
        int count=inTrips.init(t1).allFleets();
        System.out.println(count);

        Assertion.assertEqual(ttlcnt,count,"check for both count",t1);


    }
}
