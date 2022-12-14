package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_APPROVALS_TRIP_SCHEDULING_Adhoc;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class checkDropDownOptionsTest extends TestInit
{
    @Test
    public void checkDropDownOptions() throws Exception {
        ExtentTest t1 = pNode.createNode("checkDropDownOptions ", "checkDropDownOptions");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(3000);
        ArrayList<String> all = tripAdhoc.init(t1).dropDownOption();
        ArrayList<String> nxt=new ArrayList<>();

        nxt.add("All");
        nxt.add("Requested");
        nxt.add("Approved");

        for(String a:nxt)
        {
            Assertion.verifyListContains(all,a,"Same",t1);
        }
    }
}
