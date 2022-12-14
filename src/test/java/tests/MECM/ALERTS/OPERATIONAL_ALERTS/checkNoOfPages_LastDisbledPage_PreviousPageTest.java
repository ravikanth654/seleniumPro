/*
package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.List;

public class checkNoOfPages_LastDisbledPage_PreviousPageTest extends TestInit
{
    int ttlcnt;
    @Test

    public void checkNoOfPages_LastDisbledPage_PreviousPage() throws Exception {
        ExtentTest t1 = pNode.createNode("checkNoOfPages_LastDisbledPage_PreviousPage", "checkNoOfPages_LastDisbledPage_PreviousPage");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(3000);
        inTrips.init(t1).startDate("11112018");
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        ttlcnt = Integer.parseInt(s);
        System.out.println("now see " + ttlcnt);
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
            String ss = SubFleetsPage.init(t1).getLastRow();
            int lastCount = Integer.parseInt(ss);
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
        String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        ttlcnt = Integer.parseInt(s);
        System.out.println("now see " + ttlcnt);
//        String ss = SubFleetsPage.init(t1).ttl();
//        int ttlcnt = Integer.parseInt(ss);

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

        String sss = SubFleetsPage.init(t1).getFirstRow();
        int firstCount = Integer.parseInt(sss);
        System.out.println(firstCount);

        Assertion.assertEqual(i2, firstCount, "check for previous page and 1st row", t1);
    }

}
*/
