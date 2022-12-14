package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkForActiveAndInActiveStatusTest extends TestInit
{
    @Test
    public void checkForActiveAndInActiveStatus()throws Exception {
        ExtentTest t1 = pNode.createNode("checkForActiveAndInActiveStatus", "checkForActiveAndInActiveStatus");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);

        String takeOuterStatus = fleetDriverPage.init(t1).STATUS();
        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);

        String takeInnerStatus = fleetDriverPage.init(t1).inSTATUS();

        if(takeOuterStatus.equals("Active"))
        {
            Assertion.assertEqual(takeInnerStatus,"INACTIVE","same",t1);
        }
        else
        {
            Assertion.assertEqual(takeInnerStatus,"ACTIVE","same",t1);
        }


    }
}
