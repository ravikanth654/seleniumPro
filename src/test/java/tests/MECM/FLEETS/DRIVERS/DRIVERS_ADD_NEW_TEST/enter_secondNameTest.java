package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

public class enter_secondNameTest extends TestInit
{
    @Test
    public void enter_secondName() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Enter second name ", "second name");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        String s1 = null;
        String m1 = GeneratingRandom.fourchar(s1);
        fleetDriverPage.init(t1).sendSecondName(m1);
        String status="form-control ng-untouched ng-dirty ng-valid";
        String v11 = fleetDriverPage.init(t1).takeAtriSecondName();
        System.out.println(v11);

        Thread.sleep(3000);

        Assertion.assertEqual(v11,status,"Valid second name",t1);
    }
}
