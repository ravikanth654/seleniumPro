package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class addNewCommuter_NavigationTest extends TestInit
{
    @Test
    public void addNewCommuter_Navigation() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("addNewCommuter_Navigation ", "addNewCommuter_Navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(3000);
        commuter.init(t1).addCommuter();
        Thread.sleep(3000);
        String url="new";
        String url2 = driver.getCurrentUrl();

        Assertion.verifyContains(url2,url,"Both url same ",t1);



    }
}
