package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Marketplacecheck5 extends CommonAPI {
    @Test
    public void marketpalcecheck5() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"extension-list\"]/div[3]/div[2]/section/div[2]/p[1]/a")).click();
    }
}
