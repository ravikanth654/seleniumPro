package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
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
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
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
