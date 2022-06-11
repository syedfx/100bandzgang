package apps.parabank;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TitleTest extends CommonAPI {

    //1
    @Test
    public void validatePage(){
        driver.getTitle();
    }
}
