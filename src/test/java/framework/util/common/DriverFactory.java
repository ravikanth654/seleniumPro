package framework.util.common;

import framework.util.globalConstants.FilePath;
import framework.util.propertyManagement.MEProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class DriverFactory {

    private static final String CHROME = "chrome";
    private static final String IE = "ie";
    private static final String DEFAULT = "firefox";
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static WebDriver createDriver() {
        // Uses firefox driver by default
        String browser = MEProperties.getInstance().getProperty("browser.name");
        String downloadFilepath = FilePath.FILE_DOWNLOAD_PATH;
        if (browser == null) {
            browser = DEFAULT;
        }

        if (browser.toLowerCase().equals(CHROME)) {
            /**
             * Chrome
             */
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

            HashMap<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", downloadFilepath);

            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);


            DesiredCapabilities cap = DesiredCapabilities.chrome();
//            ChromeOptions cap = new ChromeOptions();

            cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            cap.setCapability(ChromeOptions.CAPABILITY, options);
            cap.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            cap.setCapability("chrome.switches", Arrays.asList("--incognito"));

            return new ChromeDriver(cap);
        } else if (browser.toLowerCase().equals(IE)) {
            /**
             * IE
             */
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
            capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
            capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            return new InternetExplorerDriver(capabilities);
        } else   {
            /**
             * FireFox
             */
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

            FirefoxProfile profile = new FirefoxProfile();
            profile.setAcceptUntrustedCertificates(false);
            profile.setAssumeUntrustedCertificateIssuer(true);
            profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.helperApps.alwaysAsk.force", false);
            profile.setPreference("browser.download.manager.showWhenStarting", false);
            profile.setPreference("dom.file.createInChild", true);
            profile.setPreference("browser.download.downloadDir", downloadFilepath);

            DesiredCapabilities dc = DesiredCapabilities.firefox();
//            FirefoxOptions dc = new FirefoxOptions();
            dc.setCapability(FirefoxDriver.PROFILE, profile);
            dc.setCapability("marionette", true);

            return new FirefoxDriver(dc);
        }
    }

    public static void closeDriver() {
        driver.close();
    }

    public static void quitDriver() {
        if (driver == null) {
            return;
        }
//        driver.quit();
        driver.close();
        driver = null;
    }
}
