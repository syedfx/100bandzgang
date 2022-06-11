package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ImpactStoryArticle extends CommonAPI {

    @Test
    public void impactStoryArticle(){
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[4]");
        waitFor(7);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[4]/div/div/div/div/a");
        waitFor(5);
        click("//*[@id=\"content\"]/main/div/div/div[4]/div/div[4]/div/div/button");
    }

}
