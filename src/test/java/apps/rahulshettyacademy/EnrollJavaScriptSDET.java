package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollJavaScriptSDET extends CommonAPI {

    @Test
    public void JavaScriptSDETCourse(){

        waitFor(3);

        JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;

        ScrollDown.executeScript(("window.scrollBy(0,800)"));
        click("//*[@id=\"courses-block\"]/div[4]/div/div[1]/a/img");
        waitFor(2);
        ScrollDown.executeScript(("window.scrollBy(0,6000)"));
        String expectedResult = "JavaScript SDET- Automation Testing Package - 4 Courses Bundle | Rahul";
        String actualTitle = "JavaScript SDET- Automation Testing Package - 4 Courses Bundle | Rahul";

        waitFor(1);
        click("//*[@id=\"enroll-button\"]");

        String actualtitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedResult);



    }
}

