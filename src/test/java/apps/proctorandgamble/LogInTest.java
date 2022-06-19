package apps.proctorandgamble;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogInTest extends CommonAPI {

    @Test
    public void logInTest(){
        click("//*[@id=\"__next\"]/div/div[1]/div/div/div/div/button");
        driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("zakgamerkahn@gmail.com");
        waitFor(5);
        driver.findElement(By.id("login-password")).sendKeys("abcD1234!");
        click("//*[@id=\"header-nav\"]/div[3]/div[2]/div/div[3]/div/form/div[6]/div[1]/input");

    }

}
