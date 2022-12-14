package tests.MECM.NOTIFICATIONS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.NOTIFICATIONS.notifications;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.sql.SQLOutput;

public class clickingOnNotificationTest extends TestInit
{
    @Test
    public void clickingOnNotification()throws Exception {
        ExtentTest t1 = pNode.createNode("clickingOnNotification", "clickingOnNotification");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        notifications.init(t1).notificationClick();
        Thread.sleep(2000);
        String txt = notifications.init(t1).headerText();
        System.out.println(txt);
        String a = txt.substring(0, 22);

        String hdr="ALERTS & NOTIFICATIONS";
        System.out.println(hdr);

        Assertion.assertEqual(a,hdr,"Navigation",t1);
    }
}
