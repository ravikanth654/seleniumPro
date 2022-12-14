package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.excelReaderInvalidEmail;

import java.io.IOException;
import java.util.ArrayList;

public class checkAll_invalidEmailTest extends TestInit
{
    @Test
    public void check_invalidEmail() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Eneter invalid mobile number and validate ", "invalid Mobile number validation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        Thread.sleep(2000);
        SubFleetsPage.init(t1).clickEmail();

        ArrayList<String> b = excelReaderInvalidEmail.GetData("InvalidEmail");
        for (int i = 1; i <=6; i++) {
            SubFleetsPage.init(t1).eMail(b.get(i));
            SubFleetsPage.init(t1).clickEmail();
            String act = "form-control ng-untouched ng-invalid ng-dirty";
            String m =  SubFleetsPage.init(t1).emailvalues();

            Assertion.assertEqual(act, m, "invalid Email", t1);
            Thread.sleep(1000);
            SubFleetsPage.init(t1).clearemail();
            Thread.sleep(1000);

        }
    }
}
