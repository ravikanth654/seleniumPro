package tests.MECM.TRIPS.COMMUTER.COMMUTER_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

public class editCommuterTest extends TestInit
{

    String fName;
    String m1;
    String value;
    String s1a;
    String s1c;
    String m;


    @Test
    public void editDriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Edit driver", "Edit driver");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(6000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(2000);
        commuter.init(t1).commuterEdit();
        Thread.sleep(2000);

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


        fleetDriverPage.init(t1).adresClear();
        String sd = "ramanagar";
        fleetDriverPage.init(t1).adres(sd);

        //fleetDriverPage.init(t1).adresClear();
        String sdd = "ravikant@mahindra.com";
        fleetDriverPage.init(t1).aprover(sdd);

        String s111 = null;
        String m1111 = GeneratingRandom.fourchar(s111);
        commuter.init(t1).department(m1111);
        String dn = commuter.init(t1).departmentName();
        System.out.println(dn);


        WebElement element=driver.findElement(By.xpath("//input[@value='Update']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
        fleetDriverPage.init(t1).Update();
        Thread.sleep(2000);

        commuter.init(t1).commuters();
        Thread.sleep(3000);
        fleetDriverPage.init(t1).search_CLear();
        fleetDriverPage.init(t1).search_sendvalue(fName);
        fleetDriverPage.init(t1).clickSearch();
        Thread.sleep(3000);

        String tname = fleetDriverPage.init(t1).NAME();
        String tgender = fleetDriverPage.init(t1).GENDER();//mobile
        String tdob = fleetDriverPage.init(t1).DOB();//email



        Assertion.verifyContains(tname,fName,"first name",t1);
        Assertion.verifyEqual(mt1,tgender,"mobile",t1);
        Assertion.verifyEqual(emailt1,tdob,"Email",t1);

    }
}
