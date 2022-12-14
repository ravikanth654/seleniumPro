package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import framework.util.common.GenericMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageInfo_pg1 extends PageInit {
    private static GenericMethods gM;

    @FindBy(xpath = "//button[contains(.,'CONFIGURATION')]")
    private WebElement Config;

    @FindBy(xpath = "//span[.='CUSTOMER']")
    private WebElement Cus;

    @FindBy(xpath = "//div[.='CORPORATE MOBILITY']")
    private WebElement mob;


    public PageInfo_pg1(ExtentTest t1) {
        super(t1);
    }
    public static PageInfo_pg1 init(ExtentTest t1){return new PageInfo_pg1(t1);}


    public PageInfo_pg1 configBtn(){
        clickOnElement(Config,"Configuration button");
        return this;
    }

    public PageInfo_pg1 cus(){
        clickOnElement(Cus,"customer button");
        return this;
    }

    public PageInfo_pg1 mobility()
    {
        clickOnElement(mob,"Mobility button button");
        return this;
    }


}
