package tests.MECM.LOG_IN;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.MECM.Login.logInPage;
import framework.util.common.Assertion;
import framework.util.common.ConfigInput;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkForInvalidLoginsTest extends TestInit
{
    @Test(priority = 0,enabled = false)
    public void emptyLogin() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("emptyLogin", "emptyLogin");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).submitEmptyError();
        String eror = "Please fill out this field.";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

    @Test(priority = 1,enabled = false)
    public void emptyUname() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("emptyUname", "emptyUname");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).uname("");
        logInPage.init(t1).password("Bisleri500@nemo");

        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).submitEmptyError();
        String eror = "Please fill out this field.";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

    @Test(priority = 2,enabled = false)
    public void emptyPassword() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("emptyPassword", "emptyPassword");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).uname("mecm_admin");
        logInPage.init(t1).password("");
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).submitEmptyErrorPass();
        String eror = "Please fill out this field.";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

    @Test(priority = 3,enabled = false)
    public void riteUname() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("riteUname", "riteUname");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).uname("mecm_admin");
        logInPage.init(t1).password("lol");
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).invalid();
        String eror = "Invalid username or password";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

    @Test(priority = 4,enabled = false)
    public void ritePassword() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("ritePassword", "ritePassword");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).uname("lol");
        logInPage.init(t1).password("Bisleri500@nemo");
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).invalid();
        String eror = "Invalid username or password";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

    @Test(priority = 5,enabled = false)
    public void bothWrong() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("bothWrong", "bothWrong");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).uname("lol");
        logInPage.init(t1).password("lol@nemo");
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).invalid();
        String eror = "Invalid username or password";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

    @Test(priority = 6,enabled = false)
    public void bothriteWithWhiteSpace() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("bothriteWithWhiteSpace", "bothriteWithWhiteSpace");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).uname(" mecm_admin ");
        logInPage.init(t1).password(" Bisleri500@nemo ");
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).invalid();
        String eror = "Invalid username or password";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

    @Test(priority = 7,enabled = false)
    public void bothRiteWithMiddleSpace() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("bothRiteWithMiddleSpace", "bothRiteWithMiddleSpace");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).uname(" mecm_ admin ");
        logInPage.init(t1).password(" Bisleri 500@nemo ");
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).invalid();
        String eror = "Invalid username or password";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }

  /*  @Test
    public void bothRiteWithMiddleSpace() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("emptyLogin", "emptyLogin");
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        Thread.sleep(3000);
        logInPage.init(t1).submit();
        Thread.sleep(3000);
        String err = logInPage.init(t1).submitEmptyError();
        String eror = "Please fill out this field.";

        Assertion.assertEqual(err,eror,"both error msg same",t1);

    }*/
}
