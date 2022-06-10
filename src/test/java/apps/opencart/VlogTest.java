package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VlogTest extends CommonAPI {
    @Test
    public void vlog() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[4]/a")).click();
    }
}
