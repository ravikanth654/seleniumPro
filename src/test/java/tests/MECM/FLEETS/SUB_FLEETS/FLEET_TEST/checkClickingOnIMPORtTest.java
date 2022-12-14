package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkClickingOnIMPORtTest extends TestInit
{
    @Test(priority = 0)
    public void click_import() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Import button,verifying click", "verifying click ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).imp_click();
        Thread.sleep(2000);
        String expect="Select the file to import";
        System.out.println("expected "+expect);
        Thread.sleep(2000);
        String aa = SubFleetsPage.init(t1).getpageValue();
        System.out.println(aa);

        Assertion.assertEqual(aa,expect,"Import button,verifying click",t1);
    }

}
