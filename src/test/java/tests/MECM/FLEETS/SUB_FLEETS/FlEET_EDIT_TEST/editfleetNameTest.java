package tests.MECM.FLEETS.SUB_FLEETS.FlEET_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class editfleetNameTest extends TestInit
{
    @Test
    public void editfleetName() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click On edit Fleet,edit fleet name", "Clicking on edit fleet ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(3000);
        SubFleetsPage.init(t1).edit();
        Thread.sleep(2000);
        String s2="123";
        SubFleetsPage.init(t1).fleetNmae(s2);
        Thread.sleep(3000);
        String dd =   SubFleetsPage.init(t1).fltName();
        System.out.println("the value "+dd);

        Assertion.verifyContains(dd,s2,"Pass",t1);
    }
}
