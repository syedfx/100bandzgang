package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserTransferFundsTest extends CommonAPI {

    //22
    @Test
    public void userTransfersFundsTest() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]")).sendKeys("13344");
        driver.findElement(By.xpath("//*[@id=\"toAccountId\"]")).sendKeys("13677");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")).click();
    }
}
