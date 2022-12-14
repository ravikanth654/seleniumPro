package tests.moduleName;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.pageObjects.Page_info.Fleet_Vehicles_Page;
import framework.util.common.Assertion;
import framework.util.propertyManagement.MessageReader;
import framework.util.reportManagement.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fleet_Vehicles_Test extends TestInit {
    private String Expected;

/*
    @Test(priority = 0)
    public void Login_Fleet() throws Exception
    {
        String Actual;
        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Fleet_Page.init(t1).mobility().fleets();
        Actual = driver.getCurrentUrl();

        Assertion.assertEqual(Actual, MessageReader.getMessage("URL1", null), "Verifing the Page", t1);
    }

    @Test(priority = 1)
    public void clickingOnVehicles() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Click on vehicle", "clicking on vehicles");
        Thread.sleep(2000);
        Fleet_Vehicles_Page aa = Fleet_Vehicles_Page.init(t1).clcikVehicl();
        String urlVehicle = driver.getCurrentUrl();

        Assertion.verifyContains(urlVehicle, "vehicles", "Page is navigated properly ", t1);
    }*/

  /* @Test(priority = 2)
    public void totalVehicles() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Total vehicles", "Compare total number of vehicles with total row");
        Thread.sleep(2000);
        Select sl=new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
        sl.selectByVisibleText("50");
        Thread.sleep(2000);
        String ss = Fleet_Vehicles_Page.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);

        List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
        int cnt = lst.size();
        System.out.println(cnt);

        Assertion.assertEqual(ttlcnt, cnt, "Verifing total subfleet", t1);
    }*/

  /*  @Test(priority = 3)
    public void Search_displayed() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search is displayed ", "verify search displayed");
        boolean isIt = Fleet_Vehicles_Page.init(t1).searchIsDisplayed();
        if (isIt) {
            t1.pass("is displayed");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not displayed");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 4)
    public void Search_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search is enabled ", "verify search enabled");
        boolean isIt = Fleet_Vehicles_Page.init(t1).searchIsEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }
*/
   /* @Test(priority = 5)
    public void Search_byLicencePlate() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By licence plate ", "Search by licence plate ");
        String s1 =Fleet_Vehicles_Page.init(t1).getFirstRowLicencePlate();
        System.out.println(s1);
        Fleet_Vehicles_Page.init(t1).search_sendvalue(s1);
        Fleet_Vehicles_Page.init(t1).clickSearch();
        Thread.sleep(1000);
        String s2 = Fleet_Vehicles_Page.init(t1).getFirstRowLicencePlate();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifing the value", t1);
        Fleet_Vehicles_Page.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        Fleet_Vehicles_Page.init(t1).clcikVehicl();
    }

    @Test(priority = 6)
    public void Search_byVin() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By Vin ", "Search by VIN ");
        String s1 = Fleet_Vehicles_Page.init(t1).getsecondRowVin();
        System.out.println(s1);
        Fleet_Vehicles_Page.init(t1).search_sendvalue(s1);
        Fleet_Vehicles_Page.init(t1).clickSearch();
        Thread.sleep(1000);

        String s2 = Fleet_Vehicles_Page.init(t1).getfirstRowVin();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifing the value", t1);
        Fleet_Vehicles_Page.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        Fleet_Vehicles_Page.init(t1).clcikVehicl();
    }
*/
/*
    @Test(priority = 7)
    public void Table_columns()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
        ArrayList<String> nm =Fleet_Vehicles_Page.init(t1).TblHeading();
        ArrayList<String> list=new ArrayList<String>();

        list.add("Sl. No.");
        list.add("LICENSE PLATE/ VIN");
        list.add("VIN");
        list.add("MODEL");
        list.add("VARIANT");
        list.add("COLOR");
        list.add("CUSTOMER CITY");
        list.add("SUBSCRIPTION VALIDITY");
        list.add("AVAILABILITY");
        list.add("SOC %");
        list.add("LAST CONNECTED");
        list.add("ACTIONS");

        for(String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);
        }
    }
*/

   /* @Test(priority = 8)
    public void click_on_export() throws IOException, InterruptedException
    {
        String downloadPath = "C:\\Users\\25004035\\Downloads";
        ExtentTest t1 = pNode.createNode("export button,File download", "check for export button and file upload ");
        Fleet_Vehicles_Page.init(t1).Export();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\download.exe");
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\saveAS.exe");
        Thread.sleep(2000);
    }*/

   /* @Test(priority = 9)
    public void clickingOnRow()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on row ", "Clicking on row");
        Thread.sleep(2000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)", "");
        Fleet_Vehicles_Page.init(t1).clcikVehicl();
        Thread.sleep(2000);
        Fleet_Vehicles_Page.init(t1).rowClick();
        String value = Fleet_Vehicles_Page.init(t1).rowvalue();
        String urlll = driver.getCurrentUrl();

        Assertion.verifyContains(urlll,value,"page is navigated properly",t1);
    }*/

   /* @Test(priority = 10)
    public void comparingValues()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on back ", "Clicking on back");
        Fleet_Vehicles_Page.init(t1).backClick();
        Thread.sleep(2000);
        String vin = Fleet_Vehicles_Page.init(t1).rowvalue();
        System.out.println("vin "+vin);
        String regNo = Fleet_Vehicles_Page.init(t1).regNo();
        System.out.println("regNo "+regNo);
        String model = Fleet_Vehicles_Page.init(t1).model();
        System.out.println("model "+model);
        String color = Fleet_Vehicles_Page.init(t1).color();
        System.out.println("color "+color);
        String lastCnct = Fleet_Vehicles_Page.init(t1).lastconnect();
        System.out.println("lastCnct "+lastCnct);

        System.out.println("---------------------------------------------------");

        Fleet_Vehicles_Page.init(t1).rowClick();
        Thread.sleep(2000);
        String inVin = Fleet_Vehicles_Page.init(t1).inVin();
        System.out.println("inVin "+inVin);
        String inModel = Fleet_Vehicles_Page.init(t1).inModel();
        System.out.println("inModel "+inModel);
        String inReg = Fleet_Vehicles_Page.init(t1).inReg();
        System.out.println("inReg "+inReg);
        String incolor = Fleet_Vehicles_Page.init(t1).getCarcolor();
        String[] parts = incolor.split("/");
        String lastWord = parts[parts.length - 1];
        System.out.println("car color "+lastWord);
        String inLastconnect = Fleet_Vehicles_Page.init(t1).inLastconnect();
        System.out.println("inLastconnect "+inLastconnect);

        Assertion.assertEqual(vin,inVin,"comparing vin ",t1);
        Assertion.assertEqual(model,inModel,"comparing model ",t1);
        Assertion.assertEqual(regNo,inReg,"comparing regNo ",t1);
        Assertion.verifyContains(lastCnct,inLastconnect,"comparing LastConnect ",t1);
        Assertion.verifyContains(color,lastWord,"comparing Color ",t1);
    }*/

   /* @Test(priority = 11)
    public void totalRowCount()throws Exception
    {
        ExtentTest t1 = pNode.createNode("total row count ", "Total row count");
        Fleet_Vehicles_Page.init(t1).backClick();
        Thread.sleep(2000);
        String sz = Fleet_Vehicles_Page.init(t1).ttl();
        int ttlcnt = Integer.parseInt(sz);
        System.out.println("ttl "+ttlcnt);

        Select sl=new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
        sl.selectByVisibleText("50");

        String t =  Fleet_Vehicles_Page.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int ss = Integer.parseInt(s);
        System.out.println("row2 "+ss);

        Assertion.assertEqual(ttlcnt,ss,"Number of row count is same ",t1);
    }*/
}










