package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ResourcesTest extends CommonAPI {
    @Test
    public void resources() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[6]/a")).click();
    }
}
