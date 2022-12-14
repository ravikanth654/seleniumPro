package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;
import java.util.List;

public class endToend_addNewFleetTest extends TestInit
{
    static String fleetName;
    static int ttlcntMain;
    JavascriptExecutor jse;
    @Test(priority = 0)
    public void clickOnSaveSuccessmsg() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Clicking on save ", "Clicking on save");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(7000);

        String sss = SubFleetsPage.init(t1).ttl();
        ttlcntMain = Integer.parseInt(sss);

        SubFleetsPage.init(t1).ClickonAddFleet();
//Name
        String s = null;
        fleetName = GeneratingRandom.fourchar(s);
        SubFleetsPage.init(t1).fleetNmae(fleetName);
//Mobile
        String m1 = null;
        String s2 = GeneratingRandom.tenNumber(m1);
        SubFleetsPage.init(t1).mobileNumber(s2);
//Gmail
        String m12 = null;
        String s22 = GeneratingRandom.gmail(m12);
        SubFleetsPage.init(t1).eMail(s22);
//Address
        String m111 = "rajajinagar";
        SubFleetsPage.init(t1).addresss(m111);

        SubFleetsPage.init(t1).assing();
        SubFleetsPage.init(t1).swap();

        SubFleetsPage.init(t1).drivers();
        SubFleetsPage.init(t1).driverswapping();
        jse = (JavascriptExecutor)driver;
        jse.executeScript("document.body.style.zoom = '80%';");
        WebElement el = driver.findElement(By.xpath("//input[@type='submit']"));
        jse.executeScript("arguments[0].click();", el);
Thread.sleep(2000);
        //SubFleetsPage.init(t1).clcikOnSave();
        String al2 = "customer created successfully!!";
        String al1=SubFleetsPage.init(t1).alert1();
      //  jse.executeScript("document.body.style.zoom = '100%';");
        Assertion.assertEqual(al2,al1,"Checking succesfully fleet create ",t1);

    }

    @Test(priority = 1)
    public void totalrowsCountWithNewfleet() throws InterruptedException, IOException
    {
        ExtentTest t1=pNode.createNode("total rows count","all rows");
        WebElement ell = driver.findElement(By.xpath("//button[.=' Cancel']"));
        jse.executeScript("arguments[0].click();", ell);
        //SubFleetsPage.init(t1).cnclfleet();
        driver.navigate().refresh();
        Thread.sleep(5000);
        String ssas = SubFleetsPage.init(t1).ttl();
        int ttlcntas = Integer.parseInt(ssas);
        System.out.println("aftr"+ttlcntas);
        System.out.println("bfore"+ttlcntMain);
        Assertion.assertEqual(ttlcntas,ttlcntMain+1,"Number of row count is same ",t1);
    }

   /* @Test(priority = 2)
    public void totalrowsCountWithRow() throws InterruptedException, IOException
    {
        ExtentTest t1=pNode.createNode("total rows count","all rows");
       // SubFleetsPage.init(t1).cnclfleet();
        Thread.sleep(2000);
        String ss = SubFleetsPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
       /* Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
        sl.selectByVisibleText("50");
        Thread.sleep(2000);
        List<WebElement> lst1 = driver.findElements(By.xpath("//tbody//tr"));
        int sz = lst1.size();*/
      /* String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int ssa = Integer.parseInt(s);

        Assertion.assertEqual(ttlcnt,ssa,"Number of row count is same ",t1);
    }

    @Test(priority = 3)
    public void verifyAssignedVehiclecount() throws Exception {
        ExtentTest t1 = pNode.createNode("verifyAssignedVehiclecount", "verifyAssignedVehiclecount ");

        SubFleetsPage.init(t1).search_sendvalue(fleetName);
        SubFleetsPage.init(t1).clickSearch();
        Thread.sleep(1000);
        String vehicls = SubFleetsPage.init(t1).getNoOfVehiclesCount();
        System.out.println("Vehicles "+vehicls);

        Assertion.assertEqual(vehicls, "1", "verifyAssignedVehiclecount", t1);
    }

    @Test(priority = 4)
    public void verifyAssignedDrivers() throws Exception {
        ExtentTest t1 = pNode.createNode("verifyAssignedDrivers ", "verifyAssignedDrivers ");


        Thread.sleep(1000);
        String drvr = SubFleetsPage.init(t1).getNoOfDriverCount();
        System.out.println("Drivers "+drvr);

        Assertion.assertEqual(drvr, "1", "verifyAssignedDrivers", t1);
    }


    @Test(priority = 5)
    public void customerUpdate() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Checking successfully driver update ", "Checking successfully driver update ");
        SubFleetsPage.init(t1).edit();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).clcikOnSave();
        String al2 = "customer detail updated successfully!!";
        String al1=SubFleetsPage.init(t1).alert1();
        Thread.sleep(3000);

        Assertion.assertEqual(al2,al1,"Checking successfully fleetName update ",t1);

    }

    @Test(priority = 6)
    public void removeAssignedVehicles() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Checking successfully vehicle update ", "Checking successfully vehicle update ");

        SubFleetsPage.init(t1).assing();
        Thread.sleep(2000);
        SubFleetsPage.init(t1).clickswappedNum();
        SubFleetsPage.init(t1).clcikOnSave();
        String al2 = "vehicle mapping updated successfully!!";
        String al1=SubFleetsPage.init(t1).alert1();
        Thread.sleep(3000);

        Assertion.assertEqual(al2,al1,"Checking successfully vehicle update ",t1);

    }

    @Test(priority = 7)
    public void removeAssigneddriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Checking successfully driver update ", "Checking successfully driver update ");

        SubFleetsPage.init(t1).drivers();
        Thread.sleep(2000);
        SubFleetsPage.init(t1).removeswappedDriver();
        SubFleetsPage.init(t1).clcikOnSave();
        String al2 = "driver updated successfully!!";
        String al1=SubFleetsPage.init(t1).alert1();

        Assertion.assertEqual(al2,al1,"Checking successfully driver update ",t1);

    }
*/
}
