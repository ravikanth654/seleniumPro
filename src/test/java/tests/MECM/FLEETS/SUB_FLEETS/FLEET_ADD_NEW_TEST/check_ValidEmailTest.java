package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class check_ValidEmailTest extends TestInit
{
    @Test
    public void check_emailField() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Eneter Email and validate ", "Email validation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        Thread.sleep(2000);
       // SubFleetsPage.init(t1).clickEmail();
        String m1 = null;
        String s2 = GeneratingRandom.gmail(m1);
        SubFleetsPage.init(t1).clickEmail();
        SubFleetsPage.init(t1).eMail(s2);
        SubFleetsPage.init(t1).clickEmail();
        String v="form-control ng-untouched ng-dirty ng-valid";
        String m =  SubFleetsPage.init(t1).emailvalues();
        System.out.println("m"+m);

        Assertion.assertEqual(m,v,"Valid email",t1);
    }
}
