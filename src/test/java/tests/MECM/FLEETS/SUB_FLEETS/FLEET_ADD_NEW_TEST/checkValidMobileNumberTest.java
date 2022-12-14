package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class checkValidMobileNumberTest extends TestInit
{
    @Test
    public void check_mobileNumberField() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Eneter mobile number and validate ", "Mobile number validation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        SubFleetsPage.init(t1).mobileNumberClick();
        String m1=null;
        String s2 = GeneratingRandom.tenNumber(m1);
        SubFleetsPage.init(t1).mobileNumber(s2);
        SubFleetsPage.init(t1).mobileNumberClick();
        String act="form-control ng-untouched ng-dirty ng-valid";
        String s = SubFleetsPage.init(t1).mobilevalue();

        Assertion.assertEqual(act,s,"Valid mobile number",t1);
    }

}
