package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {
    @Test
    public void login() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();
        driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("pnt1234@gmail.com");
        driver.findElement(By.cssSelector("input[id='input-password']")).sendKeys("pnt1233");
    }
}
