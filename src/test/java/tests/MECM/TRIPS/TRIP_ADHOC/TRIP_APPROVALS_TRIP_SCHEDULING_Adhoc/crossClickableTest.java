package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_APPROVALS_TRIP_SCHEDULING_Adhoc;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;

public class crossClickableTest extends TestInit
{
    @Test
    public void crossClickable() throws Exception {
        ExtentTest t1 = pNode.createNode("crossClickable ", "crossClickable");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(3000);

        tripAdhoc.init(t1).clickOncard();
        Thread.sleep(4000);
        String tagname=driver.findElement(By.xpath("//button[@aria-label='Close']")).getTagName();

        Assertion.assertEqual(tagname,"button","same",t1);

    }
}
