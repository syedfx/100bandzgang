package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class GreenHouseGasQuiz extends CommonAPI {

    @Test
    public void greenHouseGasQuiz(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[4]");
        waitFor(7);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[6]/div/div/div/div/a[1]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[4]/div/div/button/div[2]/div/div");
        waitFor(3);
        click("//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[5]/p[3]/a");
    }

}
