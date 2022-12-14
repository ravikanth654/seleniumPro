package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class checkClickingOnTripTest extends TestInit
{
    @Test
    public void checkClickingOnTrip() throws Exception {
        ExtentTest t1 = pNode.createNode("checkClickingOnTrip ", "checkClickingOnTrip");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(4000);
        inTrips.init(t1).startDate("31122019");
       Thread.sleep(5000);
        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);

        }
        Thread.sleep(2000);
        String id = inTrips.init(t1).getTripId();
        System.out.println(id);
        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait (driver, 30);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        js.executeScript("arguments[0].click();", button);
//        inTrips.init(t1).clcikTripId();
       Thread.sleep(5000);
        String url= driver.getCurrentUrl();
        System.out.println(url);


        Assertion.verifyContains(url,id,"both same ",t1);

    }
}
