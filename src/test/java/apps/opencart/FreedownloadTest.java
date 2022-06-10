package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FreedownloadTest extends CommonAPI {
    @Test
    public void freedownload() {
        driver.findElement(By.xpath("//*[@id=\"hero\"]/div[1]/div[1]/div/p[2]/a[1]")).click();

    }

}
