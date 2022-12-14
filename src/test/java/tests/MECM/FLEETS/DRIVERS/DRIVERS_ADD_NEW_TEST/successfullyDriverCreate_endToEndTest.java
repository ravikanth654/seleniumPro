package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class successfullyDriverCreate_endToEndTest extends TestInit
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
    static int ttlcntMain;
    @Test(priority = 0)
    public void successfullyDriverCreate() throws IOException, InterruptedException
    {

        ExtentTest t1 = pNode.createNode("successfullyDriverCreate ", "successfullyDriverCreate");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(9000);
        String ttl = SubFleetsPage.init(t1).ttl();
        System.out.println(ttl);
        Thread.sleep(2000);
        ttlcntMain=Integer.parseInt(ttl);

        fleetDriverPage.init(t1).clcikOnAddDriver();
        Thread.sleep(1000);

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

        String s = null;
        String s1a = GeneratingRandom.tenNumber(s);
        fleetDriverPage.init(t1).sendMobilenumber(s1a);
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

        String ln = GeneratingRandom.Vin();
        fleetDriverPage.init(t1).sendLicence(ln);
        lt1 = fleetDriverPage.init(t1).licenceText();
        System.out.println(lt1);


        String sx = "12122020";
        fleetDriverPage.init(t1).exprdate(sx);
        exptT1 = fleetDriverPage.init(t1).exprdateText();
        System.out.println(exptT1);

        String sd = "ramanagar";
        fleetDriverPage.init(t1).adres(sd);


        fleetDriverPage.init(t1).clcikOnDocUpload();
        fleetDriverPage.init(t1).clcikOnDLF();
        doc = fleetDriverPage.init(t1).getDropdownValue();
        System.out.println("selected doc "+doc );
        fleetDriverPage.init(t1).clcikOnBrowse();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(3000);
        docImg = fleetDriverPage.init(t1).takeAtriDocimage();
        System.out.println(docImg);
        String img="image";
        docTxt = fleetDriverPage.init(t1).takeAtriDocText();
        System.out.println(docTxt);
        String doctxt2="jpg";


        fleetDriverPage.init(t1).saveDriver();
        Thread.sleep(2000);
        String alert="Driver Created Successfully.";
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
        Thread.sleep(5000);
        fleetDriverPage.init(t1).clikOnDriver();
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
    public void reCheckDriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("recheck driver entries  ", "recheck driver entries  ");
        fleetDriverPage.init(t1).search_sendvalue(m1);
        fleetDriverPage.init(t1).clickSearch();
        Thread.sleep(2000);
        fleetDriverPage.init(t1).driverEdit();

        Thread.sleep(7000);

        String fnt = fleetDriverPage.init(t1).firstNameText();
        System.out.println(fnt);
        String snt = fleetDriverPage.init(t1).secondNameText();
        System.out.println(snt);
        String gt = fleetDriverPage.init(t1).genderText();
        System.out.println(gt);
        String mt = fleetDriverPage.init(t1).mobileText();
        System.out.println(mt);
        String emailt = fleetDriverPage.init(t1).emailText();
        System.out.println(emailt);
        String dobt = fleetDriverPage.init(t1).dobText();
        System.out.println(dobt);
        String lt = fleetDriverPage.init(t1).licenceText();
        System.out.println(lt);
        String exptT = fleetDriverPage.init(t1).exprdateText();
        System.out.println(exptT);
        String docImg1 = fleetDriverPage.init(t1).takeAtriDocimage();
        System.out.println(docImg1);
        String docTxt1 = fleetDriverPage.init(t1).takeAtriDocText();
        System.out.println(docTxt1);
        String doc1 = fleetDriverPage.init(t1).getDropdownValue();

        Assertion.assertEqual(fnt,fnt1,"Comparing 1st name",t1);
        Assertion.assertEqual(snt, snt1, "Comparing 2nd name", t1);
        Assertion.assertEqual(gt,gt1,"Comparing gender name",t1);
        Assertion.assertEqual(mt,mt1,"Comparing mobile name",t1);
        Assertion.assertEqual(emailt,emailt1,"Comparing email name",t1);
        Assertion.assertEqual(dobt,dobt1,"Comparing dob name",t1);
        Assertion.assertEqual(lt,lt1,"Comparing lt name",t1);

        Assertion.assertEqual(docImg1,docImg,"Comparing docImg",t1);
        Assertion.assertEqual(docTxt1,docTxt,"Comparing DocText name",t1);
        Assertion.assertEqual(exptT,exptT1,"Comparing exprDate name",t1);
    }





}
