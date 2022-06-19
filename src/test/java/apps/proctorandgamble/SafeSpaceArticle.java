package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SafeSpaceArticle extends CommonAPI {

    @Test
    public void safeSpaceArticle(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[4]");
        waitFor(7);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[4]/div/div/div/div/a");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[6]/div/div/button/div[2]/div/div");
    }

}
