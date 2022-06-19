package apps.proctorandgamble;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigatingToProfile extends CommonAPI {

    @Test
    public void navigatingToProfile(){
        click("//*[@id=\"__next\"]/div/div[1]/div/div/div/div/button");
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("zakgamerkahn@gmail.com");
        waitFor(5);
        driver.findElement(By.id("login-password")).sendKeys("abcD1234!");
        click("//*[@id=\"header-nav\"]/div[3]/div[2]/div/div[3]/div/form/div[6]/div[1]/input");
        click("//*[@id=\"header-nav\"]/div[3]/div[2]");
        waitFor(5);
        click("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/button");
        waitFor(3);
        click("//*[@id=\"__next\"]/div/div[3]/div/div[1]/button/span/svg/g/g/line[1]");
    }

}
