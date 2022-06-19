package base;


import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class CommonAPI {

    static String currentDir = System.getProperty("user.dir");

    public WebDriver driver;

    public static com.relevantcodes.extentreports.ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
      //  if (takeScreenshot.equalsIgnoreCase("true")) {
            if (result.getStatus() == ITestResult.FAILURE) {
                takeScreenshot(result.getName());
            }
     //   }
        driver.quit();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    public void getDriver(String browser, String os){
        if (os.equalsIgnoreCase("windows")){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", currentDir+"\\driver\\windows\\chromedriver.exe");
                driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", currentDir+"\\driver\\windows\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }else if (os.equalsIgnoreCase("mac")){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", currentDir+"/driver/mac/chromedriver");
                driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", currentDir+"/driver/mac/geckodriver");
                driver = new FirefoxDriver();
            }
        }else if (os.equalsIgnoreCase("linux")){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", currentDir+"/driver/linux/chromedriver");
                driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", currentDir+"/driver/linux/geckodriver");
                driver = new FirefoxDriver();
            }
        }
    }
    public void getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String osVersion, String browser, String browserVersion) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("os",os);
        cap.setCapability("os_version",osVersion);
        cap.setCapability("browser",browser);
        cap.setCapability("browser_version",browserVersion);
        if (envName.equalsIgnoreCase("saucelabs")) {
            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+"@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if (envName.equalsIgnoreCase("browserstack")){
            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+"@hub-cloud.browserstack.com:80/wd/hub"), cap);

        }
    }

    @Parameters({"useCloudEnv","envName","os","osVersion","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional ("false") boolean useCloudEnv, @Optional ("browserstack") String envName, @Optional("windows")
            String os, @Optional ("10") String osVersion, @Optional("chrome") String browserName, @Optional ("101")
            String browserVersion, @Optional("https://www.google.com/") String url) throws MalformedURLException {
        if (useCloudEnv) {
            if (envName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(envName,"syednazrul_nj0fCA","gjh6nnymgrjLWexq8REs", os, osVersion, browserName, browserVersion);
            }else if (envName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(envName,"","", os, osVersion, browserName, browserVersion);
            }
        }else {
            getDriver(browserName,os);
        }

        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getElementText(String locator){
        try {
            return driver.findElement(By.cssSelector(locator)).getText();
        }catch (Exception e){
            return driver.findElement(By.xpath(locator)).getText();
        }
    }

    public void click(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).click();
        }
    }


    public void click(WebElement element){
        element.click();
    }


    public void type(String locator, String text){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).sendKeys(text);
        }

    }

    public void typeAndEnter(String locator, String text){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(text, Keys.ENTER);
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).sendKeys(text, Keys.ENTER);
        }
    }

    public void selectFromDropdown(String dropdownLocator, String option){
        WebElement dropdown;
        try {
            dropdown = driver.findElement(By.cssSelector(dropdownLocator));

        }catch (Exception e){
            dropdown = driver.findElement(By.xpath(dropdownLocator));
        }
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public void hoverOver(String locator){
        Actions actions = new Actions(driver);
        WebElement element;
        try {
            element = driver.findElement(By.cssSelector(locator));
        }catch (Exception e){
            element = driver.findElement(By.xpath(locator));
        }
        actions.moveToElement(element).build().perform();
    }

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshot(String screenshotName){
        DateFormat df = new SimpleDateFormat("MMddyyyyHHmma");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "\\screenshots\\"+screenshotName+" "+df.format(date)+".jpeg"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            String path = System.getProperty("user.dir")+ "/screenshots/"+screenshotName+" "+df.format(date)+".jpeg";
            System.out.println("Exception while taking screenshot "+e.getMessage());
        }
    }
}