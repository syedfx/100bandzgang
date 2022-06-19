package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Documentation2 extends CommonAPI {
    @Test
    public void DocumentaionTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/div[1]/div[2]/h3[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__docusaurus']/div[2]/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/a[1]")).click();//body/div[@id='__docusaurus']/div[2]/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/a[1]
    }
}
