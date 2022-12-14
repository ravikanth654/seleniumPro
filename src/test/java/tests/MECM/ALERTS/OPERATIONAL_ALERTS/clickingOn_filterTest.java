package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class clickingOn_filterTest extends TestInit
{
    @Test
    public void clickingOn_filter()throws Exception {
        ExtentTest t1 = pNode.createNode("clickingOn_filterTest", "clickingOn_filterTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(2000);
        inTrips.init(t1).filter();
        Thread.sleep(2000);
        String popUp = inTrips.init(t1).popUpHeading();
        String heading="Select the fields which you wish to see alerts";

        Assertion.assertEqual(popUp,heading,"navigating ",t1);
    }
}
