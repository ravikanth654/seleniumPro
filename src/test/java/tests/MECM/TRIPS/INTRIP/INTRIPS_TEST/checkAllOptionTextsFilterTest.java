package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class checkAllOptionTextsFilterTest extends TestInit {
    @Test
    public void checkAllOptionTexts() throws Exception {
        ExtentTest t1 = pNode.createNode("clickingOn_filterTest", "clickingOn_filterTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).filter();
        Thread.sleep(2000);

        ArrayList<String> allText = inTrips.init(t1).allChecksText();
        ArrayList<String> Text = new ArrayList<>();
        Text.add("Completed");
        Text.add("Cancelled");
        Text.add("Ongoing");
        Text.add("Assgined");

        for(String a : Text)
        {
            Assertion.verifyListContains(allText,a,"Comparing Table heading ",t1);

        }




    }
}
