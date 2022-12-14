package tests.MECM.LOG_IN;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.MECM.Login.logInPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.Calendar;

public class AllRightReservedTest extends TestInit {
    @Test
    public void AllRightReservedTest() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("AllRightReservedTest", "AllRightReservedTest");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        String src = logInPage.init(t1).footer();
        int yr = Calendar.getInstance().get(Calendar.YEAR);
        String s = " © MAHINDRA ELECTRIC, All rights reserved.";
        String ac = Integer.toString(yr);
        String av = ac.concat(s);
        System.out.println(av);


        Assertion.assertEqual("ravi", "ravi", "AllRightReservedTest", t1);
    }
}
