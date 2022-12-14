package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class check_DepartmentTest extends TestInit
{
    @Test
    public void check_Department() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check_Department ", "check_Department");
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

        String s1 = null;
        String m1 = GeneratingRandom.fourchar(s1);
        commuter.init(t1).department(m1);
        String status="form-control ng-untouched ng-dirty ng-valid";
        String v11 = commuter.init(t1).takeAtriDepartment();
        System.out.println(v11);

        Assertion.assertEqual(v11,status,"Valid first name",t1);
    }
}
