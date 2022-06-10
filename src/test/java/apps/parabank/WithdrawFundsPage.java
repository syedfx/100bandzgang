package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WithdrawFundsPage extends CommonAPI {

    //2
    @Test
    public void withdrawFunds(){
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a")).click();
    }
}
