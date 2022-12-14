package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTripNameInPageTest extends TestInit
{
    @Test
    public void checkTripNameInPage()throws Exception {
        ExtentTest t1 = pNode.createNode("checkTripNameInPageTest", "checkTripNameInPageTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        String txt= inTrips.init(t1).ARYAin();

        String txt2="arya";

        Assertion.assertEqual(txt,txt2,"both same",t1);


    }
}
