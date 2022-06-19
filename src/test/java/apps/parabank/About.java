package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class About extends CommonAPI {

    //11
    @Test
    public void aboutUs() {
        driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[2]/a")).click();
    }

}
