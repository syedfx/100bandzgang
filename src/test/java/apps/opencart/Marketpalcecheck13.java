package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Marketpalcecheck13 extends CommonAPI {
    @Test
    public void marketpalcecheck13() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"extension-list\"]/div[5]/div[3]/section/div[2]/p[1]/a")).click();

    }

}
