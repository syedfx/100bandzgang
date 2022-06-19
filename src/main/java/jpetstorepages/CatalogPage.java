package jpetstorepages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends CommonAPI {

@FindBy(xpath = "a[href='actions/Catalog.action']")
    private WebElement birdLink;



public void clickBirdLink(){
    click(birdLink);
}






}
