package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactUs extends CommonAPI {

    //10
    @Test
    public void contactUs() {
        driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[8]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Johnny Depp");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("JohnnyDepp@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("222-222-2222");
        driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("bla bla bla bla fix it");
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
    }
}
