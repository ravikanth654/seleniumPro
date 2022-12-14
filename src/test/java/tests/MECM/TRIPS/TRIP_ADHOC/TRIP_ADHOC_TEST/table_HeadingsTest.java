package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
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
        SubFleetsPage.init(t1).mobility();

        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();

        ArrayList<String> nm = SubFleetsPage.init(t1).TblHeading();
        ArrayList<String> list=new ArrayList<String>();

        list.add("Sl. No.");
        list.add("TRIP ID");
        list.add("TRIP TYPE");
        list.add("TRIP START TIME");
        list.add("EMPLOYEE NAME");
        list.add("AGENCY NAME");
        list.add("VEHICLE ASSIGNED");
        list.add("DRIVER NAME");
        list.add("DRIVER PHONE");
        list.add("TRIP STATUS");

        for(String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);

        }
    }
}
