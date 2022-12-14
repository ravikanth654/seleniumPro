package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.testng.annotations.Test;
import tests.TestInit;

public class searchBy_LicensePlate_N_VINTest extends TestInit
{
    @Test(priority = 0)
    public void Search_byLicencePlate() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By licence plate ", "Search by licence plate ");
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

            String s1 = fleetVehiclesPage.init(t1).getFirstRowLicencePlate();
            System.out.println(s1);
            fleetVehiclesPage.init(t1).search_sendvalue(s1);
            fleetVehiclesPage.init(t1).clickSearch();
            Thread.sleep(1000);
            String s2 = fleetVehiclesPage.init(t1).getFirstRowLicencePlate();
            System.out.println(s2);

            Assertion.assertEqual(s1, s2, "Verifing the value", t1);
           /* fleetVehiclesPage.init(t1).clickSearch();
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,-250)");
            fleetVehiclesPage.init(t1).clcikOncancel();
            fleetDriverPage.init(t1).driverEdit();
            Thread.sleep(2000);
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(2000);*/
        }
        else
            {
                fleetDriverPage.init(t1).removeVehiclesinEdit();
                Thread.sleep(2000);
                fleetDriverPage.init(t1).assignVehiclesInEdit();

                String s1 = fleetVehiclesPage.init(t1).getFirstRowLicencePlate();
                System.out.println(s1);
                fleetVehiclesPage.init(t1).search_sendvalue(s1);
                fleetVehiclesPage.init(t1).clickSearch();
                Thread.sleep(1000);
                String s2 = fleetVehiclesPage.init(t1).getFirstRowLicencePlate();
                System.out.println(s2);

                Assertion.assertEqual(s1, s2, "Verifing the value", t1);

            }
    }


}
