package tests.moduleName;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.Page_info.Fleet_AddFleet_Page;
import framework.pageObjects.Page_info.Fleet_DetailFleet_Page;
import framework.pageObjects.Page_info.Fleet_EditFleet_Page;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.util.common.Assertion;
import framework.util.reportManagement.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;
import tests.myMethods.excelReaderInvalidEmail;
import tests.myMethods.excelReaderInvalidMobile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fleet_Test_AddNewFleetTest extends TestInit
{
    static String fleetName;
    @Test(priority = 0)
    public void Login_Fleet() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Fleet_Page.init(t1).mobility().fleets();
    }

    @Test(priority = 1)
    public void check_addFleetenbled() throws IOException
    {
        ExtentTest t1 = pNode.createNode("AddFleet button,is enbled", "Clicking on add fleet ");
        boolean verifyAddfleet = Fleet_Page.init(t1).AddFleet_enbled();
        if(verifyAddfleet)
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

    @Test(priority = 2)
    public void ClickOnAddFleet() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Click On AddFleet", "Clicking on add fleet ");
        Fleet_Page.init(t1).ClickonAddFleet();
        String actURL="https://stg-nemo.mahindraelectric.com/mcms/customer/new";
        String crntURL=driver.getCurrentUrl();

            Assertion.assertEqual(actURL,crntURL,"Both URL is Same",t1);
    }

    @Test(priority = 3)
    public void Clickoncncl() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Click On Cancel,add new fleet", "Clicking on cnacel");
        String url="https://stg-nemo.mahindraelectric.com/mcms/customers";
        Fleet_Page.init(t1).cnclfleet();
        String crnturl = driver.getCurrentUrl();

        Assertion.verifyContains(crnturl,url,"Both Same",t1);
    }

    @Test(priority = 4)
    public void checkNewFleet_Username() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Eneter value in subfleet name ", "Eneter value in subfleet name ");
        Fleet_Page.init(t1).ClickonAddFleet();
        String s=null;
        fleetName = GeneratingRandom.fourchar(s);
        Fleet_AddFleet_Page.init(t1).fleetNmae(fleetName);
        String dd = Fleet_AddFleet_Page.init(t1).fltName();
        System.out.println("the value "+dd);

        Assertion.assertEqual(fleetName,dd,"Bothe same ",t1);
    }

    @Test(priority = 5)
    public void check_invalidmobileNumberLessthan10() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Eneter invalid mobile number and validate ", "invalid Mobile number validation");
        Fleet_AddFleet_Page.init(t1).mobileNumberClick();

        ArrayList<String> b = excelReaderInvalidMobile.GetData("InvalidMobileNumber");
        for (int i = 1; i < 7; i++) {
            Fleet_AddFleet_Page.init(t1).mobileNumber(b.get(i));
            Fleet_AddFleet_Page.init(t1).mobileNumberClick();
            String act = "form-control ng-untouched ng-invalid ng-dirty";
            String s = Fleet_AddFleet_Page.init(t1).mobilevalue();

            Assertion.assertEqual(act, s, "invalid mobile number", t1);
            Thread.sleep(1000);
            Fleet_AddFleet_Page.init(t1).mobileClear();
            Thread.sleep(1000);

        }
    }

    @Test(priority = 6)
    public void check_invalidmobileNumberMoreThan10() throws IOException, InterruptedException
    {

        ExtentTest t1 = pNode.createNode("Eneter invalid mobile number and validate ", "invalid Mobile number validation");
        Fleet_AddFleet_Page.init(t1).mobileNumberClick();
        Fleet_AddFleet_Page.init(t1).mobileClear();

        ArrayList<String> b = excelReaderInvalidMobile.GetData("InvalidMobileNumber");

        for(int i=7;i<=7;i++)
        {
            Fleet_AddFleet_Page.init(t1).mobileNumber(b.get(i));
            Fleet_AddFleet_Page.init(t1).mobileNumberClick();
            String act = "form-control ng-untouched ng-dirty ng-invalid";
            String s = Fleet_AddFleet_Page.init(t1).mobilevalue();

            Assertion.assertEqual(act, s, "invalid mobile number", t1);
            Thread.sleep(1000);
            Fleet_AddFleet_Page.init(t1).mobileClear();
            Thread.sleep(1000);

        }

    }

    @Test(priority = 7)
    public void check_mobileNumberField() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Eneter mobile number and validate ", "Mobile number validation");
        Fleet_AddFleet_Page.init(t1).mobileClear();
        Fleet_AddFleet_Page.init(t1).mobileNumberClick();
        String m1=null;
        String s2 = GeneratingRandom.tenNumber(m1);
        Fleet_AddFleet_Page.init(t1).mobileNumber(s2);
        Fleet_AddFleet_Page.init(t1).mobileNumberClick();
        String act="form-control ng-untouched ng-dirty ng-valid";
        String s = Fleet_AddFleet_Page.init(t1).mobilevalue();

        Assertion.assertEqual(act,s,"Valid mobile number",t1);
    }

    @Test(priority = 8)
    public void check_invalidEmail() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Eneter invalid mobile number and validate ", "invalid Mobile number validation");
        Fleet_AddFleet_Page.init(t1).emailClick();

        ArrayList<String> b = excelReaderInvalidEmail.GetData("InvalidEmail");
        for (int i = 1; i <=6; i++) {
            Fleet_AddFleet_Page.init(t1).eMail(b.get(i));
            Fleet_AddFleet_Page.init(t1).emailClick();
            String act = "form-control ng-untouched ng-invalid ng-dirty";
            String m =  Fleet_AddFleet_Page.init(t1).emailvalue();

            Assertion.assertEqual(act, m, "invalid Email", t1);
            Thread.sleep(1000);
            Fleet_AddFleet_Page.init(t1).clearemail();
            Thread.sleep(1000);

        }
    }

   @Test(priority = 9)
    public void check_emailField() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Eneter Email and validate ", "Email validation");
        String m1 = null;
        String s2 = GeneratingRandom.gmail(m1);
        Fleet_AddFleet_Page.init(t1).emailClick();
        Fleet_AddFleet_Page.init(t1).eMail(s2);
        Fleet_AddFleet_Page.init(t1).emailClick();
        String v="form-control ng-untouched ng-dirty ng-valid";
        String m =  Fleet_AddFleet_Page.init(t1).emailvalue();
        System.out.println("m"+m);

        Assertion.assertEqual(m,v,"Valid email",t1);
    }

    @Test(priority = 7)
    public void check_Address() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Eneter address and validate ", "Address validation");
        String m1 = "rajajinagar";
        Fleet_AddFleet_Page.init(t1).addressClick();
        Fleet_AddFleet_Page.init(t1).addresss(m1);
        Fleet_AddFleet_Page.init(t1).addressClick();
        String m =  Fleet_AddFleet_Page.init(t1).adressvalue();

        Assertion.assertEqual(m,m1,"Valid email",t1);
    }



    @Test(priority = 8)
    public void assigning() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Clicking on assign ", "Clicking on assign");
        Fleet_AddFleet_Page.init(t1).assing();
        String s="Available Vehicles";
        String a = Fleet_AddFleet_Page.init(t1).lable();
        System.out.println("-->"+a);

        Assertion.assertEqual(a, s, "Assigning vehicle page", t1);
    }

    @Test(priority = 9)
    public void swapingVehicles() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Clicking on assign vehicle and swapping  ", "vehicles swapping");
        Thread.sleep(1000);
        String a = Fleet_AddFleet_Page.init(t1).swapNum();
        System.out.println("a "+a);
        Thread.sleep(1000);
        Fleet_AddFleet_Page.init(t1).swap();
        Thread.sleep(1000);
        String b = Fleet_AddFleet_Page.init(t1).afterSwap();
        System.out.println("b "+b);

        Assertion.assertEqual(a,b,"Swapped number",t1);
    }

    @Test(priority = 10)
    public void assigndriver() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Clicking on assign driver and swapping  ", "driver swapping");
        String c = "Available Drivers";
        String b = Fleet_AddFleet_Page.init(t1).drivers().driver();

        Assertion.assertEqual(b,c,"same",t1);
    }

    @Test(priority = 11)
    public void driverswap() throws IOException, InterruptedException
    {

        ExtentTest t1 = pNode.createNode("Clicking on driver and swapping  ", "driver swapping");
        String driverName = Fleet_AddFleet_Page.init(t1).driverName();
        System.out.println("drivername "+driverName );
        Fleet_AddFleet_Page.init(t1).driverswapping();
        Thread.sleep(2000);
        String drName = Fleet_AddFleet_Page.init(t1).swappeddriverName();
        System.out.println("drivername2 "+drName );

        Assertion.assertEqual(driverName,drName,"Check for names",t1);
    }

    @Test(priority = 12)
    public void check_ClickOnsave() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Clicking on save  ", "clicking on save");
        Fleet_AddFleet_Page.init(t1).clcikOnSave();
        String al2 = "customer created successfully!!";
        String al1=Fleet_AddFleet_Page.init(t1).alert1();
        Assertion.assertEqual(al2,al1,"Checking succesfully fleet create ",t1);

    }

    @Test(priority = 13)
    public void totalrowsCount() throws InterruptedException, IOException
    {
        ExtentTest t1=pNode.createNode("total rows count","all rows");
        Fleet_Page.init(t1).cnclfleet();
        Thread.sleep(2000);
        String ss = Fleet_Page.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
        sl.selectByVisibleText("50");
        Thread.sleep(2000);
        List<WebElement> lst1 = driver.findElements(By.xpath("//tbody//tr"));
        int sz = lst1.size();
       /* String t = Fleet_AddFleet_Page.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int ss = Integer.parseInt(s);*/

        Assertion.assertEqual(ttlcnt,sz,"Number of row count is same ",t1);
    }

    @Test(priority = 14)
    public void verifyAssignedVehiclecount() throws Exception {
        ExtentTest t1 = pNode.createNode("verifyAssignedVehiclecount", "verifyAssignedVehiclecount ");

        Fleet_Page.init(t1).search_sendvalue(fleetName);
        Fleet_Page.init(t1).clickSearch();
        Thread.sleep(1000);
        String vehicls = Fleet_DetailFleet_Page.init(t1).getNoOfVehiclesCount();
        System.out.println("Vehicles "+vehicls);

        Assertion.assertEqual(vehicls, "1", "verifyAssignedVehiclecount", t1);
    }

    @Test(priority = 15)
    public void verifyAssignedDrivers() throws Exception {
        ExtentTest t1 = pNode.createNode("verifyAssignedDrivers ", "verifyAssignedDrivers ");


        Thread.sleep(1000);
        String drvr = Fleet_DetailFleet_Page.init(t1).getNoOfDriverCount();
        System.out.println("Drivers "+drvr);

        Assertion.assertEqual(drvr, "1", "verifyAssignedDrivers", t1);
    }


    @Test(priority = 16)
    public void customerUpdate() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Checking successfully driver update ", "Checking successfully driver update ");
        Fleet_EditFleet_Page.init(t1).edit();
        Thread.sleep(1000);
        Fleet_AddFleet_Page.init(t1).clcikOnSave();
        String al2 = "customer detail updated successfully!!";
        String al1=Fleet_AddFleet_Page.init(t1).alert1();
        Thread.sleep(3000);

        Assertion.assertEqual(al2,al1,"Checking successfully fleetName update ",t1);

    }

    @Test(priority = 17)
    public void removeAssignedVehicles() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Checking successfully vehicle update ", "Checking successfully vehicle update ");

        Fleet_AddFleet_Page.init(t1).assing();
        Thread.sleep(2000);
        Fleet_AddFleet_Page.init(t1).clickswappedNum();
        Fleet_AddFleet_Page.init(t1).clcikOnSave();
        String al2 = "vehicle mapping updated successfully!!";
        String al1=Fleet_AddFleet_Page.init(t1).alert1();
        Thread.sleep(3000);

        Assertion.assertEqual(al2,al1,"Checking successfully vehicle update ",t1);

    }

    @Test(priority = 18)
    public void removeAssigneddriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Checking successfully driver update ", "Checking successfully driver update ");

        Fleet_AddFleet_Page.init(t1).drivers();
        Thread.sleep(2000);
        Fleet_AddFleet_Page.init(t1).removeswappedDriver();
        Fleet_AddFleet_Page.init(t1).clcikOnSave();
        String al2 = "driver updated successfully!!";
        String al1=Fleet_AddFleet_Page.init(t1).alert1();

        Assertion.assertEqual(al2,al1,"Checking successfully driver update ",t1);

    }





}
