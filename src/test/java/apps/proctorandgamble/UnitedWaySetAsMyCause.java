package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class UnitedWaySetAsMyCause extends CommonAPI {

    @Test
    public void unitedWaySetAsMyCause(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[5]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[2]/div[4]/div[7]/div/div/div[4]/div/div[4]/div/div/a");
        waitFor(3);
        click("//*[@id=\"content\"]/main/div/div[2]/div[2]/div/div[1]/button");
    }
}
