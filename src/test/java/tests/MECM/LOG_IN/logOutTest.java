package tests.MECM.LOG_IN;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.Login.logInPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

public class logOutTest extends TestInit
{
    @Test
    public void logOutTest()throws Exception {
        ExtentTest t1 = pNode.createNode("logOutTest", "logOutTest");
        Login.init(t1).validLogin("MECM");

        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        //logInPage.init(t1).clickOnLogoutDropDown();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//img[@src='../../../mcms/assets/images/profile_pic.png']")).click();
        //js.executeScript("arguments[0].click();", button);
        logInPage.init(t1).logout();
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println(url);

        String urll="https://stg-nemo.mahindraelectric.com/authentication/login";
        System.out.println(urll);

        Assertion.assertEqual(url,urll,"same",t1);


    }

}
