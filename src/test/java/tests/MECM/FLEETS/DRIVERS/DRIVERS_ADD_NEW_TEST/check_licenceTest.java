package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

public class check_licenceTest extends TestInit
{
    @Test
    public void check_licence() throws Exception
    {
        ExtentTest t1 = pNode.createNode("check_licence", "check_licence");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        String ln = GeneratingRandom.Vin();
        fleetDriverPage.init(t1).sendLicence(ln);
        String a="form-control ng-untouched ng-dirty ng-valid";
        String aa=fleetDriverPage.init(t1).takeAtriLicence();
        System.out.println(aa);
        Assertion.assertEqual(aa,a,"Valid first name",t1);
    }
}
