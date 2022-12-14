package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class checkHeadingTripIdTest extends TestInit
{
    @Test
    public void checkHeadingTripId() throws Exception {
        ExtentTest t1 = pNode.createNode("checkHeadingTripId ", "checkHeadingTripId");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);

        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);

        }

        String id = inTrips.init(t1).getTripId();
        System.out.println(id);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[2]"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);

        String idd = inTrips.init(t1).headingId();
        String[] splited = idd.split("\\s+");
        String hd = splited[3];
        System.out.println(hd);

        Assertion.assertEqual(id,hd,"both are matching ",t1);
    }
}
