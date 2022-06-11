package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserHomeButton extends CommonAPI {

    //35
    @Test
    public void userHomeButtonTest() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
    }
}
