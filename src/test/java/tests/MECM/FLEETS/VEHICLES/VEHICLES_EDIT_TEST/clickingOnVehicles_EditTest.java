package tests.MECM.FLEETS.VEHICLES.VEHICLES_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.pageObjects.Page_info.Fleet_Vehicles_Page;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class clickingOnVehicles_EditTest extends TestInit
{
    @Test
    public void clickingOnVehicles_edit() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click on vehicle", "clicking on vehicles");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        fleetVehiclesPage.init(t1).edit();
        Thread.sleep(2000);
        String a = fleetVehiclesPage.init(t1).modelheader();

        Assertion.verifyContains(a, "Mahindra", "Page is navigated properly ", t1);
    }

}
