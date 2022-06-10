package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Marketpalcecheck15 extends CommonAPI {
    @Test
    public void marketpalcecheck15() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"extension-list\"]/div[6]/div[2]/section/div[2]/p[1]/a")).click();
    }
}
