package apps.proctorandgamble;

import base.CommonAPI;
import org.testng.annotations.Test;

public class GiverQuiz extends CommonAPI {

    @Test
    public void giverQuiz(){
        waitFor(3);
        click("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[2]");
        waitFor(3);
        //driver.findElement(By.cssSelector("img[src='https://images.ctfassets.net/5tx4oa3foqys/4Nh0BQlAlGAWqpPArNkGCT/92e3d3db958032e1ceee2ef0f253efe7/giver-card-quiz-tile_2x.jpg?w=1028']")).click();
        click("//*[@id=\"content\"]/main/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[11]/div/div/a");
        waitFor(3);
        click("//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[6]/button/picture/img");
    }

}
