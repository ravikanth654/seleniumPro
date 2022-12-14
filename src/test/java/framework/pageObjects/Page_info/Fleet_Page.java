package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Fleet_Page extends PageInit
{
    @FindBy(xpath = "//div[.='CORPORATE MOBILITY']")
    private WebElement mob;

    @FindBy(xpath = "//a[.='FLEETS']")
    private WebElement fleet;

    @FindBy(xpath = "//div[@class='metric-card']//span")
    private WebElement total;

    @FindBy(xpath ="//input[@type='search']")
    private WebElement srch;

    @FindBy(xpath = "//a[@class='btn search-btn']")
    private WebElement srchclick;

    @FindBy(xpath = "//thead//th")
    private List<WebElement> tblHeading;

    @FindBy(xpath = "//tr[1]//td[2]")
    private WebElement firstRowName;

    @FindBy(xpath = "//tr[2]//td[4]")
    private WebElement secondRowEmail;

    @FindBy(xpath = "//tr[1]//td[4]")
    private WebElement firstRowEmail;

    @FindBy(xpath = "//button[.='IMPORT']")
    private WebElement imp;

    @FindBy(xpath = "//button[.='EXPORT']")
    private WebElement exp;

    @FindBy(xpath = "//a[contains(text(),'ADD NEW SUBFLEET')]")
    private WebElement addfleet;

    @FindBy(xpath = "//input[@value='SUBMIT']")
    private WebElement sbmt;

    @FindBy(xpath = "*//button[.='Cancel']")
    private WebElement cncl;

    @FindBy(xpath = "//input[@name='customer_name']")
    private WebElement newFleet;

    @FindBy(xpath = "//button[.=' Cancel']")
    private WebElement NewFleetCancl;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    private WebElement value1;

    @FindBy(xpath = "//div/h6[.='Select the file to import']")
    private WebElement getPagetxt;

    @FindBy(xpath = "//label//*[contains(.,'Browse')]")
    private WebElement bro;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    private WebElement alert;

    @FindBy(xpath = "//a[@aria-label='Next page']")
    private WebElement nxtpage;

    @FindBy(xpath = "//a[@aria-label='Previous page']")
    private WebElement previospage;

    @FindBy(xpath = "((//tr)[last()]//td)[1]")
    private WebElement getLastRow;

    @FindBy(xpath = "(//tr)[2]//td[1]")
    private WebElement getFirstRow;

//    @FindBy(xpath = "//li[@class='current']/following-sibling::li")
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    private WebElement checknextPage;

    @FindBy(xpath = "//li[@class='pagination-next disabled']")
    private WebElement checknextPagedinld;

    @FindBy(xpath = "//li[@class='pagination-previous disabled']")
    private WebElement checkPreviousPagedinld;

    @FindBy(xpath = "//a[.='Click here to download the template of Customer List']")
    private WebElement downloadImport;








    public Fleet_Page(ExtentTest t1) {
        super(t1);
    }
    public static Fleet_Page init(ExtentTest t1){return new Fleet_Page(t1);}


    public Fleet_Page mobility() throws InterruptedException {
        //driver.wait(100);
        clickOnElement(mob,"Mobility button");
        return this;
    }

    public Fleet_Page fleets()
    {
        clickOnElement(fleet,"Fleet Button");
        return this;
    }

    public String ttl()
    {
        String str = total.getText();
        return str;
    }

    public String alert()
    {
        String str = alert.getText();
        return str;
    }

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

    public boolean nextDisbld()
    {
        boolean s;
        s=checknextPage.isEnabled();

        return s;
    }
    public Fleet_Page search_sendvalue(String s1)
    {
        srch.sendKeys(s1);
        return this;
    }
    public Fleet_Page clickSearch()
    {
        clickOnElement(srchclick,"Clicking on search ");
        return this;
    }

    public String getSearchValue()
    {
        String value = srch.getAttribute("value");
        return value;
    }
    public Fleet_Page Clears()
    {
        srch.clear();
        return this;
    }
    public Fleet_Page search_click()
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

    public String getFirstRowName()
    {
        String s1 = firstRowName.getText();
        return s1;

    }

    public String getLastRow()
    {
        String s1 = getLastRow.getText();
        return s1;

    }

    public String getFirstRow()
    {
        String s1 = getFirstRow.getText();
        return s1;

    }



    public String getsecondRowEmail()
    {
        String s1 = secondRowEmail.getText();
        return s1;

    }

    public String getfirstRowEmail()
    {
        String s1 = firstRowEmail.getText();
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

    public boolean import_button()
    {
        boolean is;
        is = imp.isDisplayed();

        return is;

    }
    public boolean import_button1()
    {
        boolean is1;
        is1 = imp.isEnabled();

        return is1;
    }

    public Fleet_Page imp_click()
    {
        clickOnElement(imp,"Fleet Button");
        return this;
    }

    public Fleet_Page bro_click()
    {
        clickOnElement(bro,"Fleet Button");
        return this;
    }



    public Fleet_Page Export()
    {
        clickOnElement(exp,"Clicking export");
        return this;
    }

    public boolean AddFleet_enbled()
    {
        boolean flt = addfleet.isEnabled();
        return flt;
    }

    public Fleet_Page ClickonAddFleet()
    {
        clickOnElement(addfleet,"Clicking on addfleet");
        return this;
    }

    public Fleet_Page SubmitClick()
    {
        clickOnElement(sbmt,"Clicking on submit button");
        return this;
    }
    public boolean CheckSubmit()
    {
        boolean s=sbmt.isDisplayed();
        return s;

    }
    public boolean CheckCancel()
    {
        boolean s=cncl.isDisplayed();
        return s;

    }

    public Fleet_Page cickOnCancel()
    {
        clickOnElement(cncl,"Cancel of browse");
        return this;
    }

    public Fleet_Page cnclfleet()
    {
        clickOnElement(NewFleetCancl,"Cancel");
        return this;

    }

    public Fleet_Page nextPage()
    {
        clickOnElement(nxtpage,"Cancel");
        return this;
    }

    public Fleet_Page previosPage()
    {
        clickOnElement(previospage,"Cancel");
        return this;
    }


    public String getdisbledPageStatus()
    {
        String s1 = checknextPagedinld.getAttribute("class");
        return s1;
    }

    public String getdisbledPageStatusprevious()
    {
        String s1 = checkPreviousPagedinld.getAttribute("class");
        return s1;
    }

    public String getDownloadImptag()
    {
        String s1 = downloadImport.getTagName();
        return s1;
    }

    public Fleet_Page clickOnIMPdownloadLink()
    {
        downloadImport.click();
        return this;
    }



    
}
