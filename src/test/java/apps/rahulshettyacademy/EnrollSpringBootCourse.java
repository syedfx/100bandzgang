package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollSpringBootCourse extends CommonAPI {

    @Test

    public void CourseSpringBoot(){

        JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;

     click("body > div > header > div.header-upper > div > div > div.nav-outer.clearfix > nav > div.navbar-collapse.collapse.clearfix > ul > li:nth-child(2) > a");

     waitFor(3);

     ScrollDown.executeScript(("window.scrollBy(0,500)"));

     waitFor(4);

     click("/html/body/div[1]/div[1]/div/div[2]/div[12]/div/div[1]/a/div/div[1]/img");

     String actualtitle = driver.getTitle();

     String expectedResult = "Spring Boot Fundamentals with Unit Testing (MockMVC/Mockito) | Rahul";
        String actualTitle = "Spring Boot Fundamentals with Unit Testing (MockMVC/Mockito) | Rahul";

        Assert.assertEquals(actualTitle,expectedResult);











    }
}
