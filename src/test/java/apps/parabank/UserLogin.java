package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserLogin extends CommonAPI {

    //5
    @Test
    public void userCanlogin() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
}
