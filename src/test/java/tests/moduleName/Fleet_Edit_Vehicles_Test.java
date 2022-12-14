package tests.moduleName;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.Page_info.Fleet_Edit_Vehicle_Page;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.pageObjects.Page_info.Fleet_Vehicles_Page;
import framework.util.common.Assertion;
import framework.util.propertyManagement.MessageReader;
import framework.util.reportManagement.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;


import java.io.IOException;
import java.sql.SQLOutput;

public class Fleet_Edit_Vehicles_Test extends TestInit
{

   /* @Test(priority = 0)
    public void Login_Fleet() throws Exception {
        String Actual;
        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Fleet_Page.init(t1).mobility().fleets();
        Actual = driver.getCurrentUrl();

        Assertion.assertEqual(Actual, MessageReader.getMessage("URL1", null), "Verifing the Page", t1);
    }*/

  /*  @Test(priority = 1)
    public void clickingOnVehicles() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click on vehicle", "clicking on vehicles");
        Thread.sleep(2000);
        Fleet_Vehicles_Page aa = Fleet_Vehicles_Page.init(t1).clcikVehicl();
        String urlVehicle = driver.getCurrentUrl();

        Assertion.verifyContains(urlVehicle, "vehicles", "Page is navigated properly ", t1);
    }*/

    /*@Test(priority = 2)
    public void clickingOnedit() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click on vehicle", "clicking on vehicles");
        String vin = Fleet_Edit_Vehicle_Page.init(t1).takeVin();
        System.out.println(vin);
        String reg = Fleet_Edit_Vehicle_Page.init(t1).takereg();
        System.out.println(reg);
        String vv = Fleet_Edit_Vehicle_Page.init(t1).takevarient();
        System.out.println(vv);
        String vc = Fleet_Edit_Vehicle_Page.init(t1).takecolor();
        System.out.println(vc);
        String model = Fleet_Edit_Vehicle_Page.init(t1).model();
        System.out.println(model);
        Fleet_Edit_Vehicle_Page.init(t1).edit();
        Thread.sleep(2000);
        String txt1 = Fleet_Edit_Vehicle_Page.init(t1).txt();
        System.out.println("txt "+txt1);
        String[] parts = txt1.split(" ");
        String vinn = parts[parts.length - 2];
        System.out.println("Vin "+vinn);
        String modell = parts[parts.length - 4];
        System.out.println("model "+modell);

        System.out.println("----------------------------------");

        String invin = Fleet_Edit_Vehicle_Page.init(t1).vinv();
        System.out.println("invin "+invin);
        String invm = Fleet_Edit_Vehicle_Page.init(t1).vm();
        System.out.println("invm "+invm);
        String invv = Fleet_Edit_Vehicle_Page.init(t1).vv();
        System.out.println("invv "+invv);
        String inrn = Fleet_Edit_Vehicle_Page.init(t1).rn();
        System.out.println("inrn "+inrn);
        String inrc = Fleet_Edit_Vehicle_Page.init(t1).vc();
        System.out.println("inrc "+inrc);

        Assertion.assertEqual(vin,vinn,"Vin is same ",t1);
        Assertion.assertEqual(model,modell,"Check for model ",t1);
        Assertion.assertEqual(vin,invin,"Vin is same ",t1);
        Assertion.assertEqual(model,invm,"Vin is same ",t1);
        Assertion.assertEqual(vv,invv,"Vin is same ",t1);
        Assertion.assertEqual(reg,inrn,"Vin is same ",t1);
        Assertion.assertEqual(vc,inrc,"Vin is same ",t1);

    }
*/
  /*  @Test(priority = 3)
    public void editWindowTestVinDisable() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Testing of edit window vin", "edit window ");
        boolean verify = Fleet_Edit_Vehicle_Page.init(t1).vinis();

        if(verify)
        {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }*/

   /* @Test(priority = 4)
    public void editWindowTestVariantDisable() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Testing of edit window variant", "variant");
        boolean verify = Fleet_Edit_Vehicle_Page.init(t1).modis();

        if(verify)
        {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }*/

    /*@Test(priority = 5)
    public void editWindowTestModelDisable() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Testing of edit window Model", "Model");
        boolean verify = Fleet_Edit_Vehicle_Page.init(t1).varientis();

        if(verify)
        {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }*/

    @Test(priority = 6)
    public void editWindowTestColorDropdown() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Testing drop down color ", "drop down");
        Thread.sleep(1000);
        String clr = Fleet_Edit_Vehicle_Page.init(t1).getcolor();
        System.out.println("color=" + clr);
        Fleet_Edit_Vehicle_Page.init(t1).clcikColor();
        if (clr.equals("diamond-white")) {
            Fleet_Edit_Vehicle_Page.init(t1).clcikRed();
            Thread.sleep(1000);
            String clr2 = Fleet_Edit_Vehicle_Page.init(t1).getcolor();
            System.out.println("color2=" + clr2);
        } else if (clr.equals("desat-silver")) {
            Fleet_Edit_Vehicle_Page.init(t1).clckWhite();
            Thread.sleep(1000);
            String clr3 = Fleet_Edit_Vehicle_Page.init(t1).getcolor();
            System.out.println("color3=" + clr3);
        } else {
            Fleet_Edit_Vehicle_Page.init(t1).clciksilver();
            Thread.sleep(2000);
            String clr4 = Fleet_Edit_Vehicle_Page.init(t1).getcolor();
            System.out.println("color3=" + clr4);
        }
        Thread.sleep(2000);
        String clrlast = Fleet_Edit_Vehicle_Page.init(t1).getcolor();
        Fleet_Edit_Vehicle_Page.init(t1).clcikOnSubmit();
        Fleet_Edit_Vehicle_Page.init(t1).clcikOncancel();
        driver.navigate().refresh();
        String vc = Fleet_Edit_Vehicle_Page.init(t1).takecolor();
        System.out.println("now " + vc);

        Assertion.assertEqual(clrlast, vc, "Both color same", t1);

        /*String w = Fleet_Edit_Vehicle_Page.init(t1).getAlert();
        System.out.println(w);
        boolean verify = Fleet_Edit_Vehicle_Page.init(t1).alert();

        if (verify) {
            t1.pass("is displayed");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not displayed");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }*/
    }



  /*  @Test(priority = 7)
    public void editWindowTestVinDropdown() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Testing drop down Vin ", "drop down");
        Fleet_Edit_Vehicle_Page.init(t1).edit();
        String aa = GeneratingRandom.Vin();
        Fleet_Edit_Vehicle_Page.init(t1).clearVin();
        Fleet_Edit_Vehicle_Page.init(t1).sendVin(aa);
        Thread.sleep(1000);
        String now = Fleet_Edit_Vehicle_Page.init(t1).rn();
        System.out.println("this is now "+now);
        Fleet_Edit_Vehicle_Page.init(t1).clcikOnSubmit();
        Fleet_Edit_Vehicle_Page.init(t1).clcikOncancel();
        driver.navigate().refresh();
        String inTab = Fleet_Edit_Vehicle_Page.init(t1).takereg();
        System.out.println("inTab "+inTab);

        Assertion.assertEqual(now,inTab,"vin update",t1);





    }*/
}
