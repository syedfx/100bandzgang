package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FeatureaddTest extends CommonAPI {
    @Test
    public void featureadd() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[7]/a")).click();
    }
}
