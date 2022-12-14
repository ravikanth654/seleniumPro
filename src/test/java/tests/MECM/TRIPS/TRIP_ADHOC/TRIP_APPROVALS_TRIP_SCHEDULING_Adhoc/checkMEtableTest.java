package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_APPROVALS_TRIP_SCHEDULING_Adhoc;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class checkMEtableTest extends TestInit
{
    @Test
    public void checkMEtable() throws Exception {
        ExtentTest t1 = pNode.createNode("checkMEtable ", "checkMEtable");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(3000);
        Select sl = new Select(driver.findElement(By.xpath("//div//select")));
        sl.selectByVisibleText("Approved");
        Thread.sleep(2000);
        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
        Thread.sleep(2000);
        tripAdhoc.init(t1).clickOncard();
        Thread.sleep(2000);
        ArrayList<String> values = tripAdhoc.init(t1).assignTable();
        ArrayList<String> txt=new ArrayList<>();
        txt.add("REGISTRATION");
        txt.add("VIN");
        txt.add("SOC IN %");
        txt.add("LAST CONNECTED");

        for(String a:txt)
        {
            Assertion.verifyListContains(values,a,"Values same",t1);
        }
    }
}
