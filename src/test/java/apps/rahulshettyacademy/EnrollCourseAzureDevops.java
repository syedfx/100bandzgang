package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollCourseAzureDevops extends CommonAPI {

    @Test
    public void EnrollAzureDevOps(){

        JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;

        click("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
        waitFor(1);
        click("/html/body/div[1]/div[1]/div/div[2]/div[15]/div/div[1]/a/div/div[1]/img");
        waitFor(1);
        ScrollDown.executeScript(("window.scrollBy(0,6000)"));
        waitFor(2);
        click("//*[@id=\"enroll-button\"]");
        waitFor(2);
        ScrollDown.executeScript(("window.scrollBy(0,6000)"));

        System.out.println(driver.findElement(By.xpath("//*[@id=\"react-checkout\"]/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/a")).getText());

        String actualtitle = driver.getTitle();

        String expectedResult = "Rahul Shetty Academy";
        String actualTitle = "Rahul Shetty Academy";

        Assert.assertEquals(actualTitle,expectedResult);



    }
}
