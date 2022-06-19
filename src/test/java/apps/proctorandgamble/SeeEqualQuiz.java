package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SeeEqualQuiz extends CommonAPI {
    @Test
    public void sustainabilityQuiz(){
        waitFor(2);
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[2]");
        waitFor(2);
        click("//*[@id=\"content\"]/main/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[10]/div/div/a/div[2]/div[1]");
        waitFor(3);
        click("//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[6]/button/picture/img");
    }
}
