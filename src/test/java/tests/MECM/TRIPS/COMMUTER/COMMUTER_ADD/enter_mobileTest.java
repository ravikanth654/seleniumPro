package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

public class enter_mobileTest extends TestInit
{
    @Test
    public void enter_mobile() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter mobile ", "mobile number ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(2000);
        commuter.init(t1).addCommuter();
        Thread.sleep(2000);

        String s = null;
        String s1 = GeneratingRandom.tenNumber(s);
        Thread.sleep(1000);
        fleetDriverPage.init(t1).sendMobilenumber(s1);
        Thread.sleep(1000);
        String status="form-control ng-untouched ng-dirty ng-valid";
        String v11 = fleetDriverPage.init(t1).takeAtriMobile();
        Thread.sleep(1000);
        System.out.println(v11);

        Assertion.assertEqual(v11,status,"Valid first name",t1);
    }
}
