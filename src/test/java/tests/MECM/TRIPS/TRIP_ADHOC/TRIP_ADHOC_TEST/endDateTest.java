package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
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
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(2000);
        String date = inTrips.init(t1).endDateValue();
        System.out.println(date);

        Date datee = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate= formatter.format(datee);
        System.out.println(strDate);

        Assertion.assertEqual(strDate,date,"same",t1);

    }
}
