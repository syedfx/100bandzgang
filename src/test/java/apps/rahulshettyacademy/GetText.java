package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GetText extends CommonAPI {

    @Test
    public void GetTextTest(){

        System.out.println(driver.findElement(By.xpath("//*[@id=\"carousel-example-generic\"]/div/div/div/div/h2/span")).getText());

    }


}
