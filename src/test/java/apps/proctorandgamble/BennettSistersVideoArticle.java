package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class BennettSistersVideoArticle extends CommonAPI {

    @Test
    public void bennettSistersVideoArticle(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[4]");
        waitFor(7);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[5]/div/div/div/div/a[2]");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[12]/div/div/button/div[2]/div/div");
    }

}
