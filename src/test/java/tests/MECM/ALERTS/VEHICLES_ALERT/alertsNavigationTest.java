package tests.MECM.ALERTS.VEHICLES_ALERT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class alertsNavigationTest extends TestInit
{
    @Test
    public void alertsNavigation() throws Exception {
        ExtentTest t1 = pNode.createNode("alertsNavigationTest ", "alertsNavigationTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        String s="alert";
        String url = driver.getCurrentUrl();

        Assertion.verifyContains(url,s,"URL comapre ",t1);

    }
}
