package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoTest extends CommonAPI {
    @Test
    public void demo() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[2]/a")).click();
    }
}
