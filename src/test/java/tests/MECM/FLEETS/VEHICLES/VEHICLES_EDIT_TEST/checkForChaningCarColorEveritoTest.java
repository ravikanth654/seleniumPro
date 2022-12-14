package tests.MECM.FLEETS.VEHICLES.VEHICLES_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.support.ui.Select;

public class checkForChaningCarColorEveritoTest extends TestInit
{
    @Test
    public void checkForChaningCarColorEverito() throws IOException, InterruptedException, AWTException {
        ExtentTest t1 = pNode.createNode("Testing drop down color ", "drop down");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);

        Select sl = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
        sl.selectByVisibleText("25");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath(("//span[@title='eVerito']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).editEverito();
        Thread.sleep(1000);
        /*driver.findElement(By.xpath("//span[@title='eVerito']/../..//td[11]")).click();
        Thread.sleep(1000);*/

        String clr = fleetVehiclesPage.init(t1).getcolor();
        System.out.println("color=" + clr);
        fleetVehiclesPage.init(t1).clcikColor();
        if (clr.equals("diamond-white")) {
            fleetVehiclesPage.init(t1).clcikRed();
            Thread.sleep(1000);
            String clr2 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color2=" + clr2);
        } else if (clr.equals("desat-silver")) {
            fleetVehiclesPage.init(t1).whiteone();
            Thread.sleep(1000);
            String clr3 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color3=" + clr3);
        } else {
            fleetVehiclesPage.init(t1).clciksilver();
            Thread.sleep(2000);
            String clr4 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color3=" + clr4);
        }
        Thread.sleep(2000);
        String clrlast = fleetVehiclesPage.init(t1).getcolor();
        fleetVehiclesPage.init(t1).clcikOnSubmit();
        String alrt="vehicle updated successfully!";
        String getalrt = fleetVehiclesPage.init(t1).getVehicleEditAlert();

        Assertion.assertEqual(alrt,getalrt,"successful alert",t1);
        //  fleetVehiclesPage.init(t1).clcikOncancel();

        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        Select sll = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
        sll.selectByVisibleText("10");
        Thread.sleep(2000);
        Select sll1 = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
        sll1.selectByVisibleText("25");
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath(("//span[@title='eVerito']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Thread.sleep(2000);
        fleetVehiclesPage.init(t1).clcikOnEverito();
        Thread.sleep(2000);
        String incolor = fleetVehiclesPage.init(t1).getCarcolor();

        String img = driver.findElement(By.xpath("//div[@class='vehicle-details']//div//img")).getAttribute("src");
        System.out.println("img "+img);




        String[] parts = img.split("/");
        String lastWord = parts[parts.length - 1];
        System.out.println("car color "+lastWord);
      /*  String vc = fleetVehiclesPage.init(t1).takecolor();
        System.out.println("now " + vc);*/

        Assertion.assertEqual(lastWord, clrlast, "Both color same", t1);

    }
}
