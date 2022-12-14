package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class lowSOCNavigationTest  extends TestInit
{
    @Test
    public void totalFleetSize_Navigation()throws Exception {
        ExtentTest t1 = pNode.createNode("totalFleetSize_Navigation", "totalFleetSize_Navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        dashBoard.init(t1).LOWSOCclick();
        String url2 = driver.getCurrentUrl();
        String url = "vehicles";

        Assertion.verifyContains(url2,url,"same",t1);


    }
}
