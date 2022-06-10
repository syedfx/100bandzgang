package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindTransactionsPageAndLogout extends CommonAPI {

    //32
    @Test
    public void findTransactionsPageAndThenLogout() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
    }
}
