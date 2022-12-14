package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class checkTableHeadingsTest extends TestInit
{
    @Test
    public void Table_headings() throws Exception {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();

        ArrayList<String> nm = fleetVehiclesPage.init(t1).TblHeading();
        System.out.println(nm);
        ArrayList<String> list = new ArrayList<String>();

        list.add("Fleet");
        list.add("Fleet Size");
        list.add("Kms Driven");
        list.add("Vehicles Connected");
        list.add("Drive State");

        for (String a : list)
        {
            Assertion.verifyListContains(nm, a, "Comparing Table heading ", t1);

        }

    }
}
