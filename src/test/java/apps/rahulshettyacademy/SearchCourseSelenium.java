package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCourseSelenium extends CommonAPI {

    @Test
    public void SearchSelenium(){
        click("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
        driver.findElement(By.xpath("//*[@id=\"search-courses\"]")).sendKeys("Selenium");
        click("//*[@id=\"search-course-button\"]");

        String actualtitle = driver.getTitle();

        String expectedResult = "https://courses.rahulshettyacademy.com/courses";
        String actualTitle = "https://courses.rahulshettyacademy.com/courses";

        Assert.assertEquals(actualTitle,expectedResult);

    }
}
