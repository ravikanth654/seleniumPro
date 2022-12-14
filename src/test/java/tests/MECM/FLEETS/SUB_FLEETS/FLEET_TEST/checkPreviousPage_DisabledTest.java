package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkPreviousPage_DisabledTest extends TestInit
{
    @Test
    public void checkForPreviousPageDisbld() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("check for previous page is disabled ", "check for previous page is disabled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(6000);
        WebElement element = driver.findElement(By.xpath(("//*[@aria-label='Next page']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        String state = SubFleetsPage.init(t1).getdisbledPageStatusprevious();
        System.out.println(state);
        String a = "pagination-previous disabled";

        Assertion.assertEqual(state, a, "previous page is disabled", t1);
    }
}
