package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;

public class operationalAlertTest extends TestInit
{
    @Test
    public void operationalAlert()throws Exception {
        ExtentTest t1 = pNode.createNode("operationalAlert", "operationalAlert");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        String u="operational";

        Assertion.verifyContains(url,u,"same",t1);

    }

}
