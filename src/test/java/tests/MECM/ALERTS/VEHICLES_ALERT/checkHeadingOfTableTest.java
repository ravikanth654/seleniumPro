package tests.MECM.ALERTS.VEHICLES_ALERT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkHeadingOfTableTest extends TestInit
{
    @Test
    public void checkHeadingOfTable() throws Exception {
        ExtentTest t1 = pNode.createNode("checkHeadingOfTableTest ", "checkHeadingOfTableTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        alerts.init(t1).vehicleALertClick();
        String s = "LIST OF VEHICLE ALERTS";
        String txt = alerts.init(t1).listOfVehiclAlertsTExt();

        Assertion.assertEqual(txt,s,"same",t1);

    }
}
