package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SecondTenMealsDonation extends CommonAPI {

    @Test
    public void secondTenMealsDonation(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[3]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[4]/div[3]/div[1]/a[1]/div[2]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[11]/a");
    }

}
