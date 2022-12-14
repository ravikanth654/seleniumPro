package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

public class editDriverTest extends TestInit
{
    String fName;
    String m1;
    String value;
    String s1a;
    String s1c;
    String m;
    String ln;
    String sx;
    @Test
    public void editDriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Edit driver", "Edit driver");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);

        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(5000);

        fName = fleetDriverPage.init(t1).takeFirstNameValue();
        System.out.println(" fName  "+fName);

        fleetDriverPage.init(t1).clearSecondName();
        String s11 = null;
        m1 = GeneratingRandom.fourchar(s11);
        fleetDriverPage.init(t1).sendSecondName(m1);
        String snt1 = fleetDriverPage.init(t1).secondNameText();
        System.out.println(" snt1  "+snt1);

        value = "Female";
        fleetDriverPage.init(t1).clcikOnGenderDropdown();
        fleetDriverPage.init(t1).clcikOnFemaleDropdown();
        String gt1 = fleetDriverPage.init(t1).genderText();
        System.out.println(gt1);

        fleetDriverPage.init(t1).mobileTextClear();

        String s = null;
        s1a = GeneratingRandom.tenNumber(s);
        fleetDriverPage.init(t1).sendMobilenumber(s1a);
        String mt1 = fleetDriverPage.init(t1).mobileText();
        System.out.println(mt1);

        fleetDriverPage.init(t1).emailTextClear();

        String sc = null;
        s1c = GeneratingRandom.gmail(sc);
        fleetDriverPage.init(t1).sendEmail(s1c);
        String emailt1 = fleetDriverPage.init(t1).emailText();
        System.out.println(emailt1);

        m = "12122000";
        fleetDriverPage.init(t1).date(m);
        String dobt1 = fleetDriverPage.init(t1).dobText();
        System.out.println(dobt1);

        fleetDriverPage.init(t1).licenceTextClear();
        ln = GeneratingRandom.Vin();
        fleetDriverPage.init(t1).sendLicence(ln);
        String lt1 = fleetDriverPage.init(t1).licenceText();
        System.out.println(lt1);

        sx = "12122020";
        fleetDriverPage.init(t1).exprdate(sx);
        String exptT1 = fleetDriverPage.init(t1).exprdateText();
        System.out.println(exptT1);

        fleetDriverPage.init(t1).adresClear();
        String sd = "ramanagar";
        fleetDriverPage.init(t1).adres(sd);

        WebElement element = driver.findElement(By.xpath("//input[@value='Save']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

        fleetDriverPage.init(t1).saveDriver();
        Thread.sleep(2000);
        fleetDriverPage.init(t1).search_CLear();
        fleetDriverPage.init(t1).search_sendvalue(fName);
        fleetDriverPage.init(t1).clickSearch();
        Thread.sleep(2000);

        String tname = fleetDriverPage.init(t1).NAME();
        String tgender = fleetDriverPage.init(t1).GENDER();
        String tdob = fleetDriverPage.init(t1).DOB();
        String tphone = fleetDriverPage.init(t1).PHONE();


        Assertion.verifyContains(tname,fName,"first name",t1);
        Assertion.verifyEqual(tgender,value,"gender",t1);
        Assertion.verifyEqual(tphone,s1a,"Check number",t1);

    }
}
