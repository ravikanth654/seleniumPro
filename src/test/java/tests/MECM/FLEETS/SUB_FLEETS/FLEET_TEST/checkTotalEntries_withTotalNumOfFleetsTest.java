package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTotalEntries_withTotalNumOfFleetsTest extends TestInit
{
    @Test
    public void checkTotalEntries() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Check total entries ", "Check total entries");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(7000);

        String ss = SubFleetsPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);
        String t = SubFleetsPage.init(t1).totalrows();
        System.out.println("t "+t);
        String[] sp = t.split(" ");
        String s = sp[5];
        int sss = Integer.parseInt(s);
        System.out.println("row2 " + sss);

        Assertion.assertEqual(ttlcnt, sss, "Verifying total entries", t1);
    }

}
