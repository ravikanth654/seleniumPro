package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

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
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class successfullyCommuterCreate_EndToEndTest extends TestInit
{
    String m1;
    String fnt1;
    String snt1;
    String gt1;
    String mt1;
    String emailt1;
    String dobt1;
    String dn;


    private int ttlcntMain;
    @Test
    public void successfullyDriverCreate() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("successfullyDriverCreate ", "successfullyDriverCreate");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(5000);
        String ttl = SubFleetsPage.init(t1).ttl();
        ttlcntMain = Integer.parseInt(ttl);
        System.out.println(ttlcntMain);
        commuter.init(t1).addCommuter();
        Thread.sleep(3000);

        String s = null;
        String s1a = GeneratingRandom.fourchar(s);
        commuter.init(t1).employeeid(s1a);
        mt1 = commuter.init(t1).employeeidValue();
        System.out.println(mt1);


        String s1 = null;
        m1 = GeneratingRandom.fourchar(s1);
        fleetDriverPage.init(t1).sendFirstName(m1);
        fnt1 = fleetDriverPage.init(t1).firstNameText();
        System.out.println(fnt1);


        String s11 = null;
        String m111 = GeneratingRandom.fourchar(s11);
        fleetDriverPage.init(t1).sendSecondName(m111);
        snt1 = fleetDriverPage.init(t1).secondNameText();
        System.out.println(snt1);


        String value = "Female";
        fleetDriverPage.init(t1).clcikOnGenderDropdown();
        fleetDriverPage.init(t1).clcikOnFemaleDropdown();
        gt1 = fleetDriverPage.init(t1).genderText();
        System.out.println(gt1);


        String sa = null;
        String s1aa = GeneratingRandom.tenNumber(sa);
        fleetDriverPage.init(t1).sendMobilenumber(s1aa);
        mt1 = fleetDriverPage.init(t1).mobileText();
        System.out.println(mt1);


        String sc = null;
        String s1c = GeneratingRandom.gmail(sc);
        fleetDriverPage.init(t1).sendEmail(s1c);
        emailt1 = fleetDriverPage.init(t1).emailText();
        System.out.println(emailt1);


        String m = "12122000";
        fleetDriverPage.init(t1).date(m);
        dobt1 = fleetDriverPage.init(t1).dobText();
        System.out.println(dobt1);


        String sd = "ramanagar";
        fleetDriverPage.init(t1).adres(sd);


        String s111 = null;
        String m1111 = GeneratingRandom.fourchar(s111);
        commuter.init(t1).department(m1111);
        dn = commuter.init(t1).departmentName();
        System.out.println(dn);


        String scr = null;
        String s1cs = GeneratingRandom.gmail(scr);
        commuter.init(t1).aproversendEmail(s1cs);
        emailt1 = commuter.init(t1).aproveremailText();
        System.out.println(emailt1);

        WebElement element=driver.findElement(By.xpath("//input[@value='Save']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
        fleetDriverPage.init(t1).saveCommuter();
        Thread.sleep(2000);
        String alert="Commuter Created Successfully.";
        String alert2 = fleetDriverPage.init(t1).takeAlertText();
        System.out.println(alert2);

        Assertion.assertEqual(alert2,alert,"Comparing alerts message",t1);
    }


    @Test(priority = 1)
    public void totalrowsCountWithNewfleet() throws InterruptedException, IOException
    {
        ExtentTest t1=pNode.createNode("total rows count","all rows");
        // SubFleetsPage.init(t1).cnclfleet();
        driver.navigate().refresh();
        WebElement element=driver.findElement(By.xpath("//span[.='COMMUTERS']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
        driver.navigate().refresh();
        Thread.sleep(5000);
        commuter.init(t1).commuters();
        Thread.sleep(5000);
        String ssas = SubFleetsPage.init(t1).ttl();
        int ttlcntas = Integer.parseInt(ssas);
        System.out.println("aftr"+ttlcntas);
        System.out.println("bfore"+ttlcntMain);
        Assertion.assertEqual(ttlcntas,ttlcntMain+1,"Number of row count is same ",t1);
    }

    @Test(priority = 2)
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
        String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        int ssa = Integer.parseInt(s);

        Assertion.assertEqual(ttlcnt,ssa,"Number of row count is same ",t1);
    }

    @Test(priority = 3)
    public void reCheckCommuter() throws Exception {
        ExtentTest t1 = pNode.createNode("recheck driver entries  ", "recheck driver entries  ");
        fleetDriverPage.init(t1).search_sendvalue(m1);
        fleetDriverPage.init(t1).clickSearch();
        Thread.sleep(2000);
        commuter.init(t1).commuterEdit();

        Thread.sleep(3000);

        String id = commuter.init(t1).employeeidValue();
        String fnt = fleetDriverPage.init(t1).firstNameText();
        String snt = fleetDriverPage.init(t1).secondNameText();
        String gt = fleetDriverPage.init(t1).genderText();
        String mt = fleetDriverPage.init(t1).mobileText();
        String emailt = fleetDriverPage.init(t1).emailText();
        String dobt = fleetDriverPage.init(t1).dobText();
        String dn = commuter.init(t1).departmentName();
        String mail = commuter.init(t1).aproveremailText();

        Assertion.assertEqual(id,mt1,"Comparing 1st name",t1);
        Assertion.assertEqual(fnt,fnt1,"Comparing 1st name",t1);
        Assertion.assertEqual(snt, snt1, "Comparing 2nd name", t1);
        Assertion.assertEqual(gt,gt1,"Comparing gender name",t1);
        Assertion.assertEqual(mt,mt1,"Comparing mobile name",t1);
        Assertion.assertEqual(emailt,emailt1,"Comparing email name",t1);
        Assertion.assertEqual(dobt,dobt1,"Comparing dob name",t1);
        Assertion.assertEqual(emailt,dn,"Comparing email name",t1);
        Assertion.assertEqual(dobt,emailt1,"Comparing dob name",t1);

    }

}

