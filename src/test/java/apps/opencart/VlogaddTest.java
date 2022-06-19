package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VlogaddTest extends CommonAPI {
    @Test
    public void vlogadd() {
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[6]/a")).click();


    }
}
