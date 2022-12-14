package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_APPROVALS_TRIP_SCHEDULING_Adhoc;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.awt.*;
import java.awt.event.KeyEvent;

public class checkAgencyVehicle_withOneEmptyInputTest extends TestInit
{

    @Test(priority = 0)
    public void checkAgencyVehicle_withOneEmptyInput() throws Exception {
        ExtentTest t1 = pNode.createNode("checkAgencyVehicle_withOneEmptyInput ", "checkAgencyVehicle_withOneEmptyInput");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//*[contains(text(),'Other Vehicles')]//..//input[@type='radio']"));
        js.executeScript("arguments[0].click();", button);
        // tripAdhoc.init(t1).otherVehicleRadio();
        Thread.sleep(3000);
        tripAdhoc.init(t1).agencyName("VRL");
        tripAdhoc.init(t1).agencyVehicle("eVerito");
        //String reg="NZ11NH1234";
       String reg = GeneratingRandom.Vin();
        System.out.println(reg);
        tripAdhoc.init(t1).agencyRegNo(reg);
        tripAdhoc.init(t1).agencyDriverName("Amar");

        tripAdhoc.init(t1).agencyTripDuration("1");
        Thread.sleep(2000);

        boolean is = driver.findElement(By.xpath("//button[.='ASSIGN VEHICLE']")).isEnabled();
        System.out.println(is);
        if(is)
        {
            t1.pass("pass");
        }
        else
        {
            t1.fail("fail");
        }

    }
}
