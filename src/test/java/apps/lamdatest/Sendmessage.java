package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sendmessage extends CommonAPI {
    @Test
    public void SendmessageTest() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div[1]/div/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"messageid\"]")).sendKeys("Hi, I need help");
    }
}
