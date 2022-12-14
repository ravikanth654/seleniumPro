package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class click_exprDateTest extends TestInit
{
    @Test
    public void click_exprDate() throws Exception
    {
        ExtentTest t1 = pNode.createNode("click_exprDate ", "click_exprDate ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        String s1 = "12122020";
        fleetDriverPage.init(t1).exprdate(s1);
        Thread.sleep(3000);
        String a="form-control ng-untouched ng-dirty ng-valid";
        String aa=fleetDriverPage.init(t1).takeAtriExprDate();
        System.out.println(aa);
        Assertion.assertEqual(aa,a,"Valid first name",t1);

    }
}
