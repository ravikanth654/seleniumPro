package tests.MECM.ALERTS.VEHICLES_ALERT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkPlaceHolderTextInsideSearchBoxTest extends TestInit
{
    @Test
    public void checkPlaceHolder()throws Exception {
        ExtentTest t1 = pNode.createNode("checkPlaceHolder", "checkPlaceHolder");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        alerts.init(t1).vehicleALertClick();
        Thread.sleep(2000);
        String plholder=SubFleetsPage.init(t1).getplaceHolder();
        System.out.println(plholder);

        Assertion.assertEqual(plholder,"Search by description","place holder",t1);

    }
}
