package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_APPROVALS_TRIP_SCHEDULING_Adhoc;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
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
import java.util.ArrayList;

public class selectByApprovedTest extends TestInit
{
    @Test
    public void selectByApproved() throws Exception {
        ExtentTest t1 = pNode.createNode("selectByApproved ", "selectByApproved");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        tripAdhoc.init(t1).tripAdhoc();
//        Thread.sleep(000);
        Select sl=new Select(driver.findElement(By.xpath("//div//select")));
        sl.selectByVisibleText("Approved");
        Thread.sleep(4000);
        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
        Thread.sleep(3000);
        int cnt = tripAdhoc.init(t1).cardCount();
        System.out.println(cnt);
        if(cnt>=4)
        {
        boolean is = driver.findElement(By.xpath("//button[.=' LOAD MORE']")).isDisplayed();
        System.out.println(is);
        Thread.sleep(2000);
        if(is==true) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement button = driver.findElement(By.xpath("//button[.=' LOAD MORE']"));
            js.executeScript("arguments[0].click();", button);
            Thread.sleep(6000);
            ArrayList<String> status = tripAdhoc.init(t1).cardStatus();
            System.out.println(status);


            Assertion.verifyListContains(status, "ASSIGN", "same", t1);
        }

        }
        else
        {
            ArrayList<String> status = tripAdhoc.init(t1).cardStatus();
            System.out.println(status);

            Assertion.verifyListContains(status, "ASSIGN", "same", t1);
        }


    }
}
