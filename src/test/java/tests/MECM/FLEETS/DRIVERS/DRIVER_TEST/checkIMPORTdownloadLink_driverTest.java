package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkIMPORTdownloadLink_driverTest extends TestInit
{
    @Test
    public void checkIMPORTdownloadLink() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("verify download link of IMPORT", "verify download link of IMPORT");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clikOnDriver();

        fleetDriverPage.init(t1).imp_click();
        String s=fleetDriverPage.init(t1).getDownloadImptag();
        Assertion.assertEqual(s,"a","comparing tag",t1);
    }
}
