package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

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
import java.util.ArrayList;
import java.util.List;

public class check_CompletedStatusTest extends TestInit
{
    int ttlcnt;
    ArrayList<String> statusAll = null;
    String statuss = null;
    @Test
    public void check_CompletedStatus() throws Exception
    {
        ExtentTest t1 = pNode.createNode("check_CompletedStatus ", "Scheck_CompletedStatus");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).startDate("30122019");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(6000);
        String ss = SubFleetsPage.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);


        inTrips.init(t1).filter();
        Thread.sleep(2000);
        inTrips.init(t1).Completed();
        Thread.sleep(2000);
        inTrips.init(t1).done();
        Thread.sleep(5000);
        Robot robot = new Robot();
        for (int i = 0; i < 6; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);

        }

//        WebElement elmnt = driver.findElement(By.xpath("//p[contains(text(),'Entries')]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", elmnt);
//
////        WebElement Element = driver.findElement(By.xpath("//label[.='Page size ']//..//select"));
////        JavascriptExecutor jss = (JavascriptExecutor) driver;
////        jss.executeScript("arguments[0].scrollIntoView();", Element);
//
//        ArrayList<String> statusAll = null;
//        String statuss = null;
//        if (ttlcnt >10) {
////            WebElement elmnt = driver.findElement(By.xpath("//a[@aria-label='Next page']"));
////            JavascriptExecutor js = (JavascriptExecutor) driver;
////            js.executeScript("arguments[0].scrollIntoView();", elmnt);
////            Thread.sleep(2000);
//
//            int page = ttlcnt / 10;
//            int rmd = ttlcnt % 10;
//
//            boolean is = SubFleetsPage.init(t1).nextDisbldnew();
//            System.out.println(is);
//
//            while (is)
//            {
//
//            for (int i = 1; i <= page; i++) {
//                statusAll = inTrips.init(t1).getStatus();
//                statuss = "COMPLETED";
//                Thread.sleep(3000);
//                WebElement elmntt = driver.findElement(By.xpath("//p[contains(text(),'Entries')]"));
//                JavascriptExecutor jss = (JavascriptExecutor) driver;
//                jss.executeScript("arguments[0].scrollIntoView();", elmntt);
//                Thread.sleep(2000);
//
//                SubFleetsPage.init(t1).nextPageNew();
//               // SubFleetsPage.init(t1).nextPage();
//                Thread.sleep(2000);
//            }
//                Assertion.verifyListContains(statusAll, statuss, "check last row status", t1);
//
//                {
//                    break ;
//                }
//        }
//
//        } else {
//            Thread.sleep(2000);
//            statusAll = inTrips.init(t1).getStatus();
//            statuss="COMPLETED";
//            Thread.sleep(1000);
//
//            Assertion.verifyListContains(statusAll,statuss, "check last row status", t1);
//
//        }

           statusAll = inTrips.init(t1).getStatus();
           statuss="COMPLETED";
           Thread.sleep(2000);
           Assertion.verifyListContains(statusAll,statuss, "check all row status", t1);
    }
}

