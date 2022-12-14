package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class clickOnAddFleetTest extends TestInit
{
    @Test
    public void ClickOnAddFleet() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click On AddFleet", "Clicking on add fleet ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        String actURL="https://stg-nemo.mahindraelectric.com/mcms/customer/new";
        String crntURL=driver.getCurrentUrl();

        Assertion.assertEqual(actURL,crntURL,"Both URL is Same",t1);
    }
}
