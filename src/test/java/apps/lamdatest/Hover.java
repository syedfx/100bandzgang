package apps.lamdatest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends CommonAPI {
    @Test
    public void HoverTest() {
        Actions actions = new Actions(driver);
        WebElement platform = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/a"));
        actions.moveToElement(platform).perform();
    }
}
