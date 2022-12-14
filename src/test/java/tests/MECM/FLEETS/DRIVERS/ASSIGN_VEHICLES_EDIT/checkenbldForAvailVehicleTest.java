package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkenbldForAvailVehicleTest extends TestInit
{
    @Test
    public void checkenbldForAvailVehicle()throws Exception {
        ExtentTest t1 = pNode.createNode("checkenbldForAvailVehicle", "checkenbldForAvailVehicle");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);
        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);
        String theText = fleetDriverPage.init(t1).clickOnassignAndRemoveButton();
        Thread.sleep(3000);

        if(theText.equals("ASSIGN VEHICLE")) {
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(2000);

            boolean isnot = fleetDriverPage.init(t1).isenbld();
            System.out.println(isnot);

            Assertion.assertEqual(isnot, true, "yes its enbld", t1);
        }
        else
        {

                fleetDriverPage.init(t1).removeVehiclesinEdit();
                Thread.sleep(2000);
                fleetDriverPage.init(t1).assignVehiclesInEdit();
                Thread.sleep(2000);

                boolean isnot = fleetDriverPage.init(t1).isenbld();
                System.out.println(isnot);

                Assertion.assertEqual(isnot, true, "yes its enbld", t1);
        }

    }
}
