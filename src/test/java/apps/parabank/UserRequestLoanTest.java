package apps.parabank;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserRequestLoanTest extends CommonAPI {

    //25
    @Test
    public void userRequestLoanTest() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("JohnnyD");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lalala0");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("50000");
        driver.findElement(By.xpath("//*[@id=\"downPayment\"]")).sendKeys("4000");
        driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]")).sendKeys("13344");
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
    }
}
