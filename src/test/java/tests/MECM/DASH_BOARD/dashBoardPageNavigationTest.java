package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class dashBoardPageNavigationTest extends TestInit
{
    @Test
    public void dashBoardPageNavigation()throws Exception {
        ExtentTest t1 = pNode.createNode("dashBoardPageNavigation", "dashBoardPageNavigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        String url = driver.getCurrentUrl();
        String url2="dashboard";

        Assertion.verifyContains(url,url2,"both url same",t1);


    }

}
