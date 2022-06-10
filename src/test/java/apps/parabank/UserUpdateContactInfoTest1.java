package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserUpdateContactInfoTest1 extends CommonAPI {

    //38
    @Test
    public void updateContactInfoTest1() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("111-111-1111");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[8]/td[2]/input")).click();
    }
}
