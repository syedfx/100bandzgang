package apps.opencart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test

    public void search() {

        driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();


    }

}
