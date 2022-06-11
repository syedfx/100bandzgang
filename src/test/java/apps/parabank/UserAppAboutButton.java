package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserAppAboutButton extends CommonAPI {

    //37
    @Test
    public void userAppAboutButtonTest() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a")).click();
    }
}
