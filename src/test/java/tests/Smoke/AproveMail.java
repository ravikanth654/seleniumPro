package tests.Smoke;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AproveMail
{

    @Test(priority = 1)
    public void  openGmail() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\SelleniumScripts\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stg-nemo.mahindraelectric.com/authentication/login");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("demoadmin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@buy35$");
        driver.findElement(By.xpath("//button[.='Login']")).click();
        driver.findElement(By.xpath("//div[.='CORPORATE MOBILITY']")).click();

    }
    @Test
        public void gmail()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\SelleniumScripts\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://outlook.office365.com/mail/inbox/id/AAQkADc1MjJmOWZhLTVjODctNDA2MS04MzhhLTVhNjg0MjUxZWZhMAAQAGEefpi%2BmhtDv9%2B0%2FhzsK3k%3D");
        driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("25004035@mahindra.com");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.manage().window().maximize();
        //driver.wait(2000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement fnd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='New trip request raised']")));
        fnd.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(1000,1000)");

       /* WebElement elmnt = driver.findElement(By.xpath("//a[contains(.,'APPROVE')]"));
        elmnt.click();*/
    }


    }


