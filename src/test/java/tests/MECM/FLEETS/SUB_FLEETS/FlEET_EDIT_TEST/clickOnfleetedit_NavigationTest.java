package tests.MECM.FLEETS.SUB_FLEETS.FlEET_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class clickOnfleetedit_NavigationTest extends TestInit
{
    @Test
    public void clickOnfleetedit() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click On edit Fleet", "Clicking on edit fleet ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).edit();
        String s = driver.getCurrentUrl();

        Assertion.verifyContains(s,"edit","matching",t1);
    }
}
