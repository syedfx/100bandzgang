package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Forgot extends CommonAPI {
    @Test
    public void ForgotTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div[1]/div/div[3]/p/span/span[1]/a")).click();
    }
}
