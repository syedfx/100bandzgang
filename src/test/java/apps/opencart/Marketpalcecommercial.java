package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Marketpalcecommercial extends CommonAPI {
    @Test
    public void marketpalcecommercial() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"marketplace-extension\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/a[2]"));
    }
}
