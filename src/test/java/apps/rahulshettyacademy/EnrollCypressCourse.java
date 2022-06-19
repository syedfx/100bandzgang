package apps.rahulshettyacademy;

import base.CommonAPI;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class EnrollCypressCourse extends CommonAPI {



    @Test
    public void EnrollCypress(){

        JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;

        click("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
        waitFor(2);
        click("/html/body/div[1]/div[1]/div/div[2]/div[18]/div/div[1]/a/div/div[1]/img");
        waitFor(3);
        ScrollDown.executeScript(("window.scrollBy(0,6000)"));
        click("//*[@id=\"enroll-button\"]");

    }


}
