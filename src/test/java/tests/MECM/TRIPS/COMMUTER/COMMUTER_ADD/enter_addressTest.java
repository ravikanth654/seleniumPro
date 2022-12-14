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

public class enter_addressTest extends TestInit
{
    @Test
    public void enter_address() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter_address ", "enter_address");
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

        String s1 = "ramanagar";
        fleetDriverPage.init(t1).adres(s1);
        String a="form-control ng-untouched ng-dirty ng-valid";
        //form-control ng-dirty ng-valid ng-touched
        //form-control ng-dirty ng-valid ng-touched
        String aa=fleetDriverPage.init(t1).takeAtriAdress();
        System.out.println(aa);
        Assertion.assertEqual(aa,a,"Valid adress name",t1);
    }
}
