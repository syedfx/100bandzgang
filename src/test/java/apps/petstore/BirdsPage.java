package apps.petstore;

import base.CommonAPI;
import jpetstorepages.CatalogPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdsPage extends CommonAPI {
    @Test
    public void validateBirdPage() {

        CatalogPage catalog = new CatalogPage(driver);
        catalog.clickBirdLink();
        String expectedUrl = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
        Assert.assertEquals(expectedUrl, getPageTitle());



        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]")).click();
    }
}
