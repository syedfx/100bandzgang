package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BillPay extends CommonAPI {

    //12
    @Test
    public void billPay() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[2]/a")).click();
    }

}
