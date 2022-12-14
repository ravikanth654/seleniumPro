package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

public class driverIsNotAssociatedWithAnySubFleetTest extends TestInit
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
    @Test
    public void driverIsNotAssociatedWithAnySubFleet() throws Exception {
        ExtentTest t1 = pNode.createNode("driverIsNotAssociatedWithAnySubFleet", "driverIsNotAssociatedWithAnySubFleet");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clikOnDriver();

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

        Thread.sleep(3000);
        fleetDriverPage.init(t1).search_sendvalue(m1);
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
        String alrt2 = "Driver is not associated with any sub fleet";



        Assertion.assertEqual(alrt1,alrt2,"same",t1);


    }
}
