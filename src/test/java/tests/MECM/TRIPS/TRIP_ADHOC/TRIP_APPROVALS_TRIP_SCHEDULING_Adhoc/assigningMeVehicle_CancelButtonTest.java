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

import java.awt.*;
import java.awt.event.KeyEvent;

public class assigningMeVehicle_CancelButtonTest extends TestInit
{
    @Test(priority = 0)
    public void assigningMeVehicle_CancelButton() throws Exception {
        ExtentTest t1 = pNode.createNode("assigningMeVehicle_CancelButton ", "assigningMeVehicle_CancelButton");
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
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td//input[@type='radio']"));
        js.executeScript("arguments[0].click();", button);
        //tripAdhoc.init(t1).assignRadioSelectVehicle();
        Thread.sleep(3000);

        boolean is = tripAdhoc.init(t1).cancel();
        if(is)
        {
            t1.pass("cancel button is enabled ");
        }
        else
        {
            t1.fail("not enabled");
        }

    }
}
