package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CatalogPageTest extends CommonAPI {
    @Test
    public void CatalogPage() {

        click("a[href='actions/Catalog.action']");
    }
}
