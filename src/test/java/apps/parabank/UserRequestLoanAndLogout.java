package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserRequestLoanAndLogout extends CommonAPI {

    //26
    @Test
    public void userRequestLoanPageAndThenLogout() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
    }
}
