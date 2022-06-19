package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TotalActsOfGoodPage extends CommonAPI {

    @Test
    public void totalActsOfGoodPage(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[5]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[2]/div[1]/div/div/div/div/div[3]/div/div[4]/div/div/a");
    }

}
