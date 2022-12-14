package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTripNameInPageTest extends TestInit
{
    @Test
    public void checkTripNameInPage()throws Exception {
        ExtentTest t1 = pNode.createNode("checkTripNameInPageTest", "checkTripNameInPageTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(2000);
        String txt = inTrips.init(t1).ARYAin();

        String txt2 = "MECM";

        Assertion.assertEqual(txt, txt2, "both same", t1);
    }

    }
