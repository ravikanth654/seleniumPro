package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class Fleet_AddFleet_Page extends PageInit
{
    @FindBy(xpath = "//input[@id='customer_name']")
    private WebElement fleetname;

    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement mobile;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='address']")
    private WebElement address1;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement click;

    @FindBy(xpath = "//a[.='ASSIGN VEHICLES']")
    private WebElement assgnVehicle;

    @FindBy(xpath ="//label[.='Available Vehicles']" )
    private WebElement lbl;

    @FindBy(xpath = "(//p[@class='cursor_ptr'])[1]")
    private WebElement swap;

    @FindBy(xpath = "(//*[@id='selectvehicle']//p[1])[2]")
    private WebElement swapped;

    @FindBy(xpath = "//a[.='ASSIGN DRIVERS']")
    private WebElement drv;

    @FindBy(xpath = "//label[.='Available Drivers']")
    private WebElement driverpage;

    @FindBy(xpath = "//*[@id='selectdriver']/div/div/div/div/div[1]/div/p[1]")
    private WebElement driver;

    @FindBy(xpath="//*[@id='selectdriver']/div/div/div/div/div[3]/div/p")
    private WebElement driverswp;

    @FindBy(xpath = "//p[contains(text(),'Entries')]")
    private WebElement entry;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement alert;




    public Fleet_AddFleet_Page(ExtentTest t1) {
        super(t1);
    }
    public static Fleet_AddFleet_Page init(ExtentTest t1){return new Fleet_AddFleet_Page(t1);}


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

    public Fleet_AddFleet_Page clcikfleetName()
    {
        clickOnElement(fleetname,"click");
        return this;
    }

    public String mobileNumber(String m1)
    {
       mobile.sendKeys(m1);
        return m1;
    }

   /* public String invalidmobileNumber(ArrayList<String> m1)
    {
        mobile.sendKeys(m1);
        return m1;
    }*/

    public Fleet_AddFleet_Page mobileNumberClick()
    {
        clickOnElement(mobile,"Clicking on mobile number");
        return this;
    }

    public String mobilevalue()
    {
        String s=mobile.getAttribute("class");
        return s;
    }
    public Fleet_AddFleet_Page mobileClear()
    {
        mobile.clear();
        return this;
    }

    public String mobileValuenumber()
    {
        String ss=mobile.getAttribute("value");
        return ss;
    }

    public Fleet_AddFleet_Page emailClick()
    {
        clickOnElement(email,"Clicking on email");
        return this;
    }

    public Fleet_AddFleet_Page clearemail()
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

    public Fleet_AddFleet_Page addressClick()
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

    public Fleet_AddFleet_Page adressClear()
    {
        address1.clear();
        return this;
    }

    public Fleet_AddFleet_Page assing()
    {
        clickOnElement(assgnVehicle,"Clicking on assign");
        return this;
    }

    public String  lable()
    {
        return lbl.getText();

    }

    public Fleet_AddFleet_Page swap()
    {
        clickOnElement(swap,"Clicking on vin number");
        return this;
    }

    public String swapNum()
    {
        String v = swap.getText();
        return v;
    }

    public String afterSwap()
    {
        String v2=swapped.getText();
        return v2;
    }

    public Fleet_AddFleet_Page clickswappedNum()
    {
        clickOnElement(swapped,"Clicking drivers");
        return this;
    }

    public Fleet_AddFleet_Page drivers()
    {
        clickOnElement(drv,"Clicking drivers");
        return this;
    }
    public String driver()
    {
        String a = driverpage.getText();
        return a;
    }

    public String driverName()
    {
        String name=driver.getText();
        return name;
    }

    public Fleet_AddFleet_Page driverswapping()
    {
        clickOnElement(driver,"Clicking drivers");
        return this;
    }

    public String swappeddriverName()
    {
        String name=driverswp.getText();
        return name;
    }

    public Fleet_AddFleet_Page removeswappedDriver()
    {
        clickOnElement(driverswp,"Clicking on save button");
        return  this;

    }
    public Fleet_AddFleet_Page clcikOnSave()
    {
        clickOnElement(click,"Clicking on save button");
        return  this;

    }

    public String totalrows()
    {
       String txt = entry.getText();
       return txt;
    }

    public String alert1()
    {
        String txt = alert.getText();
        return txt;
    }






}
