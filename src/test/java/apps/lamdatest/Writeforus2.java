package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Writeforus2 extends CommonAPI {
    @Test
    public void WriteforusTest2() {
        Actions actions = new Actions(driver);
        WebElement resource = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        actions.moveToElement(resource).perform();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]")).click();
        driver.findElement(By.xpath("//input[@id='inputFirstName2']")).sendKeys("Farzin");
        driver.findElement(By.xpath("//input[@id='inputLastName2']")).sendKeys("Farhad");
    }
}
