package tests.MECM.NOTIFICATIONS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.NOTIFICATIONS.notifications;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.clickAble;

public class closeIsClickableTest extends TestInit
{
    @Test
    public void closeIsClickable()throws Exception {
        ExtentTest t1 = pNode.createNode("closeIsClickable", "closeIsClickable");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        notifications.init(t1).notificationClick();
        Thread.sleep(2000);
        WebElement elmt = driver.findElement(By.xpath("//button[@class='close pull-right']"));
        String tag = elmt.getTagName();

        Assertion.assertEqual(tag,"button","button",t1);

    }
}
