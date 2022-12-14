package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class clickingOn_filterTest extends TestInit
{
    @Test
    public void clickingOn_filter()throws Exception {
        ExtentTest t1 = pNode.createNode("clickingOn_filterTest", "clickingOn_filterTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).filter();
        Thread.sleep(2000);
        String popUp = inTrips.init(t1).popUpHeading();
        String heading="select the trips status which you wish to see";

        Assertion.assertEqual(popUp,heading,"clickingOn_filterTest ",t1);
    }
}
