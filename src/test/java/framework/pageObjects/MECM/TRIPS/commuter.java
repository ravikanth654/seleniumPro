package framework.pageObjects.MECM.TRIPS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class commuter extends PageInit
{

    @FindBy(xpath = "//span[.='COMMUTERS']")
    private WebElement commuters;

    @FindBy(xpath = "//a[contains(text(),'ADD COMMUTER')]")
    private WebElement addCommuter;

     @FindBy(xpath = "//input[@id='employeeid']")
    private WebElement employeeid;

    @FindBy(xpath = "//input[@id='first_name']")
        private WebElement first_name;

    @FindBy(xpath = "//input[@id='last_name']")
        private WebElement last_name;

    @FindBy(xpath = "//input[@id='department']")
        private WebElement department;

    @FindBy(xpath = "//input[@id='approveremail']")
            private WebElement approveremail;

    @FindBy(xpath = "//td[5]//i")
            private WebElement commuterEdit;



    public commuter(ExtentTest t1) { super(t1); }
    public static commuter init(ExtentTest t1){return new commuter(t1);}

    public commuter commuters()
    {
        clickOnElement(commuters,"clikcing on commuters");
        return this;
    }

    public String takeAtriEmployeeid()
    {
        String v1 = employeeid.getAttribute("class");
        return v1;
    }

    public String takeAtriDepartment()
    {
        String v1 = department.getAttribute("class");
        return v1;
    }

    public commuter addCommuter()
    {
        clickOnElement(addCommuter,"clikcing on commuters");
        return this;
    }

    public commuter commuterEdit()
    {
        clickOnElement(commuterEdit,"clikcing on commuters");
        return this;
    }

    public commuter employeeid(String s1)
    {
        employeeid.sendKeys(s1);
        return this;
    }

    public String employeeidValue()
    {
        String v1 = employeeid.getAttribute("value");
        return v1;
    }

    public commuter department(String s1)
    {
        department.sendKeys(s1);
        return this;
    }

    public String departmentName()
    {
        String v1 = department.getAttribute("value");
        return v1;
    }

    public commuter aproversendEmail(String s1)
    {
        approveremail.sendKeys(s1);
        return this;
    }

    public String aproveremailText()
    {
        String v1 = approveremail.getAttribute("value");
        return v1;
    }

}
