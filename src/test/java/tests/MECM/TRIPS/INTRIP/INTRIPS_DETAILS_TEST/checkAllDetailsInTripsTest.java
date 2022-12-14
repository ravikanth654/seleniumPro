package tests.MECM.TRIPS.INTRIP.INTRIPS_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class checkAllDetailsInTripsTest extends TestInit
{
    @Test
    public void checkAllDetailsInTrips() throws Exception {
        ExtentTest t1 = pNode.createNode("checkAllDetailsInTrips ", "checkAllDetailsInTrips");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(4000);

        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[10]//i"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);

        String a = inTrips.init(t1).insideTripId();
        System.out.println(a);
        String b = inTrips.init(t1).insideTripScheduled();
        System.out.println(b);
        String c = inTrips.init(t1).insidetripStartTime();
        System.out.println(c);
        String d = inTrips.init(t1).insidetripEndTime();
        System.out.println(d);
        String e = inTrips.init(t1).insideTripType();
        System.out.println(e);
        String f = inTrips.init(t1).insideDropPoints();
        System.out.println(f);
        String g = inTrips.init(t1).insideSource();
        System.out.println(g);

        JavascriptExecutor jss = (JavascriptExecutor) driver;
        WebElement button1 = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        jss.executeScript("arguments[0].click();", button1);
        Thread.sleep(4000);

        String aa = inTrips.init(t1).insideTripId();
        System.out.println(aa);
        String bb = inTrips.init(t1).insideTripScheduled();
        System.out.println(bb);
        String cc = inTrips.init(t1).insidetripStartTime();
        System.out.println(cc);
        String dd = inTrips.init(t1).insidetripEndTime();
        System.out.println(dd);
        String ee = inTrips.init(t1).insideTripType();
        System.out.println(ee);
        String ff = inTrips.init(t1).insideDropPoints();
        System.out.println(ff);
        String gg = inTrips.init(t1).insideSource();
        System.out.println(gg);

        Assertion.verifyEqual(a,aa,"Trip Id",t1);
        Assertion.verifyEqual(b,bb,"Trip Scheduled At",t1);
        Assertion.verifyEqual(c,cc,"Trip Start Time",t1);
        Assertion.verifyEqual(d,dd,"Trip End Time",t1);
        Assertion.verifyEqual(e,ee,"Trip Type",t1);
        Assertion.verifyEqual(f,ff,"Drop Points",t1);
        Assertion.verifyEqual(g,gg,"Source",t1);



    }
}
