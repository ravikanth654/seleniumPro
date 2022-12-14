package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_APPROVALS_TRIP_SCHEDULING_Adhoc;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class requestedCardDetailsTest extends TestInit
{
    @Test
    public void requestedCardDetails() throws Exception {
        ExtentTest t1 = pNode.createNode("requestedCardDetails ", "requestedCardDetails");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(3000);
        Select sl=new Select(driver.findElement(By.xpath("//div//select")));
        sl.selectByVisibleText("Requested");
        Thread.sleep(2000);
        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
        Thread.sleep(3000);

        String a = tripAdhoc.init(t1).employeeName();
        System.out.println(a);
        String b = tripAdhoc.init(t1).employeeId();
        System.out.println(b);
        String c = tripAdhoc.init(t1).tripIdd();
        System.out.println(c);
        String d = tripAdhoc.init(t1).tripTime();
        System.out.println(d);
        String e = tripAdhoc.init(t1).tripSource();
        System.out.println(e);
        String f = tripAdhoc.init(t1).tripDestination();
        System.out.println(f);
        String g = tripAdhoc.init(t1).tripDistance();
        System.out.println(g);

        tripAdhoc.init(t1).clickOncard();
        Thread.sleep(4000);

        String aa = tripAdhoc.init(t1).inName();
        System.out.println(aa);
        String bb = tripAdhoc.init(t1).inId();
        System.out.println(bb);
        String cc = tripAdhoc.init(t1).inTripId();
        String[] splited = cc.split("\\s+");
        String split = splited[3];
        System.out.println(split);
        String dd = tripAdhoc.init(t1).intripStartTime();
        System.out.println(dd);
        String ee = tripAdhoc.init(t1).inSource();
        System.out.println(ee);
        String ff = tripAdhoc.init(t1).inDestination();
        System.out.println(ff);
        String gg = tripAdhoc.init(t1).intripDistance();
        System.out.println(gg);
        String hh = tripAdhoc.init(t1).intripPurpose();
        System.out.println(hh);
        String ii = tripAdhoc.init(t1).intripType();
        System.out.println(ii);

        Assertion.verifyEqual(a,aa,"name",t1);
        Assertion.verifyEqual(b,bb,"emp id",t1);
        Assertion.verifyEqual(c,split,"trip id",t1);
        Assertion.verifyEqual(d,dd,"trip time",t1);
        Assertion.verifyEqual(e,ee,"trip source",t1);
        Assertion.verifyEqual(f,ff,"destination ",t1);
        Assertion.verifyEqual(g,gg,"distance",t1);

    }
}
