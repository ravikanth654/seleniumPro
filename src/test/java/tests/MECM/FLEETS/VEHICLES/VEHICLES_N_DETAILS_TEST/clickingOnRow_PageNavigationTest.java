package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.TestInit;

public class clickingOnRow_PageNavigationTest extends TestInit
{
    @Test
    public void clickingOnRow()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on row ", "Clicking on row");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(4000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)", "");
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(2000);
        fleetVehiclesPage.init(t1).rowClick();
        String value = fleetVehiclesPage.init(t1).rowvalue();
        String urlll = driver.getCurrentUrl();

        Assertion.verifyContains(urlll,value,"page is navigated properly",t1);
    }
}
