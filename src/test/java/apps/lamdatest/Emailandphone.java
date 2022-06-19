package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Emailandphone extends CommonAPI {
    @Test
    public void EmailandPhoneTest() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div[1]/div/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("john123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"mobileid\"]")).sendKeys("1234567891");
    }
}
