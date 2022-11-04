package com.trycloud.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {

    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }

    public static void verifyTitle(String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);

        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());

        }
        return actualOptionsAsString;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {
        for (WebElement eachButton : radioButtons) {
            if (eachButton.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                eachButton.click();
            }
        }
    }

}
