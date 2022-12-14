package tests.MECM.FLEETS.SUB_FLEETS.FlEET_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class editAdressTest extends TestInit
{
    @Test
    public void check_Address() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Eneter address and validate ", "Address validation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).edit();
        String m1 = "ramanagar";
        SubFleetsPage.init(t1).addressClick();
        SubFleetsPage.init(t1).adressClear();
        SubFleetsPage.init(t1).addresss(m1);
        SubFleetsPage.init(t1).addressClick();
        String m =    SubFleetsPage.init(t1).adressvalue();
        System.out.println("m"+m);

        Assertion.assertEqual(m,m1,"Valid email",t1);
    }
}
