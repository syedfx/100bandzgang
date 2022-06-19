package apps.proctorandgamble;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTest extends CommonAPI {

   /* @Test
    public void quizTest(){
        click("//*[@id=\"kt-layout-id_5c1b91-c0\"]/div/div[1]/div/a[5]");
        click("//*[@id=\"post-197\"]/div/div/div[2]/div[1]/h3/a");
        waitFor(5);
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input_120\"]"));
        Select emailField = new Select(email);
    }*/

    @Test
    public void createAccount(){
        click("//*[@id=\"__next\"]/div/div[1]/div/div/div/div/a");
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("zak");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zakgamerkahn@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcD1234!");
        click("//*[@id=\"content\"]/main/div/div/div/div/div/div[2]/form/div[7]/div/input");
    }



}
