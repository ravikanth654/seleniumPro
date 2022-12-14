package tests.MECM.MAPS.GEO_FENCING;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.CurrentDate;
import tests.myMethods.GeneratingRandom;

import java.awt.*;
import java.awt.event.KeyEvent;

public class createFenceEndToEndTest extends TestInit
{
    @Test
    public void createFenceEndToEnd()throws Exception {
        ExtentTest t1 = pNode.createNode("createFenceEndToEnd", "createFenceEndToEnd");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();

        heatMap_PathTracking_Geofencing.init(t1).maps().FENCING();
        Thread.sleep(3000);
        heatMap_PathTracking_Geofencing.init(t1).CreateFENCING();
        Thread.sleep(3000);
       /* Robot robot = new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }*/
       // heatMap_PathTracking_Geofencing.init(t1).fenceSearchClick();
        heatMap_PathTracking_Geofencing.init(t1).sendTofenceSearch("bangalore");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.RETURN);
//        heatMap_PathTracking_Geofencing.init(t1).currentlocation();
        String s=null;
        String fence = GeneratingRandom.fourchar(s);
        String fncName = heatMap_PathTracking_Geofencing.init(t1).fenceName(fence);
      //  heatMap_PathTracking_Geofencing.init(t1).dropdownMenuButton();
        //heatMap_PathTracking_Geofencing.init(t1).dropdownMenuEntry();

       // driver.switchTo().frame(0); //need to switch to this frame before clicking the slider
       /* WebElement slider = driver.findElement(By.cssSelector("overflow-y: scroll;overflow-x: hidden"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
        ((Actions) action).perform();*/

        WebElement element = driver.findElement(By.xpath(("//*[text()='CANCEL']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        heatMap_PathTracking_Geofencing.init(t1).Select_Fleets();
        heatMap_PathTracking_Geofencing.init(t1).pure_checkboxOne();
        Thread.sleep(1000);
//        String date = CurrentDate.date();
//        System.out.println(date);
        heatMap_PathTracking_Geofencing.init(t1).expires_in("12122030");


        
        

    }
}
