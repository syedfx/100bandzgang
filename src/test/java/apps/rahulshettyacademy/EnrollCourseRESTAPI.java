package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollCourseRESTAPI extends CommonAPI {

    @Test
    public void EnrollREST(){

        JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;

        click("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
        waitFor(2);
        click("/html/body/div[1]/div[1]/div/div[2]/div[13]/div/div[1]/a/div/div[1]/img");

        String actualtitle = driver.getTitle();

        String expectedResult = "API Testing RestAssured tutorial | RahulShetty Academy | Rahul Shetty";
        String actualTitle = "API Testing RestAssured tutorial | RahulShetty Academy | Rahul Shetty";

        Assert.assertEquals(actualTitle,expectedResult);

    }
}

