package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GetText extends CommonAPI {

    @Test
    public void GetText(){
        //driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        click("//*[@id=\"SidebarContent\"]/a[1]");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]")).getText());
    }
}
