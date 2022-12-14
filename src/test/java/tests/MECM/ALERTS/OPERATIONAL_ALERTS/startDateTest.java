package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

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
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(2000);
        inTrips.init(t1).startDate("11112018");
        Thread.sleep(4000);
        String date = inTrips.init(t1).startDateValue();
        System.out.println(date);

        Assertion.assertEqual("2018-11-11", date, "same", t1);
    }
}
