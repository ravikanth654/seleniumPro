package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class clickingBack_PageNavigationTest extends TestInit {
    @Test
    public void clickingOnBack() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("clicking on back", "clicking on back");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        fleetVehiclesPage.init(t1).rowClick();
        Thread.sleep(2000);
        fleetVehiclesPage.init(t1).backClicks();
        String url = driver.getCurrentUrl();

        String url2="https://stg-nemo.mahindraelectric.com/mcms/vehicles";

        Assertion.assertEqual(url,url2,"page navigation",t1);

    }
}
