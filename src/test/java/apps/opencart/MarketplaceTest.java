package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MarketplaceTest extends CommonAPI {
    @Test
    public void marketpalce() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a")).click();
    }
}
