package apps.rahulshettyacademy;

import base.CommonAPI;
import org.testng.annotations.Test;

public class LearningPathPython extends CommonAPI {

    @Test
    public void OptionPython(){

        click("/html/body/div/div[2]/section[1]/div/div/div[4]/a");
        waitFor(2);
        click("/html/body/div/div[2]/div/div/div[2]/div/a[3]");
    }
}
