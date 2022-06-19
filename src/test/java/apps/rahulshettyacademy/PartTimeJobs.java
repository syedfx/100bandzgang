package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class PartTimeJobs extends CommonAPI {

    @Test
    public void PartTime(){
        waitFor(5);

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a")).click();
        waitFor(2);
        driver.findElement((By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/ul/li[2]/a"))).click();
        waitFor(2);

        WebElement jobs = driver.findElement(By.xpath("//*[@id=\"select-job-type\"]"));
        waitFor(1);
        Select jobDropDown = new Select(jobs);
        waitFor(2);
        jobDropDown.selectByValue("qaArticle");
        waitFor(2);

        driver.findElement(By.xpath("//*[@id=\"partTimeJobForm\"]/div/div[2]/div/p/a")).click();
    }
}
