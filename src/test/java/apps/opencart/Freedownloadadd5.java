package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Freedownloadadd5 extends CommonAPI {
    @Test
    public void freedownloadadd5() {
        driver.findElement(By.xpath("//*[@id=\"hero\"]/div[1]/div[1]/div/p[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"extension-list\"]/div[2]/div[3]/section/div[2]/p[1]/a")).click();

    }
}
