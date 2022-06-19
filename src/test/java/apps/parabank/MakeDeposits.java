package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MakeDeposits extends CommonAPI {

    //9
    @Test
    public void makeDeposits() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[5]/a")).click();
    }

}
