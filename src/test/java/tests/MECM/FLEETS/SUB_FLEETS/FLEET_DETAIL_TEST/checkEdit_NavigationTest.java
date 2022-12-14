package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkEdit_NavigationTest extends TestInit
{
    @Test
    public void checkEdit_Navigation() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Check edit", "edit");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).clcikonfleet();
        SubFleetsPage.init(t1).clickedit();
        String s = driver.getCurrentUrl();

        Assertion.verifyContains(s, "edit", "the page is navigated to edit page ", t1);
    }
}
