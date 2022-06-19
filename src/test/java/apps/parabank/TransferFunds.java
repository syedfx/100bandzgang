package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TransferFunds extends CommonAPI {

    //7
    @Test
    public void transferFunds() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a")).click();
    }
}
