package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.testng.annotations.Test;
import tests.TestInit;

public class successMessageChangingStatusActive_InactiveTest extends TestInit
{
    @Test
    public void successMessageChangingStatusActive_Inactive()throws Exception {
        ExtentTest t1 = pNode.createNode("successMessageChangingStatusActive_Inactive", "successMessageChangingStatusActive_Inactive");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);


        String stateenbl="driver inactivated successfully!!";
        String statedsbl="driver activated successfully!!";

        String takeOuterStatus = fleetDriverPage.init(t1).STATUS();
        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);

        String takeInnerStatus = fleetDriverPage.init(t1).inSTATUS();
        String getStatus = fleetDriverPage.init(t1).getCurrentStatusOfAssigningVehicles();

        if(takeInnerStatus.equals("INACTIVE")) {
            if (getStatus.equals("REMOVE VEHICLE")) {

                fleetDriverPage.init(t1).inSTATUSClick();
                String status = SubFleetsPage.init(t1).getStatusAlert();
                Assertion.assertEqual(status, "remove vehicle mapping from driver to deactivate driver.", " status successful message", t1);

            } else {
                fleetDriverPage.init(t1).inSTATUSClick();
                String status = SubFleetsPage.init(t1).getStatusAlert();
                Assertion.assertEqual(status, statedsbl, " status successful message", t1);
            }
        }
        else
        {
            if (getStatus.equals("REMOVE VEHICLE")) {

                fleetDriverPage.init(t1).inSTATUSClick();
                String status = SubFleetsPage.init(t1).getStatusAlert();
                Assertion.assertEqual(status, "remove vehicle mapping from driver to deactivate driver.", " status successful message", t1);

            } else {
                fleetDriverPage.init(t1).inSTATUSClick();
                String status = SubFleetsPage.init(t1).getStatusAlert();
                Assertion.assertEqual(status, stateenbl, " status successful message", t1);
            }
        }


    }
}
