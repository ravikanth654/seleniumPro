package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class clickOnCancelTest extends TestInit
{
    @Test
    public void Clickoncncl() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click On Cancel,add new fleet", "Clicking on cnacel");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        String url="https://stg-nemo.mahindraelectric.com/mcms/customers";
        SubFleetsPage.init(t1).cnclfleet();
        String crnturl = driver.getCurrentUrl();

        Assertion.verifyContains(crnturl,url,"Both Same",t1);
    }
}
