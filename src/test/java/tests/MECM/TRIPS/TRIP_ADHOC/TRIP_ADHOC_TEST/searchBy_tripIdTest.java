package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class searchBy_tripIdTest extends TestInit
{
    @Test
    public void searchBy_tripID() throws Exception {
        ExtentTest t1 = pNode.createNode("searchBy_tripID ", "searchBy_tripID");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);
        inTrips.init(t1).startDate("25022020");
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        String s1 = SubFleetsPage.init(t1).getTripId();
        System.out.println(s1);
        SubFleetsPage.init(t1).search_sendvalue(s1)
                .clickSearch();
        Thread.sleep(1000);
        String s2 = SubFleetsPage.init(t1).getFirstRowTripId();
        System.out.println(s2);


        Assertion.assertEqual(s1, s2, "Verifying the value", t1);

    }
}
