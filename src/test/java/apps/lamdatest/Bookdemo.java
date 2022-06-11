package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bookdemo extends CommonAPI {
    @Test
    public void BookademoTest() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div[1]/div/div/a[2]")).click();
    }
}
