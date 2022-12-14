package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkPlaceHolderTextInsideSearchBoxTest extends TestInit {
    @Test
    public void checkPlaceHolderTextInsideSearchBox() throws Exception {
        ExtentTest t1 = pNode.createNode("checkPlaceHolderTextInsideSearchBoxTest ", "checkPlaceHolderTextInsideSearchBoxTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();

        String plholder=SubFleetsPage.init(t1).getplaceHolder();
        System.out.println(plholder);

        Assertion.assertEqual(plholder,"Search by Trip Id","place holder",t1);
    }
}
