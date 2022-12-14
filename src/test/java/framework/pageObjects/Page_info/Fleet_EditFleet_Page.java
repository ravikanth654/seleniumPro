package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import tests.moduleName.Fleet_Test_EditFleet;

public class Fleet_EditFleet_Page extends PageInit
{

    @FindBy(xpath="//i[@class='fa fa-pencil fa-2 cursor_ptr']")
    private WebElement edt;

    @FindBy(xpath = "//a[contains(.,'ADD NEW SUBFLEET')]")
    private WebElement addfleet;

    @FindBy(xpath = "//input[@id='customer_name']")
    private WebElement fleetname;

    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement mobile;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='address']")
    private WebElement address1;







    public Fleet_EditFleet_Page(ExtentTest t1) {
        super(t1);
    }
    public static Fleet_EditFleet_Page init(ExtentTest t1){return new Fleet_EditFleet_Page(t1);}



    public Fleet_EditFleet_Page edit()
    {
        clickOnElement(edt,"Clicking on edit");
        return this;
    }

    public Fleet_EditFleet_Page ClickonAddFleet()
    {
        clickOnElement(addfleet,"Clicking on addfleet");
        return this;
    }

    public String fleetNmae(String s1)
    {
        fleetname.sendKeys(s1);
        return  s1;
    }

    public String fltName()
    {
        String d1=fleetname.getAttribute("value");
        return d1;
    }

    public String mobilevalue()
    {
        String s=mobile.getAttribute("class");
        return s;
    }

    public Fleet_EditFleet_Page  mobileClear()
    {
        mobile.clear();
        return this;
    }

    public String mobileNumber(String m1)
    {
        mobile.sendKeys(m1);
        return m1;
    }

    public String mobileValuenumber()
    {
        String ss=mobile.getAttribute("value");
        return ss;
    }
    public Fleet_EditFleet_Page emailClick()
    {
        clickOnElement(email,"Clicking on email");
        return this;
    }

    public Fleet_EditFleet_Page clearemail()
    {
        email.clear();
        return this;
    }

    public String getEmailValue()
    {
        String text = email.getAttribute("value");
        return text;
    }

    public String eMail(String m1)
    {
        email.sendKeys(m1);
        return m1;
    }
    public String emailvalue()
    {
        String s=email.getAttribute("class");
        return s;
    }

    public Fleet_EditFleet_Page addressClick()
    {
        clickOnElement(address1,"Clicking on adress");
        return this;
    }

    public String addresss(String m1)
    {
        address1.sendKeys(m1);
        return m1;
    }
    public String adressvalue()
    {
        String s=address1.getAttribute("value");
        return s;
    }

    public Fleet_EditFleet_Page mobileNumberClick()
    {
        clickOnElement(mobile,"Clicking on mobile number");
        return this;
    }

    public Fleet_EditFleet_Page adressClear()
    {
        address1.clear();
        return this;
    }






}
