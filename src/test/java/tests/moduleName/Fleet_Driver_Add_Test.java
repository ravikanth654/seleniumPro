package tests.moduleName;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.Page_info.Fleet_Driver_Add_page;
import framework.pageObjects.Page_info.Fleet_Driver_Page;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.util.common.Assertion;
import framework.util.common.DataDriven;
import framework.util.propertyManagement.MessageReader;
import framework.util.reportManagement.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;
import tests.myMethods.PageScroll;
import tests.myMethods.excelReaderInvalidMobile;

import java.io.IOException;
import java.util.ArrayList;


public class Fleet_Driver_Add_Test extends TestInit
{
    String m1;
    String fnt1;
    String snt1;
    String gt1;
    String mt1;
    String emailt1;
    String dobt1;
    String lt1;
    String exptT1;
    String docImg;
    String docTxt;
    String doc;

    @Test(priority = 1)
    public void Login_Fleet() throws Exception
    {
        String Actual;
        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Thread.sleep(2000);
        Fleet_Page.init(t1).mobility().fleets();
        Actual = driver.getCurrentUrl();

        Assertion.assertEqual(Actual, MessageReader.getMessage("URL1", null), "Verifying the Page", t1);
    }

    @Test(priority = 2)
    public void clickingOnAddDriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on Drivers", "click on driver and compare URL");
        Fleet_Driver_Page.init(t1).clikOnDriver();
        String expectedUrl="https://stg-nemo.mahindraelectric.com/mcms/driver/new";
        Thread.sleep(1000);
        Fleet_Driver_Add_page.init(t1).clcikOnAddDriver();
        String actualUrl = driver.getCurrentUrl();

        Assertion.verifyContains(expectedUrl,actualUrl,"Comparing the URl clicking on add driver",t1);
    }

    @Test(priority = 3)
    public void cancel_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("1st name text field is enabled ", "1st name text field is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).isCancelEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 4)
    public void cancel_Click() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Click on cancel ", "cancel");
        String url="https://stg-nemo.mahindraelectric.com/mcms/drivers";
        Fleet_Driver_Add_page.init(t1).clcikOnCancel();
        String url2 = driver.getCurrentUrl();

        Assertion.assertEqual(url2,url,"Valid first name",t1);
    }


   @Test(priority = 5)
    public void firstName_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("1st name text field is enabled ", "1st name text field is enabled");
        Fleet_Driver_Add_page.init(t1).clcikOnAddDriver();
        boolean isIt =  Fleet_Driver_Add_page.init(t1).is1stNameEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 6)
    public void enter_FirstName() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Enter 1st name ", "1st name");
        String s1 = null;
        m1 = GeneratingRandom.fourchar(s1);
        Fleet_Driver_Add_page.init(t1).sendFirstName(m1);
        String status="form-control ng-untouched ng-dirty ng-valid";
        String v11 = Fleet_Driver_Add_page.init(t1).takeAtriFirstName();
        System.out.println(v11);

        Assertion.assertEqual(v11,status,"Valid first name",t1);
    }
@Test(priority = 7)
    public void second_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("second name text feild is enabled ", "second name text feild is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).issecondNameEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 8)
    public void enter_secondName() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Enter second name ", "second name");
        String s1 = null;
        String m1 = GeneratingRandom.fourchar(s1);
        Fleet_Driver_Add_page.init(t1).sendSecondName(m1);
        String status="form-control ng-untouched ng-dirty ng-valid";
        String v11 = Fleet_Driver_Add_page.init(t1).takeAtriSecondName();
        System.out.println(v11);

       Assertion.assertEqual(v11,status,"Valid second name",t1);
    }

    @Test(priority = 9)
    public void gender_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("gender field is enabled ", "gender field is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).isgenderEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }


    @Test(priority = 10)
    public void valuesOf_gender() throws Exception
    {
        ExtentTest t1 = pNode.createNode("values of gender ", "values of gender ");
        Fleet_Driver_Add_page.init(t1).clcikOnGenderDropdown();
        Thread.sleep(2000);
        ArrayList<String> mm = Fleet_Driver_Add_page.init(t1).dropdownvalues();
        ArrayList<String> ap =new ArrayList<>();
        ap.add("Male");
        ap.add("Female");

        for(String a : ap)
        {
            Assertion.verifyListContains(mm,a,"Comparing Table heading ",t1);
        }

    }

    @Test(priority = 11)
    public void select_gender() throws Exception
    {
        ExtentTest t1 = pNode.createNode("select gender ", "select gender ");
        String value = "Female";
        Fleet_Driver_Add_page.init(t1).clcikOnFemaleDropdown();
        String value1 = Fleet_Driver_Add_page.init(t1).takeAtrigenderDropdown();
        System.out.println("value1 "+value1);

        Assertion.assertEqual(value,value1,"Both same ",t1);
    }



   @Test(priority = 12)
    public void mobile_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("mobile field is enabled ", "gender field is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).ismobileEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

    @Test(priority = 13)
    public void enter_inValidmobile() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter invalid mobile ", "invalid mobile number ");
        ArrayList<String> invalidMobile = excelReaderInvalidMobile.GetData("InvalidMobileData");
        String status="orm-control ng-untouched ng-invalid ng-dirty";
        for(int i=1;i<5;i++)
        {
            String yes = invalidMobile.get(i);
            Fleet_Driver_Add_page.init(t1).sendMobilenumber(yes);
            Thread.sleep(2000);
            String v11 = Fleet_Driver_Add_page.init(t1).takeAtriMobile();
            Assertion.assertEqual(v11,status,"Valid first name",t1);
            Fleet_Driver_Add_page.init(t1).clearMobdata();

        }


    }

    @Test(priority = 13)
    public void enter_mobile() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter mobile ", "mobile number ");
        Fleet_Driver_Add_page.init(t1).clearMobdata();
        String s = null;
        String s1 = GeneratingRandom.tenNumber(s);
        Fleet_Driver_Add_page.init(t1).sendMobilenumber(s1);
        String status="form-control ng-untouched ng-dirty ng-valid";
        String v11 = Fleet_Driver_Add_page.init(t1).takeAtriMobile();
        System.out.println(v11);

        Assertion.assertEqual(v11,status,"Valid first name",t1);
    }


@Test(priority = 14)
    public void email_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("email field is enabled ", "emailfield is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).isEmailEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

   @Test(priority = 15)
    public void enter_email() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter email ", "email ");
        String s = null;
        String s1 = GeneratingRandom.gmail(s);
        Fleet_Driver_Add_page.init(t1).sendEmail(s1);
        String status="form-control ng-dirty ng-valid ng-touched";
        String v11 = Fleet_Driver_Add_page.init(t1).takeAtriEmail();
        System.out.println(v11);

        Assertion.assertEqual(v11,status,"Valid first name",t1);
    }

   @Test(priority = 16)
    public void date_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("date field is enabled ", "date field is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).isDateEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }


    @Test(priority = 17)
    public void click_Date() throws Exception
    {
        ExtentTest t1 = pNode.createNode("click_Date ", "click_Date ");
        String s1 = "12122000";
        Fleet_Driver_Add_page.init(t1).date(s1);
        String a="form-control ng-untouched ng-dirty ng-valid";
        String aa=Fleet_Driver_Add_page.init(t1).takeAtriDate();
        System.out.println(aa);

        Assertion.assertEqual(aa,a,"Valid first name",t1);

    }

    @Test(priority = 18)
    public void licence_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("licence field is enabled ", "licence field is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).islicenceEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }


    @Test(priority = 19)
    public void check_licence() throws Exception
    {
        ExtentTest t1 = pNode.createNode("check_licence", "check_licence");
        String ln = GeneratingRandom.Vin();
        Fleet_Driver_Add_page.init(t1).sendLicence(ln);
        String a="form-control ng-untouched ng-dirty ng-valid";
        String aa=Fleet_Driver_Add_page.init(t1).takeAtriLicence();
        System.out.println(aa);
        Assertion.assertEqual(aa,a,"Valid first name",t1);
    }

   @Test(priority = 20)
    public void exprDate_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("exprDate field is enabled ", "exprDate field is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).isExprDateEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }


   @Test(priority = 21)
    public void click_exprDate() throws Exception
    {
        ExtentTest t1 = pNode.createNode("click_exprDate ", "click_exprDate ");
        String s1 = "12122020";
        Fleet_Driver_Add_page.init(t1).exprdate(s1);
        String a="form-control ng-untouched ng-dirty ng-valid";
        String aa=Fleet_Driver_Add_page.init(t1).takeAtriExprDate();
        System.out.println(aa);
        Assertion.assertEqual(aa,a,"Valid first name",t1);

    }

    @Test(priority = 22)
    public void adres_enabled() throws Exception
    {
        ExtentTest t1 = pNode.createNode("adres field is enabled ", "adres field is enabled");
        boolean isIt =  Fleet_Driver_Add_page.init(t1).isAdresEnabled();
        if (isIt) {
            t1.pass("is enabled");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not enabled");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

   @Test(priority = 23)
    public void enter_address() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter_address ", "enter_address");
        String s1 = "ramanagar";
        Fleet_Driver_Add_page.init(t1).adres(s1);
        String a="form-control ng-untouched ng-dirty ng-valid";
        //form-control ng-dirty ng-valid ng-touched
        //form-control ng-dirty ng-valid ng-touched
        String aa=Fleet_Driver_Add_page.init(t1).takeAtriAdress();
        System.out.println(aa);
        Assertion.assertEqual(aa,a,"Valid adress name",t1);
    }

    @Test(priority =24)
    public void selectDoc() throws IOException {
        ExtentTest t1 = pNode.createNode("select doc and check it ", "select doc");
        ArrayList<String> docvalues=new ArrayList<>();
        docvalues.add("Driving Licence (Front)");
        docvalues.add("Driving Licence (Back)");
        docvalues.add("Pan Card");
        docvalues.add("Aadhar Card (Front)");
        docvalues.add("Aadhar Card (Back)");
        docvalues.add("Background Verification Document");
        docvalues.add("Police Verification Document");

        Fleet_Driver_Add_page.init(t1).clcikOnDocUpload();
        ArrayList<String> lst = Fleet_Driver_Add_page.init(t1).dropdownvaluesDoc();
        for(String a : docvalues)
        {
            Assertion.verifyListContains(lst,a,"comparing values",t1);
        }

    }

   @Test(priority =25)
    public void successfullyDriverCreate() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("select DLF doc and check it ", "select DLF doc");
        Fleet_Driver_Add_page.init(t1).clcikOnDLF();
        doc = Fleet_Driver_Add_page.init(t1).getDropdownValue();
        System.out.println("selected doc "+doc );
        String doc1 = Fleet_Driver_Add_page.init(t1).getDocTabValue();
        System.out.println("Table doc "+doc1 );
        Fleet_Driver_Add_page.init(t1).clcikOnBrowse();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(3000);
        docImg = Fleet_Driver_Add_page.init(t1).takeAtriDocimage();
        System.out.println(docImg);
        String img="image";
        docTxt = Fleet_Driver_Add_page.init(t1).takeAtriDocText();
        System.out.println(docTxt);
        String doctxt2="jpg";

        fnt1 = Fleet_Driver_Add_page.init(t1).firstNameText();
        System.out.println(fnt1);
        snt1 = Fleet_Driver_Add_page.init(t1).secondNameText();
        System.out.println(snt1);
        gt1 = Fleet_Driver_Add_page.init(t1).genderText();
        System.out.println(gt1);
        mt1 = Fleet_Driver_Add_page.init(t1).mobileText();
        System.out.println(mt1);
        emailt1 = Fleet_Driver_Add_page.init(t1).emailText();
        System.out.println(emailt1);
        dobt1 = Fleet_Driver_Add_page.init(t1).dobText();
        System.out.println(dobt1);
        lt1 = Fleet_Driver_Add_page.init(t1).licenceText();
        System.out.println(lt1);
        exptT1 = Fleet_Driver_Add_page.init(t1).exprdateText();
        System.out.println(exptT1);

        Fleet_Driver_Add_page.init(t1).saveDriver();
        Thread.sleep(2000);
        String alert="Driver Created Successfully.";
        String alert2 = Fleet_Driver_Add_page.init(t1).takeAlertText();
        System.out.println(alert2);


        Assertion.assertEqual(doc,doc1,"Comparing doc name",t1);
        Assertion.verifyContains(docImg,img,"Comparing the doc img",t1);
        Assertion.verifyContains(docTxt,doctxt2,"Comapring driver txt",t1);
        Assertion.assertEqual(alert2,alert,"Comparing alerts message",t1);
    }

    @Test(priority = 26)
    public void reCheckDriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("recheck driver entries  ", "recheck driver entries  ");
        Fleet_Driver_Page.init(t1).search_sendvalue(m1);
        Fleet_Driver_Page.init(t1).clickSearch();
        Thread.sleep(2000);
        Fleet_Driver_Add_page.init(t1).driverEdit();

        Thread.sleep(2000);

        String fnt = Fleet_Driver_Add_page.init(t1).firstNameText();
        System.out.println(fnt);
        String snt = Fleet_Driver_Add_page.init(t1).secondNameText();
        System.out.println(snt);
        String gt = Fleet_Driver_Add_page.init(t1).genderText();
        System.out.println(gt);
        String mt = Fleet_Driver_Add_page.init(t1).mobileText();
        System.out.println(mt);
        String emailt = Fleet_Driver_Add_page.init(t1).emailText();
        System.out.println(emailt);
        String dobt = Fleet_Driver_Add_page.init(t1).dobText();
        System.out.println(dobt);
        String lt = Fleet_Driver_Add_page.init(t1).licenceText();
        System.out.println(lt);
        String exptT = Fleet_Driver_Add_page.init(t1).exprdateText();
        System.out.println(exptT);
        String docImg1 = Fleet_Driver_Add_page.init(t1).takeAtriDocimage();
        System.out.println(docImg1);
        String docTxt1 = Fleet_Driver_Add_page.init(t1).takeAtriDocText();
        System.out.println(docTxt1);
        String doc1 = Fleet_Driver_Add_page.init(t1).getDropdownValue();

        Assertion.assertEqual(fnt,fnt1,"Comparing 1st name",t1);
        Assertion.assertEqual(snt, snt1, "Comparing 2nd name", t1);
        Assertion.assertEqual(gt,gt1,"Comparing gender name",t1);
        Assertion.assertEqual(mt,mt1,"Comparing mobile name",t1);
        Assertion.assertEqual(emailt,emailt1,"Comparing email name",t1);
        Assertion.assertEqual(dobt,dobt1,"Comparing dob name",t1);
        Assertion.assertEqual(lt,lt1,"Comparing lt name",t1);
      // Assertion.assertEqual(doc1,doc,"Comparing DocType name",t1);
        Assertion.assertEqual(docImg1,docImg,"Comparing docImg",t1);
        Assertion.assertEqual(docTxt1,docTxt,"Comparing DocText name",t1);
        Assertion.assertEqual(exptT,exptT1,"Comparing exprDate name",t1);
    }

    @Test(priority = 27)
    public void editDriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Edit driver", "Edit driver");
        String fName = Fleet_Driver_Add_page.init(t1).firstNameText();
        System.out.println(fName);
        Fleet_Driver_Add_page.init(t1).mobileTextClear();
        String s = null;
        String s1 = GeneratingRandom.tenNumber(s);
        System.out.println(s1);
        Fleet_Driver_Add_page.init(t1).sendMobilenumber(s1);
        Fleet_Driver_Add_page.init(t1).emailTextClear();
        String s11 = null;
        String s111 = GeneratingRandom.gmail(s);
        System.out.println(s111);
        Fleet_Driver_Add_page.init(t1).sendEmail(s111);
        Thread.sleep(2000);
        String a = "12122020";
        Fleet_Driver_Add_page.init(t1).exprdate(a);
        Thread.sleep(1000);
        Fleet_Driver_Add_page.init(t1).saveDriver();
        Thread.sleep(2000);
        Fleet_Driver_Add_page.init(t1).search_CLear();
        Fleet_Driver_Page.init(t1).search_sendvalue(fName);
        Fleet_Driver_Page.init(t1).clickSearch();
        Thread.sleep(2000);
        Fleet_Driver_Add_page.init(t1).driverEdit();
        Thread.sleep(2000);
        String mt = Fleet_Driver_Add_page.init(t1).mobileText();
        System.out.println(mt);
        String emailt = Fleet_Driver_Add_page.init(t1).emailText();
        System.out.println(emailt);


        Assertion.assertEqual(s1,mt,"Check mobile numbr",t1);
        Assertion.assertEqual(s111,emailt,"Check EMail",t1);

    }
    @Test(priority = 28)
    public void checkClickonArrow() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By licence plate ", "Search by licence plate ");
        String url="https://stg-nemo.mahindraelectric.com/mcms/drivers";
        Fleet_Driver_Add_page.init(t1).clickArrow();
        String url2 = driver.getCurrentUrl();

        Assertion.assertEqual(url2,url,"comparing the url",t1);

    }
    @Test(priority = 29)
    public void checkImageUpload() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Check for imag loaded alrt msg", "Check for imag loaded alrt msg ");
        //Fleet_Driver_Add_page.init(t1).driverEdit();
        Thread.sleep(2000);
       // Actions builder = new Actions(driver);
        driver.findElement(By.xpath("//input[@type='file']")).click();
        //Fleet_Driver_Add_page.init(t1). clickonDriverImageTodownload();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(2000);
        String alrt="Image updated Successfully!!";
        String alrt1 = Fleet_Driver_Add_page.init(t1).takeimageUploadtxt();

        Assertion.assertEqual(alrt1,alrt,"Comaprng alrt upload msg",t1);


    }
  /*  @Test(priority = 30)
    public void checkImagepresentorNot() throws Exception {
        ExtentTest t1 = pNode.createNode("Check for img is present  ", "img loading");
        Thread.sleep(2000);
       WebElement image = driver.findElement(By.xpath("//input[@class='dropify']"));
        Object result = ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && " + "typeof arguments[0].naturalWidth != \"undefined\" && " + "arguments[0].naturalWidth > 0", image);

        boolean loaded = false;
        if (result instanceof Boolean)
        {
            loaded = (Boolean) result;
            System.out.println("is " + loaded);
        }
        System.out.println("is " + loaded);
    }

        WebElement ImageFile = driver.findElement(By.xpath("//input[@class='dropify']"));

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent) {
            System.out.println("Image not displayed.");
        } else {
            System.out.println("Image displayed.");
        }
    }
*/


}
