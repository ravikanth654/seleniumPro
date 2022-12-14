package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
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
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);

        inTrips.init(t1).startDate("13122019");
        Thread.sleep(4000);
        String date = inTrips.init(t1).startDateValue();
        System.out.println(date);

        Assertion.assertEqual("2019-12-13",date,"same",t1);


    }
}
