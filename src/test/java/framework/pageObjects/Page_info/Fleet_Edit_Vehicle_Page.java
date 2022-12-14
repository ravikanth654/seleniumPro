package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fleet_Edit_Vehicle_Page extends PageInit
{

    @FindBy(xpath = "//i[@class='fa fa-pencil fa-2 cursor_ptr']")
    private WebElement edit;

    @FindBy(xpath = "//tr[1]//td[3]")
    private WebElement vin;

    @FindBy(xpath = "//tr[1]/td[2]")
    private WebElement lp;

    @FindBy(xpath = " //tr[1]/td[5]")
    private WebElement ovv;

    @FindBy(xpath = " //tr[1]/td[6]")
    private WebElement ovc;

    @FindBy(xpath = "//div[@class='modal-header']")
    private WebElement getText;

    @FindBy(xpath = "//tr[1]//td[4]")
    private WebElement model;

    @FindBy(xpath = "//input[@placeholder='Vehicle Identification Number']")
    private WebElement vnum;

    @FindBy(xpath = "//input[@placeholder='Vehicle Model']")
    private WebElement vmodel;

    @FindBy(xpath = "//input[@placeholder='Vehicle Variant']")
    private WebElement vv;

    @FindBy(xpath = "//input[@placeholder='Registration Number']")
    private WebElement regNum;

    @FindBy(xpath = "//mat-select")
    private WebElement vcolor;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private WebElement selectcolor;

    @FindBy(xpath = "//button[.='Update']")
    private WebElement submit;

    @FindBy(xpath = "//button[.='Cancel']")
    private WebElement cancel;

    @FindBy(xpath = "//alert[.='vehicle updated successfully!']")
    private WebElement alrt;

    @FindBy(xpath = " //mat-option[1]")
    private WebElement white;

    @FindBy(xpath = " //mat-option[2]")
    private WebElement red;

    @FindBy(xpath = " //mat-option[3]")
    private WebElement silver;





    public Fleet_Edit_Vehicle_Page(ExtentTest t1) {
        super(t1);
    }
    public static Fleet_Edit_Vehicle_Page init(ExtentTest t1){return new Fleet_Edit_Vehicle_Page(t1);}

    public Fleet_Edit_Vehicle_Page edit()
    {
        clickOnElement(edit,"Clicking on edit");
        return this;
    }

    public String takeVin()
    {
        String vn = vin.getText();
        return vn;
    }

    public String takereg()
    {
        String vn = lp.getText();
        return vn;
    }

    public String takevarient()
    {
        String vn = ovv.getText();
        return vn;
    }

    public String takecolor()
    {
        String vn = ovc.getText();
        return vn;
    }

    public String model()
    {
        String vn = model.getText();
        return vn;
    }

    public String txt()
    {
        String vn = getText.getText();
        return vn;
    }

    public String vinv()
    {
        String vn = vnum.getAttribute("value");
        return vn;
    }

    public String vm()
    {
        String vn = vmodel.getAttribute("value");
        return vn;
    }

    public String vv()
    {
        String vn = vv.getAttribute("value");
        return vn;
    }

    public String rn()
    {
        String vn = regNum.getAttribute("value");
        return vn;
    }

    public String vc()
    {
        String vn = vcolor.getText();
        return vn;
    }

    public boolean vinis()
    {
        boolean s = vnum.isEnabled();
        return s;
    }

    public boolean modis()
    {
        boolean s = vmodel.isEnabled();
        return s;
    }

    public boolean varientis()
    {
        boolean s = vv.isEnabled();
        return s;
    }

    public Fleet_Edit_Vehicle_Page clcikColor()
    {
        clickOnElement(vcolor,"Clicking on color");
        return this;
    }

    public Fleet_Edit_Vehicle_Page clcikOnColor()
    {
        clickOnElement(selectcolor,"Clicking on color");
        return this;
    }

    public Fleet_Edit_Vehicle_Page clcikOnSubmit()
    {
        clickOnElement(submit,"Clicking on color");
        return this;
    }

    public Fleet_Edit_Vehicle_Page clcikOncancel()
    {
        clickOnElement(cancel,"Clicking on color");
        return this;
    }

    public boolean alert()
    {
        boolean s = alrt.isDisplayed();
        return s;
    }

    public String getAlert()
    {
        String vn = alrt.getText();
        return vn;
    }

    public String getcolor()
    {
        String vn = vcolor.getText();
        return vn;
    }

    public Fleet_Edit_Vehicle_Page clckWhite()
    {
        clickOnElement(white,"Clicking on color");
        return this;
    }

    public Fleet_Edit_Vehicle_Page clcikRed()
    {
        clickOnElement(red,"Clicking on color");
        return this;
    }

    public Fleet_Edit_Vehicle_Page clciksilver()
    {
        clickOnElement(silver,"Clicking on color");
        return this;
    }

    public Fleet_Edit_Vehicle_Page clearVin()
    {
        regNum.clear();
        return this;
    }

    public String sendVin(String vin)
    {
        regNum.sendKeys(vin);
        return vin;

    }



}



