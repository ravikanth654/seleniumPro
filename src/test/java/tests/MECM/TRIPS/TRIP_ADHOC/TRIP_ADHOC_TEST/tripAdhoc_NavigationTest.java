package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class tripAdhoc_NavigationTest extends TestInit
{

    @Test
    public void tripAdhoc_Navigation() throws Exception {
        ExtentTest t1 = pNode.createNode("tripAdhoc_Navigation ", "tripAdhoc_Navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        String url="trip-adhoc";
        String url1 = driver.getCurrentUrl();

        Assertion.verifyContains(url1,url,"both url same",t1);


    }
}
