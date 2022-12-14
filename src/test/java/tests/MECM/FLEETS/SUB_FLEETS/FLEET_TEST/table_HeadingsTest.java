package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
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
        Thread.sleep(1000);

        ArrayList<String> nm = SubFleetsPage.init(t1).TblHeading();
        ArrayList<String> list=new ArrayList<String>();

        list.add("Sl. No.");
        list.add("SUBFLEET NAME");
        list.add("ADDRESS");
        list.add("EMAIL");
        list.add("NO. OF VEHICLES");
        list.add("NO. OF DRIVERS");
        list.add("STATUS");
        list.add("ACTIONS");

        for(String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);

        }
    }
}
