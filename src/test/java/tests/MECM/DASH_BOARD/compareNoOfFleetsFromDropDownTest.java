package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.concurrent.TimeUnit;

public class compareNoOfFleetsFromDropDownTest extends TestInit
{
    @Test
    public void compareNoOfFleetsFromDropDown()throws Exception
    {
        ExtentTest t1 = pNode.createNode("compareNoOfFleetsFromDropDown", "compareNoOfFleetsFromDropDown");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(9000);
        String s = dashBoard.init(t1).NOOFFLEETS();
        int a = Integer.parseInt(s);
        System.out.println("--"+a);
        dashBoard.init(t1).clickingDropDown();
        int size=dashBoard.init(t1).allDropDownValues();


        Assertion.assertEqual(size-1, a, "both same", t1);

    }
}
