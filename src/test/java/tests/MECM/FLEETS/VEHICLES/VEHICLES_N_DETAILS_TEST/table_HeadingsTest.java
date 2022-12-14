package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class table_HeadingsTest extends TestInit {

    @Test
    public void Table_headings() throws Exception {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(1000);

        ArrayList<String> nm = fleetVehiclesPage.init(t1).TblHeading();
        ArrayList<String> list = new ArrayList<String>();

        list.add("Sl. No.");
        list.add("LICENSE PLATE/ VIN");
        list.add("VIN");
        list.add("MODEL");
        list.add("AVAILABILITY");
        list.add("SOC %");
        list.add("AC STATUS");
        list.add("LAST CONNECTED");
        list.add("ACTIONS");


        for (String a : list) {
            Assertion.verifyListContains(nm, a, "Comparing Table heading ", t1);

        }
    }

}