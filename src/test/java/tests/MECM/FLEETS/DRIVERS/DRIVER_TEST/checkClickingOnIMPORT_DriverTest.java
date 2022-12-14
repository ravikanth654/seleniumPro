package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.Page_info.Fleet_Driver_Page;
import framework.pageObjects.Page_info.Fleet_Page;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkClickingOnIMPORT_DriverTest extends TestInit
{
    @Test
    public void click_import() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verifing click", "verifing click ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();

        fleetDriverPage.init(t1).imp_click();
        String expect="Select the file to import";
        System.out.println("expected "+expect);
        Thread.sleep(3000);
        String aa = fleetDriverPage.init(t1).getpageValue();
        System.out.println(aa);

        Assertion.assertEqual(aa,expect,"Same",t1);
    }
}
