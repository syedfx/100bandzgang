package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Starttrialtest extends CommonAPI {
    @Test
    public void starttrialTest() {
        driver.findElement(By.xpath("//*[@id=\"testing_form\"]/input[1]")).sendKeys("John123@gmail.com");
    }
}
