package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkIMPORTdownloadLinkTest extends TestInit
{
    @Test
    public void checkIMPORTdownloadLink() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("verify download link of IMPORT", "verify download link of IMPORT");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).imp_click();
        String s=SubFleetsPage.init(t1).getDownloadImptag();
        Assertion.assertEqual(s,"a","comparing tag",t1);
    }
}
