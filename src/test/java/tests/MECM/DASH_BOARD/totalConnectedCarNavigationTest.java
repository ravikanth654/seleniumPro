package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class totalConnectedCarNavigationTest extends TestInit
{
    @Test
    public void totalConnectedCarNavigation()throws Exception {
        ExtentTest t1 = pNode.createNode("totalConnectedCarNavigation", "totalConnectedCarNavigation");
       Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        dashBoard.init(t1).TOTALCARclick();
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        String url = "vehicles";

        Assertion.verifyContains(url2,url,"same",t1);
        //Assertion.assertEqual("ravi","vani","comparing ",t1);


    }
}
