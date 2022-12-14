package tests.MECM.ALERTS.VEHICLES_ALERT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class endDateTest extends TestInit
{
    @Test
    public void endDate() throws Exception {
        ExtentTest t1 = pNode.createNode("endDateTest ", "endDateTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        alerts.init(t1).vehicleALertClick();
        Thread.sleep(2000);
        String date = inTrips.init(t1).endDateValue();
        System.out.println(date);

        Date datee = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(datee);
        System.out.println(strDate);

        Assertion.assertEqual(strDate, date, "same", t1);

    }
}
