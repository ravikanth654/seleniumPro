package tests.MECM.FLEETS.VEHICLES.VEHICLES_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class editWindowTestModelDisableTest extends TestInit
{
    @Test(priority = 0)
    public void editWindowTestModelDisable() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Testing of edit window Model", "Model");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);
        fleetVehiclesPage.init(t1).edit();
        boolean verify = fleetVehiclesPage.init(t1).varientis();

        if(verify!=true)
        {
            t1.pass("not enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("is enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }
}
