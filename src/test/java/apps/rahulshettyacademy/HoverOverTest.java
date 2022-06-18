package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverOverTest extends CommonAPI {

    @Test

    public void MouseHoverOver(){

        WebElement element =driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}
