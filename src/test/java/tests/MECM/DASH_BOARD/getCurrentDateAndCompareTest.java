package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class getCurrentDateAndCompareTest extends TestInit
{
    @Test
    public void getCurrentDateAndCompare()throws Exception {
        ExtentTest t1 = pNode.createNode("getCurrentDateAndCompare", "getCurrentDateAndCompare");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        String date = dashBoard.init(t1).getCurrentDate();
        Date today = new Date();
        String format2 = new SimpleDateFormat("EEEE, MMMM d, yyyy, HH:mm:ss", Locale.ENGLISH).format(today);
        System.out.println(format2);

        Assertion.assertEqual(date,format2,"Both date is same",t1);
    }
}
