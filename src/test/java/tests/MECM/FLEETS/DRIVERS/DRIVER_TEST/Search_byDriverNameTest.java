package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.TestInit;

public class Search_byDriverNameTest extends TestInit
{
    @Test
    public void Search_byDriverName() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By Search_byDriverName ", "Search by Search_byDriver name ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(5000);

        String s1 = fleetDriverPage.init(t1).getRowName();
        System.out.println(s1);
        fleetDriverPage.init(t1).search_sendvalue(s1)
                .clickSearch();
        Thread.sleep(1000);
        String s2 = fleetDriverPage.init(t1).getFirstRowName();
        System.out.println(s2);


        Assertion.assertEqual(s1, s2, "Verifying the value", t1);
        fleetDriverPage.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        fleetDriverPage.init(t1).clikOnDriver();

    }
}
