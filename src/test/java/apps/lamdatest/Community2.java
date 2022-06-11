package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Community2 extends CommonAPI {
    @Test
    public void CommunityTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("  //header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/div[1]/div[2]/h3[1]")).click();
        driver.findElement(By.xpath("//body/section[@id='main']/div[@id='ember4']/div[@id='main-outlet']/div[3]/div[1]/section[1]/ul[1]/li[2]/a[1]")).click();
    }
}
