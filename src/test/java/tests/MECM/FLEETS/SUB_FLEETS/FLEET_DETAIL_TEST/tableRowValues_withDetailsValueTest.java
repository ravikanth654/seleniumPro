package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class tableRowValues_withDetailsValueTest extends TestInit
{
    @Test
    public void tableRowValue() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Table row value comparing with clicking on fleet table", "Take all table row");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        String name = SubFleetsPage.init(t1).getFleetName();
        System.out.println("fleet name "+name);
        String adrs = SubFleetsPage.init(t1).getAdress();
        System.out.println("fleet adress "+adrs);
        String maill = SubFleetsPage.init(t1).getEmail();
        System.out.println("fleet mail "+maill);
        String vehicls = SubFleetsPage.init(t1).getNoOfVehicles();
        System.out.println("Vehicles "+vehicls);
        String drvr = SubFleetsPage.init(t1).getNoOfDrivers();
        System.out.println("Drivers "+drvr);

        System.out.println("---------------------------------------------------------");

        SubFleetsPage.init(t1).clcikonfleet();
        Thread.sleep(2000);
        String inFleet = SubFleetsPage.init(t1).getsubfleetInside();
        System.out.println("infleet "+inFleet);
        String inMail = SubFleetsPage.init(t1).getMailInside();
        System.out.println("inMail "+inMail);
        String inphone = SubFleetsPage.init(t1).getPhoneInside();
        System.out.println("inPhone "+inphone);
        String inadress = SubFleetsPage.init(t1).getadressInsid();
        System.out.println("inAdress "+inadress);
        String vehiclesss = SubFleetsPage.init(t1).getnoOfvehicles();
        System.out.println("invehicles "+vehiclesss);
        String drvs = SubFleetsPage.init(t1).getnoOfdrivers();
        System.out.println("inAdress "+drvs);


        Assertion.assertEqual(maill,inMail," Email same",t1);
        Assertion.assertEqual(adrs,inadress," Adress same",t1);
        Assertion.assertEqual(vehicls,vehiclesss," no of vehilces",t1);
        Assertion.assertEqual(drvr,drvs," no of drivers",t1);
        Assertion.assertEqual(name,inFleet," Fleet name same",t1);

    }

}
