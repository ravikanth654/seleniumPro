package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
//import com.sun.xml.internal.ws.policy.AssertionSet;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class insideFleetTripNavigationTest extends TestInit
{
    @Test
    public void insideFleetTripNavigation()throws Exception {
        ExtentTest t1 = pNode.createNode("insideFleetTripNavigation", "insideFleetTripNavigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS().ARYA();
        String url = driver.getCurrentUrl();

        String trip="arya";

        Assertion.verifyContains(url,trip,"same",t1);



    }
}
