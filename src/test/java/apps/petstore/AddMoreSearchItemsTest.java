package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddMoreSearchItemsTest extends CommonAPI {
    @Test
    public void addAdditionalItems() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        click("input[type='text']");
        click("//*[@id=\"MainImageContent\"]/map/area[2]");
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")).click();
        click("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Bulldog");
        click("input[type='submit']");
        click("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
        click("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a");

    }
}
