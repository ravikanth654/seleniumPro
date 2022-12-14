package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

public class vehicleIsNotAssociatedWithAnySubFleetTest extends TestInit {
    String driverName;
    String fleetName;
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

    @Test
    public void vehicleIsNotAssociatedWithAnySubFleet() throws Exception {
        ExtentTest t1 = pNode.createNode("vehicleIsNotAssociatedWithAnySubFleet", "vehicleIsNotAssociatedWithAnySubFleet");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clikOnDriver();

        fleetDriverPage.init(t1).clcikOnAddDriver();
        Thread.sleep(1000);

        String s1 = null;
        driverName = GeneratingRandom.fourchar(s1);
        fleetDriverPage.init(t1).sendFirstName(driverName);
        System.out.println("driver "+driverName);
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
        System.out.println("selected doc " + doc);
        fleetDriverPage.init(t1).clcikOnBrowse();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(3000);
        fleetDriverPage.init(t1).saveDriver();
        Thread.sleep(3000);
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(3000);


        SubFleetsPage.init(t1).ClickonAddFleet();
//Name
        String sss = null;
        fleetName = GeneratingRandom.fourchar(sss);
        System.out.println("fleetname "+fleetName);
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
        String m1111 = "rajajinagar";
        SubFleetsPage.init(t1).addresss(m1111);
        SubFleetsPage.init(t1).drivers();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[.='Available Drivers']/..//p[contains(.,"+ driverName +")]")).click();
        SubFleetsPage.init(t1).clcikOnSave();

        fleetDriverPage.init(t1).clikOnDriver();

        Thread.sleep(3000);
        fleetDriverPage.init(t1).search_sendvalue(driverName);
        fleetDriverPage.init(t1).clickSearch();
        Thread.sleep(2000);
        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);
        fleetDriverPage.init(t1).assignVehiclesInEdit();
        Thread.sleep(2000);

        fleetDriverPage.init(t1).clickingOnavailable();
        fleetDriverPage.init(t1).clcikingOnAssign();
        Thread.sleep(2000);
        String alrt1 = fleetDriverPage.init(t1).takeAlertText();
        System.out.println(alrt1);
String msg="";
        Assertion.assertEqual(2,5,"faild",t1);



    }
}
