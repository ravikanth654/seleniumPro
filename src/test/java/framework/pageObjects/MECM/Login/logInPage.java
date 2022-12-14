package framework.pageObjects.MECM.Login;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logInPage extends PageInit
{

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;
 @FindBy(xpath = "//a[.='Logout']")
    private WebElement logout;

    @FindBy(xpath = "//li[@class='nav-item profile dropdown show']//a")
    private WebElement clickOnLogoutDropDown;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement uname;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//footer[@class='login-footer']//span")
    private WebElement footer;

    @FindBy(xpath = "//p[contains(text(),'Invalid username or password')]")
    private WebElement invalid;






    public logInPage(ExtentTest t1) {
        super(t1);
    }
    public static logInPage init(ExtentTest t1){return new logInPage(t1);}


    public logInPage submit()
    {
        clickOnElement(submit,"Fleet Button");
        return this;
    }
    public logInPage logout()
    {
        clickOnElement(logout,"Fleet Button");
        return this;
    }


public logInPage clickOnLogoutDropDown()
    {
        clickOnElement(clickOnLogoutDropDown,"Fleet Button");
        return this;
    }

    public String submitEmptyError()
    {
        String error = uname.getAttribute("validationMessage");
        return error;
    }

    public String submitEmptyErrorPass()
    {
        String error = password.getAttribute("validationMessage");
        return error;
    }

    public String uname(String m1)
    {
        uname.sendKeys(m1);
        return m1;
    }

    public String password(String m1)
    {
        password.sendKeys(m1);
        return m1;
    }

    public String footer()
    {
        String s = footer.getText();
        return s;
    }

    public String invalid()
    {
        String s = invalid.getText();
        return s;
    }


}
