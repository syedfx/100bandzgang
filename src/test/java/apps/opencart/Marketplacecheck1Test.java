package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Marketplacecheck1Test extends CommonAPI {

    @Test
    public void marketpalcecheck1() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"extension-list\"]/div[2]/div[1]/section/div[2]/p[1]/a")).click();
    }
}