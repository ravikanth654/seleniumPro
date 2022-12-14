package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_APPROVALS_TRIP_SCHEDULING_Adhoc;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class checkAssigningME_E2eTest extends TestInit
{
    String rgno=null;
    String tripIdd;
    @Test(priority = 0)
    public void checkAssigningME_E2E() throws Exception {
        ExtentTest t1 = pNode.createNode("checkAssigningME_E2E ", "checkAssigningME_E2E");
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
        tripIdd = tripAdhoc.init(t1).tripIdd();
        System.out.println(tripIdd);
        tripAdhoc.init(t1).clickOncard();
        Thread.sleep(4000);
        rgno=driver.findElement(By.xpath("//td//input[@type='radio']/../..//td[2]")).getText();
        System.out.println(rgno);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td//input[@type='radio']"));
        js.executeScript("arguments[0].click();", button);
        //tripAdhoc.init(t1).assignRadioSelectVehicle();
        Thread.sleep(3000);
        String msg="successfully assigned Vehicle to trip ";
        String alrtMsg = msg.concat(tripIdd);


        WebElement button1 = driver.findElement(By.xpath("//button[.='ASSIGN VEHICLE']"));
        js.executeScript("arguments[0].click();", button1);
       // tripAdhoc.init(t1).agencyAssignButton();
        Thread.sleep(4000);
        String alert2 = fleetDriverPage.init(t1).takeAlertText();
        System.out.println(alert2);

        Assertion.assertEqual(alert2,alrtMsg,"successful message",t1);
    }

    @Test(priority = 1)
    public void checkAssigningME_TripId() throws Exception
    {
        ExtentTest t1 = pNode.createNode("checkAssigningME_E2E ", "checkAssigningME_E2E");
        driver.navigate().refresh();
        Thread.sleep(3000);
        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
        SubFleetsPage.init(t1).search_sendvalue(tripIdd);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//a[@class='btn search-btn']"));
        js.executeScript("arguments[0].click();", button);

        Thread.sleep(4000);
        String tripId2 = SubFleetsPage.init(t1).getFirstRowTripId();
        System.out.println(tripId2);
        String vehicleNo = inTrips.init(t1).vehicleAssignedAdhoc();

        Assertion.verifyEqual(tripId2,tripIdd,"same",t1);
        Assertion.verifyEqual(vehicleNo,rgno,"same",t1);
    }
}
