package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ApiDemosPage {

    ElementHelper elementHelper;

    By actionBar = By.id("android:id/action_bar");
    By title = By.xpath("//*[@resource-id=\"android:id/action_bar\"]/android.widget.TextView");



    public ApiDemosPage(WebDriver driver) {

        this.elementHelper = new ElementHelper(driver);
    }


    public void checkApiDemosOpen() {

        elementHelper.checkElement(actionBar);
    }

    public String getApiDemosTitle() {

     // String text= elementHelper.getText(title)
     //   return text;
        //2nd way
        return elementHelper.getText(title);



    }



}
