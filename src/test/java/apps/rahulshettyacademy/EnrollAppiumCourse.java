package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollAppiumCourse extends CommonAPI {

    @Test
    public void EnrollAppium(){

        JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;

        click("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
        waitFor(2);
        ScrollDown.executeScript(("window.scrollBy(0,3000)"));
        waitFor(1);
        click("/html/body/div[1]/div[1]/div/div[2]/div[20]/div/div[1]/a/div/div[1]/img");
        waitFor(2);

        String actualtitle = driver.getTitle();

        String expectedResult = "Appium tutorial for Mobile Apps testing | RahulShetty Academy | Rahul";
        String actualTitle = "Appium tutorial for Mobile Apps testing | RahulShetty Academy | Rahul";
        System.out.println(driver.findElement(By.xpath("//*[@id=\"block-158855\"]/div[1]/div[2]/div/div[2]/h2")).getText());
        waitFor(2);
        ScrollDown.executeScript(("window.scrollBy(0,6000)"));
        click("//*[@id=\"enroll-button\"]");
        waitFor(1);
        click("//*[@id=\"react-checkout\"]/div/div/div[1]/div[2]/div/button");
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"react-checkout\"]/div/div/div[1]/div[2]/div/div[2]/div/div/input")).sendKeys("RahulShetty2022");


        Assert.assertEquals(actualTitle,expectedResult);


    }
}
