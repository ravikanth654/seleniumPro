package framework.pageObjects.Common.login;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_pg1 extends PageInit {

    @FindBy(name = "login")
    private WebElement UserName;

    @FindBy(name = "password")
    private WebElement Password;

    @FindBy(xpath = "//button[.='Login']")
    private WebElement LoginBtn;

    public LoginPage_pg1(ExtentTest t1) {
        super(t1);
    }

    public static LoginPage_pg1 init(ExtentTest t1) {
        return new LoginPage_pg1(t1);
    }

    public LoginPage_pg1 setUserName(String un) {
        setText(UserName,un,"userName");
        return this;
    }

    public LoginPage_pg1 setPassword(String pwd) {
        setText(Password,pwd,"password");
        return this;
    }

    public void clickLogin(){
        clickOnElement(LoginBtn,"login_button");
    }
}


