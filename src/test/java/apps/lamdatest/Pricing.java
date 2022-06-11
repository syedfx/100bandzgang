package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Pricing extends CommonAPI {
    @Test
    public void PricingTest() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/a[2]")).click();
    }
}
