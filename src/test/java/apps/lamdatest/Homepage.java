package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Homepage extends CommonAPI {
    @Test
    public void homePageTest() {
        driver.getTitle();
    }

    @Test
    public void RegisterTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
    }

    @Test
    public void FormTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Test
    public void ForgotTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div[1]/div/div[3]/p/span/span[1]/a")).click();
    }

    @Test
    public void ResetTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div[1]/div/div[3]/p/span/span[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/form/div[1]/input")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/form/div[2]/button")).click();
    }

    @Test
    public void PricingTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/a[2]")).click();
    }

    @Test
    public void BookademoTest() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div[1]/div/div/a[2]")).click();
    }

    @Test
    public void ContactusTest() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div[1]/div/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"inputFirstName2\"]")).sendKeys("Farzin");
        driver.findElement(By.xpath("//*[@id=\"inputLastName2\"]")).sendKeys("Farhad");
    }

    @Test
    public void SendmessageTest() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div[1]/div/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"messageid\"]")).sendKeys("Hi, I need help");
    }

    @Test
    public void EmailandPhoneTest() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div[1]/div/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("john123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"mobileid\"]")).sendKeys("1234567891");
    }

    @Test
    public void HoverTest() {
        Actions actions = new Actions(driver);
        WebElement platform = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/a"));
        actions.moveToElement(platform).perform();
    }

    @Test
    public void HoverTest2() {
        Actions actions = new Actions(driver);
        WebElement platform = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/a"));
        actions.moveToElement(platform).perform();
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/div[1]/ul/li[1]")).click();
    }

    @Test
    public void Hovertest3() {
        Actions actions = new Actions(driver);
        WebElement platform = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/a"));
        actions.moveToElement(platform).perform();
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/div[1]/ul/li[2]/a/div/div[2]/h3")).click();
    }

    @Test
    public void Hovertest4() {
        Actions actions = new Actions(driver);
        WebElement platform = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/a"));
        actions.moveToElement(platform).perform();
        driver.findElement(By.xpath("//h3[contains(text(),'Cypress Testing')]")).click();
    }

    @Test
    public void Hovertest5() {
        Actions actions = new Actions(driver);
        WebElement platform = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/a"));
        actions.moveToElement(platform).perform();
        driver.findElement(By.xpath("//h3[contains(text(),'HyperExecute')]")).click();
    }

    @Test
    public void SeleniumgridTest() {
        Actions actions = new Actions(driver);
        WebElement platform = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/a"));
        actions.moveToElement(platform).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]")).click();
    }

    @Test
    public void EnterpriseTest() {
        driver.findElement(By.xpath("//a[contains(text(),'Enterprise')]")).click();
    }

    @Test
    public void ResourceTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();

    }

    @Test
    public void Blogtest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
    }

    @Test
    public void Webinerstest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]")).click();
    }

    @Test
    public void Learninghubbtest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//h3[contains(text(),'Learning Hub')]")).click();
    }

    @Test
    public void Videotest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")).click();
    }

    @Test
    public void CustomerstoryTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")).click();
    }

    @Test
    public void DocumentaionTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[2]/h3[1]")).click();

    }

    @Test
    public void DocumentaionTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[2]/h3[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__docusaurus']/div[2]/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/a[1]")).click();//body/div[@id='__docusaurus']/div[2]/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/a[1]
    }

    @Test
    public void ApiTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/div[1]/div[2]/h3[1]")).click();
    }

    @Test
    public void ApiTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/div[1]/div[2]/h3[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'AUTOMATED SCREENSHOTS API')]"));
    }

    @Test
    public void NewsLetterTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//h3[contains(text(),'Newsletter')]")).click();

    }

    @Test
    public void NewsLetterTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//h3[contains(text(),'Newsletter')]")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("John123@gmail.com");
    }

    @Test
    public void CommunityTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("  //header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/div[1]/div[2]/h3[1]")).click();
        driver.findElement(By.xpath("//body/section[@id='main']/div[@id='ember4']/div[@id='main-outlet']/div[3]/div[1]/section[1]/ul[1]/li[2]/a[1]")).click();
    }

    @Test
    public void CertificationTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//h3[contains(text(),'Certifications')]")).click();
    }

    @Test
    public void WriteforusTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]")).click();
    }

    @Test
    public void WriteforusTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]")).click();
        driver.findElement(By.xpath("//input[@id='inputFirstName2']")).sendKeys("Farzin");
        driver.findElement(By.xpath("//input[@id='inputLastName2']")).sendKeys("Farhad");
    }
    @Test
    public void WriteforusTest3() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]")).click();
        driver.findElement(By.xpath("//input[@id='inputFirstName2']")).sendKeys("Farzin");
        driver.findElement(By.xpath("//input[@id='inputLastName2']")).sendKeys("Farhad");
        driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("john123@gmail.com");
        driver.findElement(By.xpath("//input[@id='mobileid']")).sendKeys("123456781");
    }

    @Test
    public void DevelopersTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
        actions.moveToElement(resource).perform();
    }

    @Test
    public void MobileappTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")).click();
    }

    @Test
    public void MobileappTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")).click();
        driver.findElement(By.xpath(" //body/div[@id='__docusaurus']/nav[1]/div[1]/div[1]/a[5]")).click();
        //body/div[@id='__docusaurus']/nav[1]/div[1]/div[1]/a[5]
    }

    @Test
    public void Github() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/div[1]/div[2]/h3[1]")).click();
    }

    @Test
    public void starttrialTest() {
        driver.findElement(By.xpath("//*[@id=\"testing_form\"]/input[1]")).sendKeys("John123@gmail.com");
    }
    @Test
    public void RealwebTest() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]")).click();
    }
    @Test
    public void RealwebTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__docusaurus']/nav[1]/div[1]/div[2]/div[2]")).click();
    }


}

