package tests.MECM.ALERTS.VEHICLES_ALERT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class startDateTest extends TestInit
{
    @Test
    public void startDate() throws Exception {
        ExtentTest t1 = pNode.createNode("startDateTest ", "startDateTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        alerts.init(t1).vehicleALertClick();
        Thread.sleep(2000);
        inTrips.init(t1).startDate("13122019");
        Thread.sleep(4000);
        String date = inTrips.init(t1).startDateValue();
        System.out.println(date);

        Assertion.assertEqual("2019-12-13", date, "same", t1);
    }
}
