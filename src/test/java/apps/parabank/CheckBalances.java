package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBalances extends CommonAPI {

    //8
    @Test
    public void checkBalances() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[4]/a")).click();
    }

}
