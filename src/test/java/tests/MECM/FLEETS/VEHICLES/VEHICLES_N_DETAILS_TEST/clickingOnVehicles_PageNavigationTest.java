package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class clickingOnVehicles_PageNavigationTest extends TestInit
{
    @Test
    public void clickingOnVehicles() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Click on vehicle", "clicking on vehicles");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);
        fleetVehiclesPage aa = fleetVehiclesPage.init(t1).clcikVehicl();
        String urlVehicle = driver.getCurrentUrl();

        Assertion.verifyContains(urlVehicle, "vehicles", "Page is navigated properly ", t1);
    }

}
