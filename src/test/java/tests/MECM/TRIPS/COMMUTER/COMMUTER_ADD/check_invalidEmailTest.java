package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.excelReaderInvalidEmail;

import java.io.IOException;
import java.util.ArrayList;

public class check_invalidEmailTest extends TestInit
{
    @Test
    public void check_invalidEmail() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Eneter invalid mobile number and validate ", "invalid Mobile number validation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(2000);
        commuter.init(t1).addCommuter();
        Thread.sleep(3000);

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
