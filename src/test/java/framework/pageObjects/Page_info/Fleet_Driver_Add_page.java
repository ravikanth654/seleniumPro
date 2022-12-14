package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Fleet_Driver_Add_page extends PageInit
{

    @FindBy(xpath = "//a[contains(text(),'ADD DRIVER')]")
    private WebElement clickAdd;

    @FindBy(xpath = "//button[.=' Cancel']")
    private WebElement cancel;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement secondName;

    @FindBy(xpath = "//div[@class='ui-select-match']//span")
    private WebElement genderdropdown;

    @FindBy(xpath = "(//label[.='Gender']/following::span)[1]")
    private WebElement gender;

    @FindBy(xpath = "//div[.='Female']")
    private WebElement selectFemaledropDown;

    @FindBy(xpath = "//input[@name='mobile']")
    private WebElement mobile;

    @FindBy(xpath = "//ul[@role='menu']")
    private List<WebElement> menu;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@type='date']")
    private WebElement date;

    @FindBy(xpath = "//input[@name='driving_licence']")
    private WebElement licence;

    @FindBy(xpath = "//input[@name='dl_expiry_date']")
    private WebElement exprdate;

    @FindBy(xpath = "//input[@name='address']")
    private WebElement adres;

    @FindBy(xpath = "//span[.='Select document type']")
    private WebElement clickUploadDoc;

    @FindBy(xpath = "//ul[@role='menu']//li")
    private List<WebElement> menuDrop;

    @FindBy(xpath = "//div[.='Driving Licence (Front)']")
    private WebElement dlF;

    @FindBy(xpath = "//div[.='Driving Licence (Back)']")
    private WebElement dlB;

    @FindBy(xpath = "//div[.='Pan Card']")
    private WebElement pc;

    @FindBy(xpath = "//div[.='Aadhar Card (Front)']")
    private WebElement acF;

    @FindBy(xpath = "//div[.='Aadhar Card (Back)']")
    private WebElement acB;

    @FindBy(xpath = "//div[.='Background Verification Document']")
    private WebElement bvd;

    @FindBy(xpath = "//div[.='Police Verification Document']")
    private WebElement pvd;

    @FindBy(xpath = "//*[@id='driverdocument']/div/div[2]/span/span")
    private WebElement getDropdwnValue;

    @FindBy(xpath = "//*[@id='dashboard_wrapper']/section/div/div/form/div[2]/div[2]/div/div[12]/div/div/div[2]/div/div[1]/p")
    private WebElement getTabdocValue;

    @FindBy(xpath = "//span[.='Browse']")
    private WebElement clickOnBrowse;

    @FindBy(xpath = "//div[@class='doc-table-image']")
    private WebElement driverDocImg;

    @FindBy(xpath = "(//p[@class='doc-table-text'])[2]")
    private WebElement driverDocTxt;

    @FindBy(xpath = "//div[@class='icon-replace replace-btn']")
    private WebElement driverDocEdit;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement saveDriver;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement alertMessage;

    @FindBy(xpath = "//td[12]//i")
    private WebElement  edit;

    @FindBy(xpath ="//input[@type='search']")
    private WebElement srch;

    @FindBy(xpath ="//span[.='DRIVER LIST']/..")
    private WebElement arrow;

    @FindBy(xpath ="//input[@type='file']")
    private WebElement clickingOnImage;

    @FindBy(xpath ="//div[@role='alert']")
    private WebElement imgAlert;








    public Fleet_Driver_Add_page(ExtentTest t1) { super(t1); }public static Fleet_Driver_Add_page init(ExtentTest t1){return new Fleet_Driver_Add_page(t1);}



    public Fleet_Driver_Add_page clcikOnAddDriver()
    {
        clickOnElement(clickAdd,"clikcing on add driver");
        return this;
    }

    public boolean isCancelEnabled()
    {
        boolean yes;
        yes=cancel.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page clcikOnCancel()
    {
        clickOnElement(cancel,"clikcing on add driver");
        return this;
    }

    public boolean is1stNameEnabled()
    {
        boolean yes;
        yes=firstName.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page sendFirstName(String s1)
    {
        firstName.sendKeys(s1);
        return this;
    }
    public Fleet_Driver_Add_page search_CLear()
    {
        srch.clear();
        return this;
    }

    public String firstNameText()
    {
        String v1 = firstName.getAttribute("value");
        return v1;
    }

    public String firstNameTextvalue()
    {
        String v1 = firstName.getText();
        return v1;
    }



    public String takeAtriFirstName()
    {
        String v1 = firstName.getAttribute("class");
        return v1;
    }

    public boolean issecondNameEnabled()
    {
        boolean yes;
        yes=secondName.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page sendSecondName(String s1)
    {
        secondName.sendKeys(s1);
        return this;
    }

    public String secondNameText()
    {
        String v1 = secondName.getAttribute("value");
        return v1;
    }

    public String takeAtriSecondName()
    {
        String v1 = secondName.getAttribute("class");
        return v1;
    }

    public Fleet_Driver_Add_page clcikOnGenderDropdown()
    {
        clickOnElement(genderdropdown,"clikcing on dropdown");
        return this;
    }

    public Fleet_Driver_Add_page clcikOnFemaleDropdown()
    {
        clickOnElement(selectFemaledropDown,"clikcing on female");
        return this;
    }

    public String genderText()
    {
        String v1 = gender.getText();
        return v1;
    }

    public boolean isgenderEnabled()
    {
        boolean yes;
        yes=genderdropdown.isEnabled();
        return yes;
    }

    public String takeAtrigenderDropdown()
    {
        String v1 = genderdropdown.getText();
        return v1;
    }

    public boolean ismobileEnabled()
    {
        boolean yes;
        yes=mobile.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page sendMobilenumber(String s1)
    {
        mobile.sendKeys(s1);
        return this;
    }

    public String mobileText()
    {
        String v1 = mobile.getAttribute("value");
        return v1;
    }

    public Fleet_Driver_Add_page mobileTextClear()
    {
        mobile.clear();
        return this;
    }

    public String takeAtriMobile()
    {
        String v1 = mobile.getAttribute("class");
        return v1;
    }

    public ArrayList<String> dropdownvalues()
    {
        ArrayList<String> nm=new ArrayList<>();
        for(WebElement v: menu)
        {
            String values=v.getText();
            nm.add(values);
        }
        System.out.println("the values "+nm);
        return nm;
    }

    public boolean isEmailEnabled()
    {
        boolean yes;
        yes=email.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page sendEmail(String s1)
    {
        email.sendKeys(s1);
        return this;
    }

    public String takeAtriEmail()
    {
    String v1 = secondName.getAttribute("class");
    return v1;
    }

    public String emailText()
    {
        String v1 = email.getAttribute("value");
        return v1;
    }

    public Fleet_Driver_Add_page emailTextClear()
    {
        email.clear();
        return this;
    }

    public boolean isDateEnabled()
    {
        boolean yes;
        yes=date.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page date(String d)
    {
        date.sendKeys(d);
        return this;
    }

    public String takeAtriDate()
    {
        String v1 = date.getAttribute("class");
        return v1;
    }


    public String dobText()
    {
        String v1 = date.getAttribute("value");
        return v1;
    }

    public boolean islicenceEnabled()
    {
        boolean yes;
        yes=licence.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page sendLicence(String s1)
    {
        licence.sendKeys(s1);
        return this;
    }

    public String licenceText()
    {
        String v1 = licence.getAttribute("value");
        return v1;
    }

    public String takeAtriLicence()
    {
        String v1 = licence.getAttribute("class");
        return v1;
    }

    public boolean isExprDateEnabled()
    {
        boolean yes;
        yes=exprdate.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page exprdate(String d)
    {
        exprdate.sendKeys(d);
        return this;
    }

    public String exprdateText()
    {
        String v1 = exprdate.getAttribute("value");
        return v1;
    }

    public String takeAtriExprDate()
    {
        String v1 = exprdate.getAttribute("class");
        return v1;
    }

    public boolean isAdresEnabled()
    {
        boolean yes;
        yes=adres.isEnabled();
        return yes;
    }

    public Fleet_Driver_Add_page adres(String d)
    {
        adres.sendKeys(d);
        return this;
    }

    public String takeAtriAdress()
    {
        String v1 = adres.getAttribute("class");
        return v1;
    }

    public Fleet_Driver_Add_page clcikOnDocUpload()
    {
        clickOnElement(clickUploadDoc,"clikcing on uploaddoc");
        return this;
    }

    public ArrayList<String> dropdownvaluesDoc()
    {
        ArrayList<String> nm=new ArrayList<>();
        for(WebElement v: menuDrop)
        {
            String values=v.getText();
            nm.add(values);
        }
        System.out.println("the values "+nm);
        return nm;
    }

    public Fleet_Driver_Add_page clcikOnDLF()
    {
        clickOnElement(dlF,"clikcing on DLF");
        return this;
    }

    public Fleet_Driver_Add_page clcikOnDLB()
    {
        clickOnElement(dlB,"clikcing on DLB");
        return this;
    }

    public Fleet_Driver_Add_page clcikOnPan()
    {
        clickOnElement(pc,"clikcing on pan");
        return this;
    }

    public Fleet_Driver_Add_page clcikOnAdharF()
    {
        clickOnElement(acF,"clikcing on adharF");
        return this;
    }

    public Fleet_Driver_Add_page clcikOnAdharB()
    {
        clickOnElement(acB,"clikcing on adharB");
        return this;
    }

    public Fleet_Driver_Add_page clcikOnBackgroundVerification()
    {
        clickOnElement(bvd,"clikcing on BackgroundVerification");
        return this;
    }

    public Fleet_Driver_Add_page clcikOnpoloicVerification()
    {
        clickOnElement(pvd,"clikcing on police verification");
        return this;
    }

    public String getDropdownValue()
    {
        String doc=getDropdwnValue.getText();
        return doc;
    }

    public String getDocTabValue()
    {
        String doc=getTabdocValue.getText();
        return doc;
    }

    public Fleet_Driver_Add_page clcikOnBrowse()
    {
        clickOnElement(clickOnBrowse,"clikcing on Browse");
        return this;
    }

    public String takeAtriDocimage()
    {
        String v1 = driverDocImg.getAttribute("class");
        return v1;
    }

    public String takeAtriDocText()
    {
        String v1 = driverDocTxt.getText();
        return v1;
    }

    public String takeAlertText()
    {
        String v1 = alertMessage.getText();
        return v1;
    }

    public Fleet_Driver_Add_page saveDriver()
    {
        clickOnElement(saveDriver,"Saving driver");
        return this;

    }

    public Fleet_Driver_Add_page driverEdit()
    {
        clickOnElement(edit,"edit driver");
        return this;

    }

    public Fleet_Driver_Add_page clickArrow()
    {
        clickOnElement(arrow,"click on arrow");
        return this;
    }

    public Fleet_Driver_Add_page clickonDriverImageTodownload()
    {
        clickOnElement(clickingOnImage,"click on arrow");
        return this;
    }

    public String takeimageUploadtxt()
    {
        String v1 = imgAlert.getText();
        return v1;
    }

    public Fleet_Driver_Add_page clearMobdata()
    {

        mobile.clear();
        return this;
    }









}
