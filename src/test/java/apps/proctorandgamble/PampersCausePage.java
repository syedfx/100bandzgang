package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class PampersCausePage extends CommonAPI {

    @Test
    public void pampersCausePage(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[5]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div[2]/div[4]/div[10]/div/div/div[4]/div/div[4]/div/div/a");
    }
}
