package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class selectedVehicleDriverlist_TableColumnsTest extends TestInit
{
    @Test(priority = 0)
    public void selectedVehicleDriverlist_TableColumns()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings of No of Vehicles Selected:", "verify table headings");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).clcikonfleet();
        ArrayList<String> nm = SubFleetsPage.init(t1).VehiclTblHeading();
        ArrayList<String> list = new ArrayList<String>();

        list.add("Sl. No.");
        list.add("VIN");
        list.add("LICENSE PLATE");
        list.add("MODEL");

        for (String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);
            System.out.println(a);
        }
    }

    @Test(priority = 1)
    public void driverTable_columns()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings of No of Vehicles Selected:", "verify table headings");
        ArrayList<String> nm = SubFleetsPage.init(t1).driverTblHeading();
        ArrayList<String> list = new ArrayList<String>();

        list.add("Sl. No.");
        list.add("DRIVER NAME");
        list.add("EMAIL");
        list.add("MOBILE");

        for (String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);
            System.out.println(a);
        }
    }

}
