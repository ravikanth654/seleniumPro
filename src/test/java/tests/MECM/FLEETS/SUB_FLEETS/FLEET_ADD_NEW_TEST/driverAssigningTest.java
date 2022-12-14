package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class driverAssigningTest extends TestInit
{
    @Test
    public void driverswap() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Clicking on driver and swapping  ", "driver swapping");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        SubFleetsPage.init(t1).drivers();
        String driverName = SubFleetsPage.init(t1).driverName();
        System.out.println("drivername "+driverName );
        SubFleetsPage.init(t1).driverswapping();
        Thread.sleep(2000);
        String drName = SubFleetsPage.init(t1).swappeddriverName();
        System.out.println("drivername2 "+drName );

        Assertion.assertEqual(driverName,drName,"Check for names",t1);
    }
}
