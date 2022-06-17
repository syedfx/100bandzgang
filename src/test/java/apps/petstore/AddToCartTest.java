package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCartTest extends CommonAPI {
    @Test
    public void addToCart() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        waitFor(2);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("snake");
        waitFor(2);
        click("input[type='submit']");
        waitFor(2);
        click("a[href='/actions/Catalog.action?viewProduct=&productId=RP-SN-01']");
        waitFor(2);
        click("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-11']");
    }
}
