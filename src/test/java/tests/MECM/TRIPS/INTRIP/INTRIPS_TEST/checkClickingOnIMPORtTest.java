package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkClickingOnIMPORtTest extends TestInit
{
    @Test
    public void checkClickingOnIMPORT() throws Exception {
        ExtentTest t1 = pNode.createNode("checkClickingOnIMPORT ", "checkClickingOnIMPORT");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).uploadTrips();
        String expect="Select the file to import";
        System.out.println("expected "+expect);
        Thread.sleep(2000);
        String aa = SubFleetsPage.init(t1).getpageValue();
        System.out.println(aa);

        Assertion.assertEqual(aa,expect,"Import button,verifying click",t1);
    }


}
