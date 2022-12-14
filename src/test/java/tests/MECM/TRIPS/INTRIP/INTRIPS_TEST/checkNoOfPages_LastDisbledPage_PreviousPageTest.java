package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

public class checkNoOfPages_LastDisbledPage_PreviousPageTest extends TestInit {
    int ttlcnt;
    @Test

    public void checkNoOfPages_LastDisbledPage_PreviousPage() throws Exception {
        ExtentTest t1 = pNode.createNode("checkNoOfPages_LastDisbledPage_PreviousPage", "checkNoOfPages_LastDisbledPage_PreviousPage");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        inTrips.init(t1).startDate("25022020");
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        String ss = SubFleetsPage.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);
        Thread.sleep(2000);
//        Robot robot = new Robot();
//        for (int i = 0; i < 4; i++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//        }
//       WebElement Element = driver.findElement(By.xpath("//label[.='Page size ']//..//select"));
//        JavascriptExecutor jss = (JavascriptExecutor) driver;
//       jss.executeScript("arguments[0].scrollIntoView();", Element);

//        Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
//        sl.selectByVisibleText("10");
//        Thread.sleep(2000);


        if (ttlcnt >= 10) {


            int page = ttlcnt / 10;
            int clickCount = 1;
            for (int i = 1; i <= page; i++)
            {
                Thread.sleep(2000);
                WebElement elmnt = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView();", elmnt);
                Thread.sleep(2000);
                SubFleetsPage.init(t1).nextPage();
                Thread.sleep(1000);
                clickCount++;

            }
            System.out.println("click count" + clickCount);
//            WebElement elmnt = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].scrollIntoView();", elmnt);
            String s = SubFleetsPage.init(t1).getLastRows();
            int lastCount = Integer.parseInt(s);
            System.out.println(lastCount);

            Assertion.assertEqual(ttlcnt, lastCount, "check last row sl no", t1);
        }
        else
            {
            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println(cnt);

            Assertion.assertEqual(ttlcnt, cnt, "check last row sl no", t1);
            t1.info("r = " + cnt);
        }
    }

    @Test(priority = 1)
    public void checkForNextPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for nextPage is disabled ", "check for nextPage is disabled");
        String state = SubFleetsPage.init(t1).getdisbledPageStatus();
        System.out.println(state);
        String a = "pagination-next disabled";

        Assertion.assertEqual(state, a, "check for nextPage is disabled", t1);
    }

    @Test(priority = 2)
    public void checkpreviousPageAnd1stRow() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for previous page and 1st row", "check for previous page and 1st row");
        String ss = SubFleetsPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);

        Thread.sleep(3000);
        WebElement elmnt = driver.findElement(By.xpath("//a[@aria-label='Previous page']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elmnt);
        Thread.sleep(2000);
        SubFleetsPage.init(t1).previosPage();
        Thread.sleep(2000);
        int page = ttlcnt / 10;
        int i = page - 1;
        int i1 = i * 10;
        int i2 = i1 + 1;
        System.out.println("maths " + i2);

        String s = SubFleetsPage.init(t1).getFirstRow();
        int firstCount = Integer.parseInt(s);
        System.out.println(firstCount);

        Assertion.assertEqual(i2, firstCount, "check for previous page and 1st row", t1);
    }

}


