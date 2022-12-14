package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class searchBy_tripIdTest extends TestInit {
    @Test(priority = 0)
    public void searchBy_tripID() throws Exception {
        ExtentTest t1 = pNode.createNode("searchBy_tripID ", "searchBy_tripID ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(4000);
        inTrips.init(t1).startDate("10122019");
        Thread.sleep(5000);


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
