package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgotLoginInfoPage extends CommonAPI {

    //15
    @Test
    public void forgotLoginInfo() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Johnny");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Depp");
        driver.findElement(By.xpath("//*[@id=\"address.street\"]")).sendKeys("1234 12St");
        driver.findElement(By.xpath("//*[@id=\"address.city\"]")).sendKeys("New York");
        driver.findElement(By.xpath("//*[@id=\"address.state\"]")).sendKeys("NY");
        driver.findElement(By.xpath("//*[@id=\"address.zipCode\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"ssn\"]")).sendKeys("333445555");
        driver.findElement(By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")).click();
    }
}
