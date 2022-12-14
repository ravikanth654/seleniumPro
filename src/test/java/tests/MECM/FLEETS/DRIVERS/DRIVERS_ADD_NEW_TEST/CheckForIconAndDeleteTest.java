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

public class CheckForIconAndDeleteTest extends TestInit {
    @Test(priority = 0)
    public void CheckForIconAndDelete() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("CheckForIconAndDelete ", "CheckForIconAndDelete");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);

        fleetDriverPage.init(t1).clcikOnAddDriver();
        Thread.sleep(1000);

        String s1 = null;
        String m1 = GeneratingRandom.fourchar(s1);
        fleetDriverPage.init(t1).sendFirstName(m1);

        String s11 = null;
        String m11 = GeneratingRandom.fourchar(s11);
        fleetDriverPage.init(t1).sendSecondName(m11);


        String value = "Female";
        fleetDriverPage.init(t1).clcikOnGenderDropdown();
        fleetDriverPage.init(t1).clcikOnFemaleDropdown();


        String s = null;
        String s1a = GeneratingRandom.tenNumber(s);
        fleetDriverPage.init(t1).sendMobilenumber(s1a);


        String sc = null;
        String s1c = GeneratingRandom.gmail(sc);
        fleetDriverPage.init(t1).sendEmail(s1c);


        String m = "12122000";
        fleetDriverPage.init(t1).date(m);


        String ln = GeneratingRandom.Vin();
        fleetDriverPage.init(t1).sendLicence(ln);


        String sx = "12122020";
        fleetDriverPage.init(t1).exprdate(sx);


        String sd = "ramanagar";
        fleetDriverPage.init(t1).adres(sd);


        fleetDriverPage.init(t1).clcikOnDocUpload();
        fleetDriverPage.init(t1).clcikOnDLF();
        String doc = fleetDriverPage.init(t1).getDropdownValue();
        System.out.println("selected doc " + doc);
        fleetDriverPage.init(t1).clcikOnBrowse();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(7000);
        /*String docUp="Document uploaded Successfully!!";
        String docUp2=fleetDriverPage.init(t1).takeAlertText();
        System.out.println(docUp2);*/

        String docImg = fleetDriverPage.init(t1).takeAtriDocimage();
        System.out.println(docImg);
        String img = "image";
        String docTxt = fleetDriverPage.init(t1).takeAtriDocText();
        System.out.println(docTxt);
        String doctxt2 = "jpg";
        fleetDriverPage.init(t1).saveDriver();

        fleetDriverPage.init(t1).search_sendvalue(m1);
        fleetDriverPage.init(t1).clickSearch();
        Thread.sleep(2000);
        fleetDriverPage.init(t1).driverEdit();

        Thread.sleep(2000);

        fleetDriverPage.init(t1).clcikOnIcon();
        Thread.sleep(5000);

        String title = fleetDriverPage.init(t1).iconHeader();
      //  Assertion.verifyEqual(docUp,docUp2,"Both same",t1);
        Assertion.assertEqual(doc,title,"Both same",t1);

        fleetDriverPage.init(t1).closePic();
    }

    @Test(priority = 1)
    public void swapPic() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("swapPic ", "swapPic");

        String imagename = fleetDriverPage.init(t1).takeAtriDocText();
        System.out.println(imagename);
        if(imagename.contains("testingpic.jpg"))
        {
            fleetDriverPage.init(t1).swappingPic();
            Thread.sleep(3000);
            Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\anotherPicjpg.exe");
            Thread.sleep(3000);
            String imagenameNow = fleetDriverPage.init(t1).takeAtriDocText();
            boolean is;
            if(is=imagenameNow.contains("anotherPic"))
            {
                Assertion.assertEqual(is,true,"Ya true",t1);
            }
            else
            {
                t1.fail("its failed");
            }
        }
        else
        {
            Thread.sleep(3000);
            Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
            Thread.sleep(3000);
            String imagenameNow = fleetDriverPage.init(t1).takeAtriDocText();
            System.out.println(imagenameNow);
            boolean is;
            if(is=imagenameNow.contains("testingpic.jpg"))
            {
                Assertion.assertEqual(is,true,"Ya true",t1);
            }
            else
            {
                t1.fail("its failed");
            }
        }



    }


    @Test(priority = 2)
    public void deleteUploadPic() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("deleteUploadPic ", "deleteUploadPic");
        Thread.sleep(3000);
        boolean isit = fleetDriverPage.init(t1).isDocDisplayed();
        System.out.println("true----"+isit);
        Thread.sleep(3000);
        fleetDriverPage.init(t1).deleteUploadPic();
        Thread.sleep(3000);
        boolean isnot = fleetDriverPage.init(t1).isDocDisplayed();
        System.out.println("false------"+isnot);
       /*String alrt="Document deleted Successfully!!";
        String alrt2 = fleetDriverPage.init(t1).takeAlertText();
        System.out.println(alrt2);
*/
        //Assertion.verifyEqual(alrt,alrt2,"message",t1);

       Assertion.assertEqual(isnot,false,"deleted",t1);



    }


}
