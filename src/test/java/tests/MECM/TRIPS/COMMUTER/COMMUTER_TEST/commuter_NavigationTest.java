package tests.MECM.TRIPS.COMMUTER.COMMUTER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class commuter_NavigationTest extends TestInit {
    @Test
    public void commuter_Navigation() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("commuter_Navigation", "commuter_Navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS().ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(1000);
        String url2 = driver.getCurrentUrl();
        String url = "commuter-list";

        Assertion.verifyContains(url2, url, "Both url is same ", t1);
    }
}