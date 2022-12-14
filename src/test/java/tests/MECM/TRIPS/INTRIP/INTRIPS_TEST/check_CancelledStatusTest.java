package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class check_CancelledStatusTest extends TestInit
{
    ArrayList<String> statusAll = null;
    String statuss = null;
    @Test
    public void check_CancelledStatus() throws Exception
    {
        ExtentTest t1 = pNode.createNode("check_CancelledStatus ", "check_CancelledStatus");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).startDate("12012019");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(6000);

        inTrips.init(t1).filter();
        Thread.sleep(2000);
        inTrips.init(t1).Cancelled();
        Thread.sleep(2000);
        inTrips.init(t1).done();
        Thread.sleep(5000);
        String ss = SubFleetsPage.init(t1).ttl();
        if(ss.equals("-"))
        {
            System.out.println("there are no cancelled trips available ");
            t1.pass("there are no cancelled trips available");
        }
        else {
            Robot robot = new Robot();
            for (int i = 0; i < 6; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SUBTRACT);

            }
            statusAll = inTrips.init(t1).getStatus();
            statuss = "CANCELLED";
            Thread.sleep(2000);
            Assertion.verifyListContains(statusAll, statuss, "check all row status", t1);
        }
    }
}
