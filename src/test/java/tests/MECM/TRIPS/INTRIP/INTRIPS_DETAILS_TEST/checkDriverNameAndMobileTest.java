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

public class checkDriverNameAndMobileTest extends TestInit
{
    @Test
    public void checkDriverNameAndMobile() throws Exception {
        ExtentTest t1 = pNode.createNode("checkDriverNameAndMobile ", "checkDriverNameAndMobile");
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

        String otype = inTrips.init(t1).driverName();
        String otype2 = inTrips.init(t1).driverPhone();

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);
        WebElement button1 = driver.findElement(By.xpath("//a[.=' TRIP DETAILS ']"));
        js.executeScript("arguments[0].click();", button1);
        // inTrips.init(t1).clickingOnTripDetails();
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        WebElement button11 = driver.findElement(By.xpath("//a[.=' DRIVER DETAILS ']"));
        js.executeScript("arguments[0].click();", button11);
        // inTrips.init(t1).ClickvehiclesDetails();
        Thread.sleep(2000);
        String intype = inTrips.init(t1).indriverNeme();
        String intype2 = inTrips.init(t1).inPhone();



        Assertion.verifyEqual(otype,intype,"same",t1);
        Assertion.verifyEqual(otype2,intype2,"same",t1);

    }
}
