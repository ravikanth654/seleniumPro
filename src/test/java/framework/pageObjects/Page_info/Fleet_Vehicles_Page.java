package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Fleet_Vehicles_Page extends PageInit
{

    @FindBy(xpath = "//span[.='VEHICLES']")
    private WebElement clickVehicle;

    @FindBy(xpath = "//div[@class='metric-card']//span")
    private WebElement total;

    @FindBy(xpath = "//label[.='Page size ']//..//select")
    private WebElement dropdown;

    @FindBy(xpath ="//input[@type='search']")
    private WebElement srch;

    @FindBy(xpath = "//tr[1]//td[2]")
    private WebElement firstRowLicencePlate;

    @FindBy(xpath = "//tr[1]//td[3]")
    private WebElement getfirstRowVin;

    @FindBy(xpath = "//a[@class='btn search-btn']")
    private WebElement srchclick;

    @FindBy(xpath = "//tr[2]//td[3]")
    private WebElement secondRowVin;

    @FindBy(xpath = "//thead//th")
    private List<WebElement> tblHeading;

    @FindBy(xpath = "//button[.='EXPORT']")
    private WebElement exp;

    @FindBy(xpath = "//tr[2]//td[2]")
    private WebElement rw;

    @FindBy(xpath = "//h5[contains(.,'OVERVIEW')]")
    private WebElement over;

    @FindBy(xpath = "//button[contains(.,'Back')]")
    private WebElement clickback;

    @FindBy(xpath = "//tr[2]//td[3]")
    private WebElement rowvin;

    @FindBy(xpath = "//tr[2]//td[4]")
    private WebElement model;

    @FindBy(xpath = "//tr[2]//td[2]")
    private WebElement regNum;

    @FindBy(xpath = "//tr[2]//td[6]")
    private WebElement color;

    @FindBy(xpath = "//tr[2]//td[10]")
    private WebElement lastconnect;

    @FindBy(xpath = "//tr[2]//td[12]")
    private WebElement actions;

    @FindBy(xpath = "//td[.='VEHICLE MODEL']//..//td[3]")
    private WebElement inModel;

    @FindBy(xpath = "//td[.='REG.NUMBER']//..//td[3]")
    private WebElement inReg;

    @FindBy(xpath = "//td[.='VIN']//..//td[3]")
    private WebElement inVin;

    @FindBy(xpath = "//td[.='CURRENT LOCATION']//..//td[3]")
    private WebElement inLoc;

    @FindBy(xpath = "//td[.='Last Connected']//..//td[3]")
    private WebElement inLast;

    @FindBy(xpath = "//div[@class='vehicle-image mb-4']//img[@class='img-fluid']")
    private WebElement incolor;

    @FindBy(xpath = "//p[contains(text(),'Entries')]")
    private WebElement entry;

    @FindBy(xpath = "//*[@id='dashboard_wrapper']/section[2]/div/div/app-data-table/div/div[3]/table/tbody/tr[1]/td[1]/..//td[2]")
    private WebElement trrow;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement input;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement srch2;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    private  WebElement s2;





    public Fleet_Vehicles_Page(ExtentTest t1) {
        super(t1);
    }
    public static Fleet_Vehicles_Page init(ExtentTest t1){return new Fleet_Vehicles_Page(t1);}


    public Fleet_Vehicles_Page clcikVehicl()
    {
        clickOnElement(clickVehicle,"Clicking on vehicles");
        return this;
    }

    public String ttl()
    {
        String str = total.getText();
        return str;
    }

    public String getRowtxt()
    {
        String str = trrow.getText();
        return str;
    }

    public Fleet_Vehicles_Page clickDropdown()
    {
        clickOnElement(dropdown,"Clicking on vehicles");
        return this;
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

    public Fleet_Vehicles_Page search_sendvalue(String s1)
    {
        srch.sendKeys(s1);
        return this;
    }

    public String getFirstRowLicencePlate()
    {
        String s1 = firstRowLicencePlate.getText();
        return s1;

    }

    public Fleet_Vehicles_Page Clears()
    {
        srch.clear();
        return this;
    }
    public Fleet_Vehicles_Page clickSearch()
    {
        clickOnElement(srchclick,"Clicking on search");
        return this;
    }

    public String getsecondRowVin()
    {
        String s1 = secondRowVin.getText();
        return s1;

    }

    public String getfirstRowVin()
    {
        String s1 = getfirstRowVin.getText();
        return s1;

    }

    public Fleet_Vehicles_Page input_click()
    {
        clickOnElement(input,"Clicking on search");
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

    public Fleet_Vehicles_Page Export()
    {
        clickOnElement(exp,"Clicking export");
        return this;
    }

    public Fleet_Vehicles_Page rowClick()
    {
        clickOnElement(rw,"clciking row");
        return this;
    }

    public String overvalue()
    {
        String txt = over.getText();
        return txt;
    }

    public Fleet_Vehicles_Page backClick()
    {
        clickOnElement(clickback,"clciking back");
        return this;
    }

    public String rowvalue()
    {
        String txt = rowvin.getText();
        return txt;
    }

    public String model()
    {
        String txt = model.getText();
        return txt;
    }

    public String s2()
    {
        String txt = s2.getText();
        return txt;
    }


    public String regNo()
    {
        String txt = regNum.getText();
        return txt;
    }

    public String color()
    {
        String txt = color.getText();
        return txt;
    }

    public String lastconnect()
    {
        String txt = lastconnect.getText();
        return txt;
    }


    public String inModel()
    {
        String txt = inModel.getText();
        return txt;
    }

    public String inReg()
    {
        String txt = inReg.getText();
        return txt;
    }

    public String inVin()
    {
        String txt = inVin.getText();
        return txt;
    }

    public String inLastconnect()
    {
        String txt = inLast.getText();
        return txt;
    }

    public String getCarcolor()
    {
        String cc=incolor.getAttribute("src");
        return cc;
    }

    public String getAtri()
    {
        String cc=input.getAttribute("value");
        return cc;
    }

    public String totalrows()
    {
        String txt = entry.getText();
        return txt;
    }







}
