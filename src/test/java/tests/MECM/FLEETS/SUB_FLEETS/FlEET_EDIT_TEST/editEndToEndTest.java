package tests.MECM.FLEETS.SUB_FLEETS.FlEET_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class editEndToEndTest extends TestInit
{
    static String Newfleet;
    static String fEmai;
    static String fnumber;
    static String fadres;
    @Test(priority = 0)
    public void editEndToEnd() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("editEndToEnd ", "editEndToEnd");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        String name = SubFleetsPage.init(t1).getsecondFleetname();
        System.out.println("fleet name "+name);
        String adrs = SubFleetsPage.init(t1).getsecondAdres();
        System.out.println("fleet adress "+adrs);
        String maill = SubFleetsPage.init(t1).getsecondEmail();
        System.out.println("fleet mail "+maill);

        Thread.sleep(2000);

        SubFleetsPage.init(t1).secondeditClick();

        Thread.sleep(2000);

        SubFleetsPage.init(t1).fleetNameClear();
        String s=null;
        String b="b";
        String fleetName = null;
        fleetName = GeneratingRandom.fourchar(s);
        Newfleet=b.concat(fleetName);
        SubFleetsPage.init(t1).fleetNmae(Newfleet);

        SubFleetsPage.init(t1).clearemail();
        String m1 = null;
        fEmai = GeneratingRandom.gmail(m1);
        //SubFleetsPage.init(t1).clickEmail();
        SubFleetsPage.init(t1).eMail(fEmai);

        SubFleetsPage.init(t1).mobileClear();
        String m11=null;
        fnumber = GeneratingRandom.tenNumber(m11);
        SubFleetsPage.init(t1).mobileNumber(fnumber);

        SubFleetsPage.init(t1).adressClear();
        fadres = "rajajinagar";
        SubFleetsPage.init(t1).addresss(fadres);

        SubFleetsPage.init(t1).clcikOnSave();

        String al2 = "customer detail updated successfully!!";
        String al1=SubFleetsPage.init(t1).alert1();
        Assertion.assertEqual(al2,al1,"editEndToEnd",t1);
    }

   @Test(priority = 1)
    public void recheckEdited() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("recheck after edit ", "recheck after edit");
        SubFleetsPage.init(t1).cnclfleet();
        driver.navigate().refresh();
        Thread.sleep(2000);

        SubFleetsPage.init(t1).search_sendvalue(Newfleet).clickSearch();
        Thread.sleep(2000);
        String name = SubFleetsPage.init(t1).getFirstRowName();
        System.out.println("fleet name "+name);
        String adrs = SubFleetsPage.init(t1).getFirstAdress();
        System.out.println("fleet adress "+adrs);
        String maill = SubFleetsPage.init(t1).getfirstRowEmail();
        System.out.println("fleet mail "+maill);

        Assertion.assertEqual(Newfleet,name,"Same FleetName",t1);
        Assertion.assertEqual(fadres,adrs,"Same Address",t1);
        Assertion.assertEqual(fEmai,maill,"Same Mail",t1);

    }
}
