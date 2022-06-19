package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollWebDriverIO extends CommonAPI {

    @Test
    public void WebdriverIOEnroll(){

        JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;

        click("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
        waitFor(1);
        click("/html/body/div[1]/div[1]/div/div[2]/div[17]/div/div[1]/a/div/div[1]/img");
        waitFor(2);

        ScrollDown.executeScript(("window.scrollBy(0,6000)"));

        String actualtitle = driver.getTitle();

        String expectedResult = "WebDriverIO Tutorial | RahulShetty Academy | Rahul Shetty Academy";
        String actualTitle = "WebDriverIO Tutorial | RahulShetty Academy | Rahul Shetty Academy";

        Assert.assertEquals(actualTitle,expectedResult);
        click("//*[@id=\"enroll-button\"]");


        Assert.assertEquals(actualTitle,expectedResult);




    }
}
