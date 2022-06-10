package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterAndLogout extends CommonAPI {

    //4
    @Test
    public void registerAndThenLogout(){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        driver.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("Johnny");
        driver.findElement(By.cssSelector("input[id='customer.lastName']")).sendKeys("Depp");
        driver.findElement(By.cssSelector("input[id='customer.address.street']")).sendKeys("1234 12St");
        driver.findElement(By.cssSelector("input[id='customer.address.city']")).sendKeys("New York");
        driver.findElement(By.cssSelector("input[id='customer.address.state']")).sendKeys("NY");
        driver.findElement(By.cssSelector("input[id='customer.address.zipCode']")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[id='customer.phoneNumber']")).sendKeys("222-222-2222");
        driver.findElement(By.cssSelector("input[id='customer.ssn']")).sendKeys("333445555");
        driver.findElement(By.cssSelector("input[id='customer.username']")).sendKeys("JohnnyDp");
        driver.findElement(By.cssSelector("input[id='customer.password']")).sendKeys("lalala0");
        driver.findElement(By.cssSelector("input[id='repeatedPassword']")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
    }
}
