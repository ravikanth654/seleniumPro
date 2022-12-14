package tests.moduleName;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.Page_info.Fleet_AddFleet_Page;
import framework.pageObjects.Page_info.Fleet_EditFleet_Page;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class Fleet_Test_EditFleetTest extends TestInit
{
    @Test(priority = 0)
    public void Login_Fleet() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Login test", "Login and compare subfleet URL");
        Login.init(t1).validLogin("MECM");
        Fleet_Page.init(t1).mobility().fleets();
    }

    @Test(priority = 1)
    public void clickOnfleetedit() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Click On edit Fleet", "Clicking on edit fleet ");
        Fleet_EditFleet_Page.init(t1).edit();
        String s = driver.getCurrentUrl();

        Assertion.verifyContains(s,"edit","matching",t1);
    }

   @Test(priority = 2)
    public void editfleetName() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Click On edit Fleet,edit fleet name", "Clicking on edit fleet ");
        Fleet_Page.init(t1).ClickonAddFleet();
        String s2="123";
        Fleet_EditFleet_Page.init(t1).fleetNmae(s2);
        String dd =   Fleet_EditFleet_Page.init(t1).fltName();
        System.out.println("the value "+dd);

        Assertion.verifyContains(dd,s2,"Pass",t1);
    }

    @Test(priority = 3)
    public void editMobileNumberField() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Eneter mobile number and validate ", "Mobile number validation");
        Fleet_AddFleet_Page.init(t1).mobileNumberClick();
        String m1="9999999999";
        Fleet_EditFleet_Page.init(t1).mobileNumberClick();
        Fleet_EditFleet_Page.init(t1).mobileClear();
        Fleet_EditFleet_Page.init(t1).mobileNumber(m1);
        Fleet_EditFleet_Page.init(t1).mobileNumberClick();
        String aa =   Fleet_EditFleet_Page.init(t1).mobileValuenumber();
        System.out.println("aa"+aa);

        Assertion.assertEqual(aa,m1," mobile number editable",t1);
    }

    @Test(priority = 4)
    public void editEmailField() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Eneter Email and validate ", "Email validation");
        String m1 = "more@gmail.com";
        Fleet_EditFleet_Page.init(t1).emailClick();
        Fleet_EditFleet_Page.init(t1).clearemail();
        Fleet_EditFleet_Page.init(t1).eMail(m1);
        Fleet_EditFleet_Page.init(t1).emailClick();
        String m2 =   Fleet_EditFleet_Page.init(t1).getEmailValue();
        System.out.println("m"+m2);

        Assertion.assertEqual(m2,m1,"Valid email",t1);
    }

    @Test(priority = 5)
    public void check_Address() throws IOException
    {
        ExtentTest t1 = pNode.createNode("Eneter address and validate ", "Address validation");
        String m1 = "ramanagar";
        Fleet_EditFleet_Page.init(t1).addressClick();
        Fleet_EditFleet_Page.init(t1).adressClear();
        Fleet_EditFleet_Page.init(t1).addresss(m1);
        Fleet_EditFleet_Page.init(t1).addressClick();
        String m =    Fleet_EditFleet_Page.init(t1).adressvalue();
        System.out.println("m"+m);

        Assertion.assertEqual(m,m1,"Valid email",t1);
    }

   // EditSave

}
