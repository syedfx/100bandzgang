package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SweepStakes extends CommonAPI {

    @Test
    public void sweepStakes(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[3]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[4]/div[3]/div[1]/a[2]/div[2]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[1]/a/div[1]/div/img");
    }
}
