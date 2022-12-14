package tests.moduleName;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.Page_info.Fleet_DetailFleet_Page;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.util.common.Assertion;
import framework.util.propertyManagement.MessageReader;
import framework.util.reportManagement.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fleet_DetailFleet_Test extends TestInit
{
    private String Actual;
    private String Expected;

    @Test(priority = 0)
    public void Login_Fleet() throws Exception
    {

        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Fleet_Page.init(t1).mobility().fleets();
        Actual=driver.getCurrentUrl();

        Assertion.assertEqual(Actual, MessageReader.getMessage("URL1",null),"Verifing the Page",t1);
    }

    @Test(priority = 1)
    public void tableRowValue() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Table row value comparing with clicking on fleet table", "Take all table row");
        String name = Fleet_DetailFleet_Page.init(t1).getFleetName();
        System.out.println("fleet name "+name);
        String adrs = Fleet_DetailFleet_Page.init(t1).getAdress();
        System.out.println("fleet adress "+adrs);
        String maill = Fleet_DetailFleet_Page.init(t1).getEmail();
        System.out.println("fleet mail "+maill);
        String vehicls = Fleet_DetailFleet_Page.init(t1).getNoOfVehicles();
        System.out.println("Vehicles "+vehicls);
        String drvr = Fleet_DetailFleet_Page.init(t1).getNoOfDrivers();
        System.out.println("Drivers "+drvr);

        System.out.println("---------------------------------------------------------");

        Fleet_DetailFleet_Page.init(t1).clcikonfleet();
        Thread.sleep(2000);
        String inFleet = Fleet_DetailFleet_Page.init(t1).getsubfleetInside();
        System.out.println("infleet "+inFleet);
        String inMail = Fleet_DetailFleet_Page.init(t1).getMailInside();
        System.out.println("inMail "+inMail);
        String inphone = Fleet_DetailFleet_Page.init(t1).getPhoneInside();
        System.out.println("inPhone "+inphone);
        String inadress = Fleet_DetailFleet_Page.init(t1).getadressInsid();
        System.out.println("inAdress "+inadress);
        String vehiclesss = Fleet_DetailFleet_Page.init(t1).getnoOfvehicles();
        System.out.println("invehicles "+vehiclesss);
        String drvs = Fleet_DetailFleet_Page.init(t1).getnoOfdrivers();
        System.out.println("inAdress "+drvs);

        Assertion.assertEqual(name,inFleet," Fleet name same",t1);
        Assertion.assertEqual(maill,inMail," Email same",t1);
        Assertion.assertEqual(adrs,inadress," Adress same",t1);
        Assertion.assertEqual(vehicls,vehiclesss," no of vehilces",t1);
        Assertion.assertEqual(drvr,drvs," no of drivers",t1);

    }

    @Test(priority = 2)
    public void Table_columns()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Table headings of No of Vehicles Selected:", "verify table headings");
        ArrayList<String> nm = Fleet_DetailFleet_Page.init(t1).TblHeading();
        ArrayList<String> list = new ArrayList<String>();

        list.add("Sl. No.");
        list.add("VIN");
        list.add("LICENSE PLATE");
        list.add("MODEL");
        list.add("Sl. No.");
        list.add("DRIVER NAME");
        list.add("EMAIL");
        list.add("MOBILE");

        for (String a : list)
        {
            Assertion.verifyListContains(nm,a,"Comparing Table heading ",t1);
            System.out.println("List "+a);
        }

        Fleet_DetailFleet_Page.init(t1).goback();
    }

  /*  @Test(priority = 3)
    public void checkStatus() throws InterruptedException, IOException
    {
      ExtentTest t1 = pNode.createNode("Check for Status", "verify status");
      String statuss = Fleet_DetailFleet_Page.init(t1).getStatus();
      System.out.println("status " + statuss);
      Fleet_DetailFleet_Page.init(t1).clcikonfleet();
      Thread.sleep(2000);
      String st = Fleet_DetailFleet_Page.init(t1).getStatusInside();
      System.out.println("Instatus " + st);

      if (statuss.equals("InActive") && st.equals("ANABLE"))
      {
          t1.pass("Both status is same");
          t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
      }
      else if (statuss.equals("Active") && st.equals("DISABLE"))
      {
          t1.pass("Both status is same");
          t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
      }
      else
          {
          t1.fail("Not same");
          t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
      }
    }*/

    @Test(priority = 4)
    public void comparerows() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Check for rows count in detail page", "verify rows count");

          List<WebElement> lst1 = driver.findElements(By.xpath("//table[@class='table table-striped fixed_header']//tbody//tr"));
          int sz = lst1.size();
          System.out.println(sz);
          String vehiclesss = Fleet_DetailFleet_Page.init(t1).getnoOfvehicles();
          int c1 = Integer.parseInt(vehiclesss);
          String drvs = Fleet_DetailFleet_Page.init(t1).getnoOfdrivers();
          int c2 = Integer.parseInt(drvs);

          Assertion.assertEqual(c1,c2,"Both count ",t1);
    }

    @Test(priority = 5)
    public void edit() throws InterruptedException, IOException
    {
          ExtentTest t1 = pNode.createNode("Check edit", "edit");
          Fleet_DetailFleet_Page.init(t1).clickedit();
          String s = driver.getCurrentUrl();

          Assertion.verifyContains(s, "edit", "the page is navigated to edit page ", t1);
    }

    @Test(priority = 6)
    public void assignVehicles() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Check assigning vehicles", "assign vehicles");
        Fleet_DetailFleet_Page.init(t1).clickAssign();
        String s = driver.getCurrentUrl();

        Assertion.verifyContains(s, "edit", "the page is navigated to edit page ", t1);
    }

    @Test(priority = 7)
    public void assignDriver() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Check assigning vehicles", "assign vehicles");
        Fleet_DetailFleet_Page.init(t1).clickDriverAssign();
        String s = driver.getCurrentUrl();

        Assertion.verifyContains(s, "edit", "the page is navigated to edit page ", t1);
    }
}
