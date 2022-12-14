package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;

import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.excelReaderInvalidMobile;

import java.util.ArrayList;

public class enter_inValidmobileTest extends TestInit
{
    @Test
    public void enter_inValidmobile() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter invalid mobile ", "invalid mobile number ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        ArrayList<String> invalidMobile = excelReaderInvalidMobile.GetData("InvalidMobileData");
        String status="form-control ng-untouched ng-invalid ng-dirty";
        fleetDriverPage.init(t1).clearMobdata();
        for(int i=1;i<5;i++)
        {
            String yes = invalidMobile.get(i);
            Thread.sleep(1000);
            fleetDriverPage.init(t1).sendMobilenumber(yes);
            Thread.sleep(1000);
            String v11 = fleetDriverPage.init(t1).takeAtriMobile();
            Thread.sleep(1000);
            Assertion.assertEqual(v11,status,"Valid first name",t1);
            fleetDriverPage.init(t1).clearMobdata();

        }
    }
}
