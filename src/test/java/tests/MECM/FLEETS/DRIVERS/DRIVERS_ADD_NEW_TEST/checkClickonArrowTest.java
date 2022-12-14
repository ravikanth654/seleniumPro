package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkClickonArrowTest extends TestInit
{
    @Test
    public void checkClickonArrow() throws Exception
    {
        ExtentTest t1 = pNode.createNode("checkClickonArrow ", "checkClickonArrow");
        String url="https://stg-nemo.mahindraelectric.com/mcms/drivers";
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);

        fleetDriverPage.init(t1).clcikOnAddDriver();
        Thread.sleep(3000);
       /* Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//div[@id='configuration-sidebar']"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);*/
        fleetDriverPage.init(t1).clickArrow();
        Thread.sleep(3000);
        String url2 = driver.getCurrentUrl();

        Assertion.assertEqual(url2,url,"comparing the url",t1);

    }
}
