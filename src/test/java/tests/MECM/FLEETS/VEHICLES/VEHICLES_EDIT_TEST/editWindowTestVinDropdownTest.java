package tests.MECM.FLEETS.VEHICLES.VEHICLES_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class editWindowTestVinDropdownTest extends TestInit
{
    @Test(priority = 0)
    public void editWindowTestVinDropdown() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Testing drop down Vin ", "drop down");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);
        fleetVehiclesPage.init(t1).edit();
        Thread.sleep(1000);
        //fleetVehiclesPage.init(t1).edit();
        String aa = GeneratingRandom.Vin();
        fleetVehiclesPage.init(t1).clearVin();
        fleetVehiclesPage.init(t1).sendVin(aa);
        Thread.sleep(1000);
        String now = fleetVehiclesPage.init(t1).inregnum();
        System.out.println("this is now "+now);
        fleetVehiclesPage.init(t1).clcikOnSubmit();
        String alrt="vehicle updated successfully!";
        //fleetVehiclesPage.init(t1).clcikOncancel();
        String getalrt = fleetVehiclesPage.init(t1).getVehicleEditAlert();
        driver.navigate().refresh();
        Thread.sleep(4000);
        String inTab = fleetVehiclesPage.init(t1).takereg();
        System.out.println("inTab "+inTab);

        Assertion.assertEqual(now,inTab,"vin update",t1);
        Assertion.assertEqual(alrt,getalrt,"successful alert",t1);
    }
}
