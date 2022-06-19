package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterinfoTest extends CommonAPI {
    @Test
    public void registerinfo() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
        driver.findElement(By.cssSelector("input[id='input-firstname']")).sendKeys("J");
        driver.findElement(By.cssSelector("input[id='input-lastname']")).sendKeys("cole");
        driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("pnt12@gmail.com");
        driver.findElement(By.cssSelector("input[id='input-password']")).sendKeys("pnt123");
        //driver.findElement(By.cssSelector("input[id='input-country']")).click(); i have to work on it
    }
}
