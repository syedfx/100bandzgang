package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mobileapp2 extends CommonAPI {
    @Test
    public void MobileappTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")).click();
        driver.findElement(By.xpath(" //body/div[@id='__docusaurus']/nav[1]/div[1]/div[1]/a[5]")).click();
        //body/div[@id='__docusaurus']/nav[1]/div[1]/div[1]/a[5]
    }
}
