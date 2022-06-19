package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class WhereToShop extends CommonAPI {

    @Test
    public void whereToShop(){

        waitFor(5);
        click("//div/a[@href='/sitemap/']");
    }
}
