package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FeatureTest extends CommonAPI {
    @Test
    public void feature() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")).click();
    }
}
