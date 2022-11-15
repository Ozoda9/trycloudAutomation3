package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Tc04Page {

    public Tc04Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//label[@for='select_all_files']")
    public WebElement checkBox;
    @FindBy(xpath ="//input[@class='selectCheckBox checkbox'][1]")
    public WebElement allCheckBox;


    @FindBy(xpath = "//ul[@id='appmenu']//a")
    public  static List<WebElement> allModules;


    public static void clickEachModule(String  givenModule) {
        for (WebElement each : allModules) {
            if (each.getAttribute("aria-label").equals(givenModule)) {
                each.click();
                break;
            }
        }
    }
}
