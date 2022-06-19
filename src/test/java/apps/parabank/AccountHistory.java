package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountHistory extends CommonAPI {

    //13
    @Test
    public void accountHistory() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[3]/a")).click();
    }

}
