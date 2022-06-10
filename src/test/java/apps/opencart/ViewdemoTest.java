package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ViewdemoTest extends CommonAPI {
    @Test
    public void viewdemo() {
        driver.findElement(By.xpath("//*[@id=\"hero\"]/div[1]/div[1]/div/p[2]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-demo\"]/div[2]/div/div[1]/div/a")).click();


    }
}
