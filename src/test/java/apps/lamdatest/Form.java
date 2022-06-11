package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Form extends CommonAPI {
    @Test
    public void FormTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }
}
