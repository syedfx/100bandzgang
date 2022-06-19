package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReadMePage1 extends CommonAPI {

    //14
    @Test
    public void readMe() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]/a")).click();
    }

}
