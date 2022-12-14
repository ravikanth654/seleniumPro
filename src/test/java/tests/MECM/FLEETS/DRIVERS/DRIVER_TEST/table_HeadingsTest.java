package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class table_HeadingsTest extends TestInit
{
    @Test
    public void Table_headings()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);

        ArrayList<String> nm = fleetDriverPage.init(t1).TblHeading();
        ArrayList<String> list=new ArrayList<String>();

        list.add("Sl. No.");
        list.add("NAME");
        list.add("GENDER");
        list.add("DOB");
        list.add("PHONE");
        list.add("SUBFLEET");
        list.add("VEHICLE ASSIGNED");
        list.add("ACTIONS");

        for(String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);

        }
    }
}
