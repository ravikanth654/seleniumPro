package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class pageNavigationClickingOnAssignTest extends TestInit
{
    @Test
    public void pageNavigationClickingOnAssign() throws IOException, InterruptedException {

        ExtentTest t1 = pNode.createNode("pageNavigationClickingOnAssign ", "pageNavigationClickingOnAssign");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);
        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);


        String theText = fleetDriverPage.init(t1).clickOnassignAndRemoveButton();
        Thread.sleep(3000);

        if(theText.equals("ASSIGN VEHICLE")) {
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(2000);

            String yes = fleetDriverPage.init(t1).tableHeadingAssignVehicle();
            String yes1 = "Select the Vehicle";

            Assertion.assertEqual(yes, yes1, "page navigated", t1);
        }
        else
        {

            fleetDriverPage.init(t1).removeVehiclesinEdit();
            Thread.sleep(2000);
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(2000);

            String yes = fleetDriverPage.init(t1).tableHeadingAssignVehicle();
            String yes1 = "Select the Vehicle";

            Assertion.assertEqual(yes, yes1, "page navigated", t1);
        }
    }
}
