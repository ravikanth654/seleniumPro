
package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class table_HeadingsTest extends TestInit
{
    @Test
    public void Table_headings()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
        Login.init(t1).validLogin("MECM");
       SubFleetsPage.init(t1).mobility().fleets();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(2000);
       /* driver.findElement(By.xpath("(//input[@name='date'])[2]")).click();
        Thread.sleep(2000);
       //inTrips.init(t1).startDate("");
        WebElement date = driver.findElement(By.xpath("(//input[@id='date'])[2]"));
        date.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);*/
        ArrayList<String> nm = SubFleetsPage.init(t1).TblHeading();
        System.out.println("table "+nm);
        ArrayList<String> list=new ArrayList<String>();

        list.add("Sl. No.");
        list.add("LICENSE PLATE/ VIN");
        list.add("ALERT TYPE");
        list.add("ALERT DESCRIPTION");
        list.add("DATE & TIME");
        list.add("ACTIONS");


        for(String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);

        }
    }

}

