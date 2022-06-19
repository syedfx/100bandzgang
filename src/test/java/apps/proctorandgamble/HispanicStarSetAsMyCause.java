package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HispanicStarSetAsMyCause extends CommonAPI {

    @Test
    public void hispanicStarSetAsMyCause(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[5]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[2]/div[6]/div[4]/div/div/div[4]/div/div[4]/div/div/a");
        waitFor(3);
        click("//*[@id=\"content\"]/main/div/div[2]/div[2]/div/div[1]/button");
    }

}
