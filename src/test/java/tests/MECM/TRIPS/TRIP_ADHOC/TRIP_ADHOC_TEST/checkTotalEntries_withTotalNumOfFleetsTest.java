package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

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

import java.io.IOException;
import java.util.List;

public class checkTotalEntries_withTotalNumOfFleetsTest extends TestInit
{
    @Test
    public void checkTotalEntries_withTotalNumOfFleets() throws Exception {
        ExtentTest t1 = pNode.createNode("checkTotalEntries_withTotalNumOfFleets ", "checkTotalEntries_withTotalNumOfFleets");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);
        inTrips.init(t1).startDate("25022020");
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        WebElement elmnt = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elmnt);

        String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int sss = Integer.parseInt(s);
        System.out.println("row2 " + sss);

        if (sss >= 10) {


            int page = sss / 10;
            int clickCount = 1;
            for (int i = 1; i <= page; i++)
            {
                Thread.sleep(2000);
                WebElement elmnta = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
                JavascriptExecutor jsa = (JavascriptExecutor) driver;
                jsa.executeScript("arguments[0].scrollIntoView();", elmnta);
                Thread.sleep(2000);
                SubFleetsPage.init(t1).nextPage();
                Thread.sleep(1000);
                clickCount++;

            }
            System.out.println("click count" + clickCount);
//            WebElement elmnt = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].scrollIntoView();", elmnt);
            String ss = SubFleetsPage.init(t1).getLastRows();
            int lastCount = Integer.parseInt(ss);
            System.out.println(lastCount);

            Assertion.assertEqual(sss, lastCount, "check last row sl no", t1);
        }
        else
        {
            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println(cnt);

            Assertion.assertEqual(sss, cnt, "check last row sl no", t1);
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
        int sss = Integer.parseInt(s);

        Thread.sleep(3000);
        WebElement elmnt = driver.findElement(By.xpath("//a[@aria-label='Previous page']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elmnt);
        Thread.sleep(2000);
        SubFleetsPage.init(t1).previosPage();
        Thread.sleep(2000);
        int page = sss / 10;
        int i = page - 1;
        int i1 = i * 10;
        int i2 = i1 + 1;
        System.out.println("maths " + i2);

        String ss = SubFleetsPage.init(t1).getFirstRow();
        int firstCount = Integer.parseInt(ss);
        System.out.println(firstCount);

        Assertion.assertEqual(i2, firstCount, "check for previous page and 1st row", t1);
    }

}


