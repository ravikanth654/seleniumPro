package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

import static tests.myMethods.PageScroll.pageScrollDown;

public class checkAssigndrivers_NavigationTest extends TestInit
{

    @Test
    public void checkAssigndrivers_Navigation() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Assign driver navigation", "Assign driver navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(3000);
        SubFleetsPage.init(t1).clcikonfleet();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath(("//a[.='Assign Drivers']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        SubFleetsPage.init(t1).clickDriverAssign();
        String s = driver.getCurrentUrl();

        Assertion.verifyContains(s, "edit", "the page is navigated Assign driver  ", t1);
    }
}
