package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTest extends CommonAPI {

    @Test
    public void ValidRegister() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        click("input[type='text']");
        click("//*[@id=\"MenuContent\"]/a[2]");
        click("//*[@id=\"Catalog\"]/a");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("TigerKing");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("exotic");
        driver.findElement(By.cssSelector("input[name='repeatedPassword']")).sendKeys("exotic");
        driver.findElement(By.cssSelector("input[name='account.firstName']")).sendKeys("Joe");
        driver.findElement(By.cssSelector("input[name='account.lastName']")).sendKeys("Exotic");
        driver.findElement(By.cssSelector("input[name='account.email']")).sendKeys("Joe@tigerking.com");
        driver.findElement(By.cssSelector("input[name='account.phone']")).sendKeys("123-456-7890");
        driver.findElement(By.cssSelector("input[name='account.address1']")).sendKeys("123 456 Avenue");
        driver.findElement(By.cssSelector("input[name='account.address2']")).sendKeys("Apartment 2");
        driver.findElement(By.cssSelector("input[name='account.city']")).sendKeys("LIC");
        driver.findElement(By.cssSelector("input[name='account.state']")).sendKeys("NY");
        driver.findElement(By.cssSelector("input[name='account.zip']")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[name='account.country']")).sendKeys("USA");
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
    }
}
