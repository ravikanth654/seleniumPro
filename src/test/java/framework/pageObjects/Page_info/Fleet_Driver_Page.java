package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Fleet_Driver_Page extends PageInit
{

    @FindBy(xpath = "//a[.='DRIVERS']")
    private WebElement driver;

    @FindBy(xpath = "//div[@class='metric-card']//span")
    private WebElement total;

    @FindBy(xpath ="//input[@type='search']")
    private WebElement srch;

    @FindBy(xpath = "//a[@class='btn search-btn']")
    private WebElement srchclick;

    @FindBy(xpath = "//thead//th")
    private List<WebElement> tblHeading;

    @FindBy(xpath = "//tr[1]//td[3]")
    private WebElement firstRow;

    @FindBy(xpath = "//button[.='IMPORT']")
    private WebElement imp;

    @FindBy(xpath = "//button[.='EXPORT']")
    private WebElement exp;

    @FindBy(xpath = "//input[@name='customer_name']")
    private WebElement addfleet;

    @FindBy(xpath = "//input[@value='SUBMIT']")
    private WebElement sbmt;

    @FindBy(xpath = "*//button[.='Cancel']")
    private WebElement cncl;

    @FindBy(xpath = "//input[@name='customer_name']")
    private WebElement newFleet;

    @FindBy(xpath = "//button[.=' Cancel']")
    private WebElement NewFleetCancl;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    private WebElement value1;

    @FindBy(xpath = "//div/h6[.='Select the file to import']")
    private WebElement getPagetxt;

    @FindBy(xpath = "//label//*[contains(.,'Browse')]")
    private WebElement bro;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    private WebElement alert;

    @FindBy(xpath = "//tr[1]//td[2]")
    private WebElement firstRowName;






    public Fleet_Driver_Page(ExtentTest t1) { super(t1); }public static Fleet_Driver_Page init(ExtentTest t1){return new Fleet_Driver_Page(t1);}


    public Fleet_Driver_Page clikOnDriver()
    {
        clickOnElement(driver,"Clicking on driverLink");
        return this;
    }


    public String ttl()
    {
        String str = total.getText();
        return str;
    }

   /* public String alert()
    {
        String str = alert.getText();
        return str;
    }*/


    public Fleet_Driver_Page search_sendvalue(String s1)
    {
        srch.sendKeys(s1);
        return this;
    }

    public Fleet_Driver_Page search_CLear()
    {
        srch.clear();
        return this;
    }

    public Fleet_Driver_Page clickSearch()
    {
        clickOnElement(srchclick,"Clicking on search ");
        return this;
    }

    public String getSearchValue()
    {
        String value = srch.getAttribute("value");
        return value;
    }
    public Fleet_Driver_Page Clears()
    {
        srch.clear();
        return this;
    }
    public Fleet_Driver_Page search_click()
    {
        clickOnElement(srchclick,"Clicking on search");
        return this;
    }


    public ArrayList<String> TblHeading()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:tblHeading)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);


        return nm;
    }

    public String getFirstRow()
    {
        String s1 = firstRow.getText();
        return s1;

    }

    public String getvalue1()
    {
        String s1 = value1.getText();
        return s1;

    }

    public String getpageValue()
    {
        String s1 = getPagetxt.getText();
        return s1;

    }

    public String getFirstRowName()
    {
        String s1 = firstRowName.getText();
        return s1;

    }

    /*public String getsecondRowEmail()
    {
        String s1 = secondRowEmail.getText();
        return s1;

    }

    public String getfirstRowEmail()
    {
        String s1 = getfirstRowEmail.getText();
        return s1;

    }*/

    public boolean searchIsDisplayed()
    {
        boolean s;
        s=srch.isDisplayed();

        return s;
    }

    public boolean searchIsEnabled()
    {
        boolean s;
        s=srch.isEnabled();

        return s;
    }







}
