package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class Table_headingsTest extends TestInit
{
    @Test
    public void Table_headings()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
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


            ArrayList<String> nm = SubFleetsPage.init(t1).TblHeading();
            ArrayList<String> list = new ArrayList<String>();

            list.add("LICENSE PLATE");
            list.add("VIN");
            list.add("MODEL");
            list.add("AVAILABILITY");

            for (String a : list) {
                Assertion.verifyListContains(nm, a, "Comparing Table heading ", t1);

            }
        }
        else
        {
                fleetDriverPage.init(t1).removeVehiclesinEdit();
                Thread.sleep(2000);
                fleetDriverPage.init(t1).assignVehiclesInEdit();

            ArrayList<String> nm = SubFleetsPage.init(t1).TblHeading();
            ArrayList<String> list = new ArrayList<String>();

            list.add("LICENSE PLATE");
            list.add("VIN");
            list.add("MODEL");
            list.add("AVAILABILITY");

            for (String a : list) {
                Assertion.verifyListContains(nm, a, "Comparing Table heading ", t1);

            }
        }
    }
}
