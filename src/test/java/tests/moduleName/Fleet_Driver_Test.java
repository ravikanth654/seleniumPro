package tests.moduleName;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.Page_info.Fleet_Driver_Page;
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
import tests.myMethods.CurrentDate;
import tests.myMethods.isFileDownloaded;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static framework.util.common.Assertion.isFileDownloaded;

public class Fleet_Driver_Test extends TestInit
{

   /* @Test(priority = 0)
    public void Login_Fleet() throws Exception
    {
        String Actual;
        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Fleet_Page.init(t1).mobility().fleets();
        Actual = driver.getCurrentUrl();

        Assertion.assertEqual(Actual, MessageReader.getMessage("URL1", null), "Verifing the Page", t1);
    }*/

    /*@Test(priority = 1)
    public void clickingOnDrivers() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on Drivers", "click on driver and compare URL");
        String expectedUrl="drivers";
        Fleet_Driver_Page.init(t1).clikOnDriver();
        String actualUrl = driver.getCurrentUrl();

        Assertion.verifyContains(expectedUrl,actualUrl,"Comparing the URl clicking on vehicles",t1);
    }*/

  /*  @Test(priority = 2)
    public void Total_Drivers() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Total subfleet", "Compare total number of subfleet with total row");
        Thread.sleep(3000);
        String ss = Fleet_Driver_Page.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);
        Thread.sleep(2000);

        Select sl=new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
        sl.selectByVisibleText("50");
        Thread.sleep(2000);

        List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
        int cnt = lst.size();
        Thread.sleep(2000);
        System.out.println(cnt);

        Assertion.assertEqual(ttlcnt,cnt,"Verifing total subfleet",t1);
    }
*/
   /* @Test(priority = 3)
    public void Search_displayed() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search is displayed ", "verify search displayed");
        boolean isIt =  Fleet_Driver_Page.init(t1).searchIsDisplayed();
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
        boolean isIt =  Fleet_Driver_Page.init(t1).searchIsEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 5)
    public void Search_byName() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By licence plate ", "Search by licence plate ");
        Thread.sleep(6000);
        String s1 = Fleet_Driver_Page.init(t1).getFirstRowName();
        System.out.println(s1);
        Fleet_Driver_Page.init(t1).search_sendvalue(s1);
        Fleet_Driver_Page.init(t1).clickSearch();

        String s2 = Fleet_Driver_Page.init(t1).getFirstRowName();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifing the value", t1);
        Fleet_Driver_Page.init(t1).search_click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        Fleet_Driver_Page.init(t1).clikOnDriver();
    }
*/
    /*@Test(priority = 6)
    public void Search_byEmail() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By Vin ", "Search by VIN ");
        String s1 =  Fleet_Driver_Page.init(t1).getsecondRowEmail();
        System.out.println(s1);
        Fleet_Driver_Page.init(t1).search_sendvalue(s1);
        Fleet_Driver_Page.init(t1).clickSearch();
        Thread.sleep(1000);

        String s2 =  Fleet_Driver_Page.init(t1).getfirstRowEmail();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifing the value", t1);
        Fleet_Driver_Page.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        Fleet_Driver_Page.init(t1).clikOnDriver();
    }*/

   /* @Test(priority = 6)
    public void Table_columns()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
        ArrayList<String> nm = Fleet_Driver_Page.init(t1).TblHeading();
        ArrayList<String> list=new ArrayList<String>();

        list.add("Sl. No.");
        list.add("IMAGE");
        list.add("NAME");
        list.add("GENDER");
        list.add("DOB");
        list.add("PHONE");
        list.add("SUBFLEET");
        list.add("VEHICLE ASSIGNED");
        list.add("TRIPS TAKEN");
        list.add("RATING");
        list.add("STATUS");
        list.add("AVAILABILITY");
        list.add("ACTIONS");

        for(String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);

        }
    }*/

   /* @Test(priority = 7)
    public void Total_SubfleetAndCheckwithPagenumbersWith10() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Total subfleet and check with page number with 10 size", "Total subfleet and check with page number with 10 size");
        Thread.sleep(2000);
        Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
        sl.selectByVisibleText("10");
        Thread.sleep(2000);
        String ss = Fleet_Page.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);

       *//* List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
        int cnt = lst.size();
        System.out.println(cnt);*//*
        WebElement elmnt=driver.findElement(By.xpath("//a[@aria-label='Next page']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elmnt);
        Thread.sleep(2000);

        int page = ttlcnt / 10;
        System.out.println("page"+page);
        int clickCount=1;
        for(int i=1;i<=page;i++)
        {

            Fleet_Page.init(t1).nextPage();
            Thread.sleep(1000);
            clickCount++;
        }
        System.out.println("click count"+clickCount);
        String s = Fleet_Page.init(t1).getLastRow();
        int lastCount = Integer.parseInt(s);
        System.out.println(lastCount);

        Assertion.assertEqual(ttlcnt,lastCount,"check last row sl no",t1);


    }
*/
    @Test(priority = 8)
    public void checkpreviousPageAnd1stRow() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Total subfleet and check with page number with 10 size", "Total subfleet and check with page number with 10 size");
        String ss = Fleet_Page.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);

        Fleet_Page.init(t1).previosPage();
        Thread.sleep(2000);
        int page = ttlcnt / 10;
        int i = page - 1;
        int i1 = i * 10;
        int i2 = i1 + 1;
        System.out.println("maths"+i2);

        String s = Fleet_Page.init(t1).getFirstRow();
        int firstCount = Integer.parseInt(s);
        System.out.println(firstCount);

        Assertion.assertEqual(i2,firstCount,"check last row sl no",t1);

    }






    @Test(priority = 7)
    public void import_button_Displayed() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verify import button is display", "verify import button enabled and clickable ");
        boolean verify = Fleet_Page.init(t1).import_button();
        if(verify)
        {
            t1.pass("is displayed");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not displayed");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

   @Test(priority = 8)
    public void import_button_enabled() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verify import button is enabled", "verify import button enabled and clickable ");
        boolean verify1 = Fleet_Page.init(t1).import_button1();
        if(verify1)
        {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

   /* @Test(priority = 9)
    public void click_import() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verifing click", "verifing click ");
        Fleet_Page.init(t1).imp_click();
        String expect="Select the file to import";
        System.out.println("expected "+expect);
        Thread.sleep(3000);
        String aa = Fleet_Page.init(t1).getpageValue();
        System.out.println(aa);

        Assertion.assertEqual(aa,expect,"Same",t1);
    }*/

    @Test(priority = 10)
    public void import_checkSubmit_isDisplayed() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verify submit button is display", "verify submit button is display ");
        boolean checksbmt = Fleet_Page.init(t1).CheckSubmit();
        if(checksbmt)
        {
            t1.pass("is displayed");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not displayed");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());

        }
    }

    @Test(priority = 11)
    public void import_cancel() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verify import button is enabled", "verify import button enabled and clickable ");
        boolean verify2 = Fleet_Page.init(t1).CheckCancel();
        if(verify2)
        {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
        else
        {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 12)
    public void Cancel_browse()
    {
        ExtentTest t1 = pNode.createNode("Cancel button,verify import cancel button click", "verify import cancel button click");
        Fleet_Page.init(t1).cickOnCancel();
    }

    @Test(priority = 13)
    public void Browse_FileUploading() throws InterruptedException, IOException
    {
        String t="Mobile should be unique";
        String t2="Successfully uploaded the customers!!";
        ExtentTest t1 = pNode.createNode("Browse button,Check for file upload with message", "verify Browse button enabled and clickable and file upload ");
        Thread.sleep(3000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\load.exe");
        Thread.sleep(3000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();

        Assertion.assertEqual(t,txt,"Check for file upload",t1);
    }

    @Test(priority = 14)
    public void click_on_export() throws IOException, InterruptedException
    {
        String downloadPath = "C:\\Users\\25004035\\Documents";
        String fileName = "driver";
        String day = CurrentDate.date();
        String downloadFile = fileName.concat(day).concat(".csv");
        System.out.println("name "+downloadFile);
        ExtentTest t1 = pNode.createNode("export button,File download", "check for export button and file upload ");
        Fleet_Page.init(t1).Export();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\download.exe");
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\saveAS.exe");
        boolean is = isFileDownloaded.isFileDownloaded(downloadPath, downloadFile);
        System.out.println("is it downloaded "+is);

        if (is) {
            t1.pass("File downloaded");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not downloaded");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }


}
