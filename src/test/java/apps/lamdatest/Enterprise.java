package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Enterprise extends CommonAPI {
    @Test
    public void EnterpriseTest() {
        driver.findElement(By.xpath("//a[contains(text(),'Enterprise')]")).click();
    }
}
