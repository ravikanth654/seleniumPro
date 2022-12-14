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
import tests.myMethods.GeneratingRandom;

public class enter_email_aproverTest extends TestInit
{
    @Test
    public void enter_email_aprover() throws Exception
    {
        ExtentTest t1 = pNode.createNode("enter_email_aprover ", "enter_email_aprover ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(2000);
        commuter.init(t1).addCommuter();
        Thread.sleep(2000);

        String s = null;
        String s1 = GeneratingRandom.gmail(s);
        Thread.sleep(2000);
        commuter.init(t1).aproversendEmail(s1);
        Thread.sleep(2000);
        String status="form-control ng-untouched ng-dirty ng-valid";
        String v11 = fleetDriverPage.init(t1).approveremailAtri();
        Thread.sleep(2000);
        System.out.println(v11);

        Assertion.assertEqual(v11,status,"enter_email_aprover",t1);
    }
}
