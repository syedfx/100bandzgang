package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserBillPayTest extends CommonAPI {

    //28
    @Test
    public void userBillPayTest() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Amber Heard");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("4567 13St");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("New York");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("NY");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("12345");
        //driver.findElement(By.xpath("//*[@id=\"915eedca-2a42-4db6-bcf1-07aaf4acdcd4\"]")).sendKeys("222-222-2222");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("15566");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("15566");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select")).sendKeys("13677");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")).click();
    }
}
