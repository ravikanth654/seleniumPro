package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.Page_info.Fleet_Driver_Add_page;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

public class cancel_Click_pageNavigationTest extends TestInit {
    @Test
    public void cancel_Click_pageNavigation() throws Exception {
        ExtentTest t1 = pNode.createNode("cancel_Click_pageNavigation ", "cancel_Click_pageNavigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();

        String url="https://stg-nemo.mahindraelectric.com/mcms/drivers";

        WebElement element = driver.findElement(By.xpath(("//button[.=' Cancel']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Fleet_Driver_Add_page.init(t1).clcikOnCancel();
        String url2 = driver.getCurrentUrl();

        Assertion.assertEqual(url2,url,"cancel_Click_pageNavigation",t1);
    }
}
