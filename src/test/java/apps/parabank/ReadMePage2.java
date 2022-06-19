package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReadMePage2 extends CommonAPI {

    //17
    @Test
    public void readMe2() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[2]/a")).click();
    }

}
