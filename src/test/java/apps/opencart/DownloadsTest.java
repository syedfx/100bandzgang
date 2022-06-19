package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadsTest extends CommonAPI {
    @Test
    public void downloads() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[5]/a")).click();
    }
}
