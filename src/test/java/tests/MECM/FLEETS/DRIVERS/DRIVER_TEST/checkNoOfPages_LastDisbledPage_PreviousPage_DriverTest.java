package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;

import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.List;

public class checkNoOfPages_LastDisbledPage_PreviousPage_DriverTest extends TestInit
{
    int ttlcnt;
    @Test(priority = 0)
    public void Total_SubfleetAndCheckwithPagenumbersWith10() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Total subfleet and check with page number with 10 size", "Total subfleet and check with page number with 10 size");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);

        Select sl = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
        sl.selectByVisibleText("10");
        Thread.sleep(2000);
        String ss = fleetDriverPage.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);


        if(ttlcnt>=10)
        {
            WebElement element = driver.findElement(By.xpath(("//label[.='Show']//..//select")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(2000);

            int page = ttlcnt / 10;
            System.out.println("page"+page);
            int clickCount=1;
            for (int i = 1; i <= page; i++) {
                WebElement element1 = driver.findElement(By.xpath(("//label[.='Show']//..//select")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
                fleetDriverPage.init(t1).nextPage();

                Thread.sleep(1000);
                clickCount++;

            }
            System.out.println("click count"+clickCount);
            String s = fleetDriverPage.init(t1).getLastRow();
            int lastCount = Integer.parseInt(s);
            System.out.println("last "+lastCount);
            System.out.println("total "+ttlcnt);

            Assertion.assertEqual(ttlcnt,lastCount,"check last row sl no",t1);
        }
        else
        {
            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println(cnt);

            Assertion.assertEqual(ttlcnt,cnt,"check last row sl no",t1);
            t1.info("r = "+cnt);
        }
    }

    @Test(priority = 1)
    public void checkForNextPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for nextPage is disabled ", "check for nextPage is disabled");
        String state = fleetDriverPage.init(t1).getdisbledPageStatus();
        System.out.println(state);
        String a = "pagination-next disabled";

        Assertion.assertEqual(state, a, "check for nextPage is disabled", t1);
    }

    @Test(priority = 2)
    public void checkpreviousPageAnd1stRow() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("check for previous page and 1st row", "check for previous page and 1st row");
        String ss = fleetDriverPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);

        fleetDriverPage.init(t1).previosPage();
        Thread.sleep(2000);
        int page = ttlcnt / 10;
        int i = page - 1;
        int i1 = i * 10;
        int i2 = i1 + 1;
        System.out.println("maths"+i2);

        String s = fleetDriverPage.init(t1).getFirstRow();
        int firstCount = Integer.parseInt(s);
        System.out.println(firstCount);

        Assertion.assertEqual(i2,firstCount,"check for previous page and 1st row",t1);

    }

}
