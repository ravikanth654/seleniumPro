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
import tests.myMethods.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Fleet_Test extends TestInit {
    private String Actual;
    private String Expected;
    private String dFile;
    private int ttlcnt;

    private String url="C:\\Users\\25004035\\Documents\\";


    @Test(priority = 0)
    public void Login_Fleet() throws Exception {
        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Fleet_Page.init(t1).mobility().fleets();
        Actual = driver.getCurrentUrl();

        Thread.sleep(2000);
        Assertion.assertEqual(Actual, MessageReader.getMessage("URL1", null), "Verifing the Page", t1);
    }

    @Test(priority = 1)
    public void Total_Subfleet_countsBy10_25_50() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Total subfleet", "Compare total number of subfleet with total rows");
        Thread.sleep(2000);

        String ss = Fleet_Page.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        System.out.println("now see "+ttlcnt);
        if(ttlcnt <=10) {

            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            System.out.println("10 ka totl"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("10 ka size"+cnt);

            Assertion.assertEqual(ttlcnt, cnt, "Verifing total subfleets", t1);
        }
        else if(ttlcnt >10 && ttlcnt <=25)
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("25");
            Thread.sleep(2000);

            System.out.println("25 ka total"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("25 ka page"+cnt);

            Assertion.assertEqual(ttlcnt, cnt, "Verifing total subfleets", t1);

        }

        else if(ttlcnt >25 && ttlcnt <=50)
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("50");
            Thread.sleep(2000);

            System.out.println("50 ka cnt"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("50 ka page"+cnt);

            Assertion.assertEqual(ttlcnt, cnt, "Verifing total subfleets", t1);

        }
        else
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("last"+cnt);

            Assertion.assertEqual(10, cnt, "Verifying total subfleets", t1);

        }
    }

    @Test(priority = 2)
    public void checkTotalEtries() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Check total entries ", "Check total entries");
        String ss = Fleet_Page.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        String t = Fleet_Vehicles_Page.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int sss = Integer.parseInt(s);
        System.out.println("row2 " + ss);

        Assertion.assertEqual(ttlcnt, sss, "Verifying total entries", t1);
    }

    @Test(priority = 3)
    public void Search_displayed() throws Exception {
        ExtentTest t1 = pNode.createNode("search is displayed ", "verify search displayed");
        boolean isIt = Fleet_Page.init(t1).searchIsDisplayed();
        if (isIt) {
            t1.pass("is displayed");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not displayed");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }

    }

    @Test(priority = 4)
    public void Search_enabled() throws Exception {
        ExtentTest t1 = pNode.createNode("search is enabled ", "verify search enabled");
        boolean isIt = Fleet_Page.init(t1).searchIsEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }

    }

    @Test(priority = 5)
    public void Search_byFleetName() throws Exception {
        ExtentTest t1 = pNode.createNode("search By fleetname ", "Search by fleet name ");
        String s1 = Fleet_Page.init(t1).getFirstRowName();
        System.out.println(s1);
        Fleet_Page.init(t1).search_sendvalue(s1);
        Fleet_Page.init(t1).clickSearch();
        Thread.sleep(1000);
        String s2 = Fleet_Page.init(t1).getFirstRowName();
        System.out.println(s2);


        Assertion.assertEqual(s1, s2, "Verifying the value", t1);
        Fleet_Page.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        Fleet_Page.init(t1).fleets();


    }

    @Test(priority = 6)
    public void Search_byEmail() throws Exception {
        ExtentTest t1 = pNode.createNode("search By Email ", "Search by Email ");
        String s1 = Fleet_Page.init(t1).getsecondRowEmail();
        System.out.println(s1);
        Fleet_Page.init(t1).search_sendvalue(s1);
        Fleet_Page.init(t1).clickSearch();
        Thread.sleep(1000);

        String s2 = Fleet_Page.init(t1).getfirstRowEmail();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifying the email value", t1);
        Fleet_Page.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        Fleet_Page.init(t1).fleets();

    }

    @Test(priority = 7)
    public void Table_headings()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings", "verify table headings");
        ArrayList<String> nm = Fleet_Page.init(t1).TblHeading();
        ArrayList<String> list=new ArrayList<String>();

        list.add("Sl. No.");
        list.add("SUBFLEET NAME");
        list.add("ADDRESS");
        list.add("EMAIL");
        list.add("NO. OF VEHICLES");
        list.add("NO. OF DRIVERS");
        list.add("STATUS");
        list.add("ACTIONS");

        for(String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);

        }
    }

    @Test(priority = 8)
    public void checkForPreviousPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for previous page is disabled ", "check for previous page is disabled");
        String state = Fleet_Page.init(t1).getdisbledPageStatusprevious();
        System.out.println(state);
        String a = "pagination-previous disabled";

        Assertion.assertEqual(state, a, "previous page is disabled", t1);
    }


    @Test(priority = 9)
    public void Total_SubfleetAndCheckwithPagenumbersWith10() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Total subfleet and check with page number with 10 size", "Total subfleet and check with page number with 10 size");
        Thread.sleep(2000);
        Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
        sl.selectByVisibleText("10");
        Thread.sleep(2000);
        String ss = Fleet_Page.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);

        if(ttlcnt>=10)
        {
            WebElement elmnt = driver.findElement(By.xpath("//a[@aria-label='Next page']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", elmnt);
            Thread.sleep(2000);

            int page = ttlcnt / 10;
            int clickCount=1;
            for (int i = 1; i <= page; i++) {
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
        else
        {
            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println(cnt);

            Assertion.assertEqual(ttlcnt,cnt,"check last row sl no",t1);
            t1.info("r = "+cnt);
        }
    }

    @Test(priority = 10)
    public void checkForNextPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for nextPage is disabled ", "check for nextPage is disabled");
        String state = Fleet_Page.init(t1).getdisbledPageStatus();
        System.out.println(state);
        String a = "pagination-next disabled";

        Assertion.assertEqual(state, a, "check for nextPage is disabled", t1);
    }

    @Test(priority = 11)
    public void checkpreviousPageAnd1stRow() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("check for previous page and 1st row", "check for previous page and 1st row");
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

        Assertion.assertEqual(i2,firstCount,"check for previous page and 1st row",t1);

    }

    @Test(priority = 12)
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

    @Test(priority = 13)
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

    @Test(priority = 14)
    public void click_import() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verifying click", "verifying click ");
        Fleet_Page.init(t1).imp_click();
        String expect="Select the file to import";
        System.out.println("expected "+expect);
        Thread.sleep(2000);
        String aa = Fleet_Page.init(t1).getpageValue();
        System.out.println(aa);

        Assertion.assertEqual(aa,expect,"Import button,verifying click",t1);
    }

   @Test(priority = 15)
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

    @Test(priority = 16)
    public void import_cancel_enbled() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verify cancel button is enabled", "verify cancel button enabled and clickable ");
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

    @Test(priority = 17)
    public void Cancel_browse()
    {
        ExtentTest t1 = pNode.createNode("Cancel button,verify cancel cancel button click", "verify cancel cancel button click");
        Fleet_Page.init(t1).cickOnCancel();
    }

    @Test(priority = 18)
    public void Browse_existingFileUploading() throws InterruptedException, IOException
    {
        String t="Already an fleet name exists";
       // String t2="Successfully uploaded the customers!!";
        ExtentTest t1 = pNode.createNode("Browse button,Check for existing file upload with message", "verify Browse button enabled and clickable and file upload ");
        Thread.sleep(2000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\subFleetUploadExst.exe");
        Thread.sleep(2000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();

        Assertion.assertEqual(t,txt,"Check for existing file upload",t1);
    }

    @Test(priority = 19)
    public void Browse_invalidMobileFileUploading() throws InterruptedException, IOException
    {
        String t="mobile number is invalid";
        ExtentTest t1 = pNode.createNode("Browse button,Check for invalid Mobile file upload with message", "Browse button,Check for invalid Mobile file upload with message ");
        Thread.sleep(2000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\invalidMobileInputWithRFormat.exe");
        Thread.sleep(2000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();

        Assertion.assertEqual(t,txt,"Check for invalid Mobile file upload",t1);
    }

    @Test(priority = 20)
    public void Browse_invalidEmailFileUploading() throws InterruptedException, IOException
    {
        String t="email is invalid";
        ExtentTest t1 = pNode.createNode("Browse button,Check for invalid Email file upload with message", "Browse button,Check for invalid Email file upload with message ");
        Thread.sleep(2000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\invaliEmaildInputWithRFormat.exe");
        Thread.sleep(2000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();

        Assertion.assertEqual(t,txt,"Browse button,Check for invalid Email file upload with message",t1);
    }

    @Test(priority = 21)
    public void Browse_invalidStatusFileUploading() throws InterruptedException, IOException
    {
        String t="status is invalid";
        ExtentTest t1 = pNode.createNode("Browse button,Check for invalid status file upload with message", "Browse button,Check for invalid status file upload with message ");
        Thread.sleep(2000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\invalidActiveInputWithRFormat.exe");
        Thread.sleep(2000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();

        Assertion.assertEqual(t,txt,"Browse button,Check for invalid status file upload with message",t1);
    }

    @Test(priority = 22)
    public void Browse_invalidFormatFileUploading() throws InterruptedException, IOException
    {
        String t="invalid format";
        ExtentTest t1 = pNode.createNode("Browse button,Check invalid format file upload with message", "Browse button,Check invalid format file upload with message ");
        Thread.sleep(2000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\invalidFormat.exe");
        Thread.sleep(2000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();

        Assertion.assertEqual(t,txt,"Browse button,Check invalid format file upload with message",t1);
    }

    @Test(priority = 23)
    public void Browse_EmptyFileUploading() throws InterruptedException, IOException
    {
        String t="file is empty";
        ExtentTest t1 = pNode.createNode("Browse button,Check empty file upload with message", "Browse button,Check empty file upload with message");
        Thread.sleep(2000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\Empty-import.exe");
        Thread.sleep(2000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();

        Assertion.assertEqual(t,txt,"Browse button,Check empty file upload with message",t1);
    }

    @Test(priority = 24)
    public void Browse_newFileUploading() throws InterruptedException, IOException
    {
        String t2="Successfully uploaded the customers!!";
        ExtentTest t1 = pNode.createNode("Browse button,Check for new file upload with message", "verify Browse button enabled and clickable and file upload ");
        Thread.sleep(3000);

        updateCellvalue.update("C:\\Users\\25004035\\Downloads\\newFleetupload.xlsx");
        Thread.sleep(2000);
        Fleet_Page.init(t1).imp_click();
        Fleet_Page.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\newFleetupload.exe");
        Thread.sleep(3000);
        Fleet_Page.init(t1).SubmitClick();
        String txt = Fleet_Page.init(t1).alert();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);

        String sss = Fleet_Page.init(t1).ttl();
        int ttlcnt2 = Integer.parseInt(sss);

        Assertion.assertEqual(t2,txt,"Check for new file upload",t1);
        Assertion.assertEqual(ttlcnt2,ttlcnt+1,"check total subfleet",t1);
    }

    @Test(priority = 25)
    public void checkIMPORTdownloadLink() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("verify download link of IMPORT", "verify download link of IMPORT");
        Fleet_Page.init(t1).imp_click();
        String s=Fleet_Page.init(t1).getDownloadImptag();
        Assertion.assertEqual(s,"a","comparing tag",t1);
    }

    @Test(priority = 26)
    public void checkIMPortDownloadexcel() throws InterruptedException, IOException
    {
        String fileName="customer-import-sample";
        String downloadFile = fileName.concat(".xlsx");
        String downloadPath = "C:\\Users\\25004035\\Documents";
        ExtentTest t1 = pNode.createNode("verify download of IMPORT", "verify download of IMPORT");
        Fleet_Page.init(t1).clickOnIMPdownloadLink();
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\ImportSaveAs.exe");
        Thread.sleep(2000);
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

    @Test(priority = 27)
    public void checkIMPORTdownload() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("verify download excel sheet of IMPORT", "verify download excel sheet of IMPORT");
       String rFile="customer-import-sample.xlsx";
      //  Fleet_Page.init(t1).clickOnIMPdownloadLink();
        //Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\ImportSaveAs.exe");
       // Thread.sleep(2000);
       // Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\saveAS.exe");
      //  Thread.sleep(2000);
        dFile=getFileName.recentFile("C:\\Users\\25004035\\Documents");
        System.out.println(dFile);

        Assertion.assertEqual(rFile,dFile,"Browse button,Check empty file upload with message",t1);


    }

    @Test(priority = 28)
    public void checkIMPORTdownloadValues() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("verify download excel sheet table heading of IMPORT", "verify download excel sheet table heading of IMPORT");

        String pathOftheFile=url.concat(dFile);
        ArrayList<String> a = getDownloadedExcelSheetData.getCellValue(pathOftheFile);
        ArrayList<String> b=new ArrayList<>();
        b.add("name");
        b.add("email");
        b.add("phone");
        b.add("address");
        b.add("city");
        b.add("state");
        b.add("pincode");
        b.add("active");

        for(String ab : b)
        {
            Assertion.verifyListContains(a,ab,"verify download excel sheet table heading of IMPORT",t1);

        }

    }

    @Test(priority = 29)
    public void click_on_export() throws IOException, InterruptedException
    {
            String downloadPath = "C:\\Users\\25004035\\Documents";
            String fileName = "customer_";
            String day = CurrentDate.date();
            String downloadFile = fileName.concat(day).concat(".csv");
            System.out.println("name "+downloadFile);
            ExtentTest t1 = pNode.createNode("export button,File download", "check for export button and file upload ");
            Thread.sleep(2000);
            Fleet_Page.init(t1).cickOnCancel();
            Thread.sleep(2000);
            Fleet_Page.init(t1).Export();
            Thread.sleep(2000);
            Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\download.exe");
            Thread.sleep(2000);
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
