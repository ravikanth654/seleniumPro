package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class clickOndropDownGetCountTest extends TestInit
{
    @Test
    public void clickOndropDownGetCount()throws Exception {
        ExtentTest t1 = pNode.createNode("clickOndropDownGetCount", "clickOndropDownGetCount");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(9000);
        String s = dashBoard.init(t1).NOOFFLEETS();
        Thread.sleep(2000);
        dashBoard.init(t1).clickingDropDown();
         int size=dashBoard.init(t1).allDropDownValues();
         t1.info("total fleet "+size);

        System.out.println(s);
        int a = Integer.parseInt(s);
        System.out.println(a);

        Assertion.assertEqual(size-1, a, "both same", t1);
    }
}
