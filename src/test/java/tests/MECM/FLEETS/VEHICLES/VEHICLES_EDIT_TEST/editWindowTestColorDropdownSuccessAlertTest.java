package tests.MECM.FLEETS.VEHICLES.VEHICLES_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class editWindowTestColorDropdownSuccessAlertTest extends TestInit {
    @Test
    public void editWindowTestColorDropdownSuccessAlert() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Testing drop down color ", "drop down");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);
        fleetVehiclesPage.init(t1).edit();
        Thread.sleep(1000);
        String clr = fleetVehiclesPage.init(t1).getcolor();
        System.out.println("color=" + clr);
        fleetVehiclesPage.init(t1).clcikColor();
        if (clr.equals("diamond-white")) {
            fleetVehiclesPage.init(t1).clcikRed();
            Thread.sleep(1000);
            String clr2 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color2=" + clr2);
        } else if (clr.equals("desat-silver")) {
            fleetVehiclesPage.init(t1).clckWhite();
            Thread.sleep(1000);
            String clr3 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color3=" + clr3);
        } else {
            fleetVehiclesPage.init(t1).clciksilver();
            Thread.sleep(2000);
            String clr4 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color3=" + clr4);
        }
        Thread.sleep(2000);
        String clrlast = fleetVehiclesPage.init(t1).getcolor();
        fleetVehiclesPage.init(t1).clcikOnSubmit();
        String alrt="vehicle updated successfully!";
        String getalrt = fleetVehiclesPage.init(t1).getVehicleEditAlert();

        Assertion.assertEqual(alrt,getalrt,"successful alert",t1);

    }
}
