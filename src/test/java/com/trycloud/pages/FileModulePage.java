package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.ObjectInputFilter;
import java.util.List;

public class FileModulePage {

    public FileModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
//    @FindBy(xpath ="//input[@id='user']")
//    public WebElement inputUsername;
//
//    @FindBy(xpath = "//input[@id='password']")
//    public WebElement inputPassword;
//
//
//    @FindBy(xpath = "//input[@id='submit-form']" )
//    public WebElement loginBtn;


//    public void login(String username,String password) {
//        inputUsername.sendKeys("username");
//        inputPassword.sendKeys("password");
//           loginBtn.click();
//    }


        @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Dashboard']//[name()='svg']//[name()='image' and contains(@class,'app-icon')]")
        public WebElement dashboard;

        //html/body/header/div[1]/ul/li[2]/a/svg
        @FindBy(xpath = "//ul[@id='appmenu']/li[2]/a")
        public WebElement file;

        @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Photos']//[name()='svg']//[name()='image' and contains(@class,'app-icon')]")

        public WebElement photo;

    @FindBy (xpath = "//*[@id='rightClickMenu']/ul/li[1]")
    public WebElement addToFavorites;


    @FindBy (xpath = "//li[@data-id='favorites']")
    public WebElement favoritesBtn;


    @FindBy(xpath = "//a[@class=\"nav-icon-files svg\"]")
    public WebElement talkNavIconFilesLink;

    @FindBy(xpath = "(//span[@class='nametext'])[1]")
    public WebElement rightClickOnFile;



    @FindBy (xpath = "//*[@id='fileList']/tr/td[1]/a/span[1]/span[1]")
    public WebElement verifyFavorites;



    @FindBy(xpath = "//div[@class=\"thumbnail\"][.//span[@class=\"icon icon-starred\"]]")
    public WebElement favoritedThumbnail;



    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[3]/td[2]/a/span[3]/a[2]/span[1]")
        public WebElement iconAction;



        // @FindBy(xpath = "//ul[@id='appmenu']/li[2]/a")
        //public WebElement filemodule;

        @FindBy(xpath = "//ul[@id='appmenu']//a")
        public static List<WebElement> allModules;

        public static void clickEachModule(String givenModule) {
            for (WebElement each : allModules) {
                if (each.getAttribute("aria-label").equals(givenModule)) {
                    each.click();
                    break;
                }
            }}}



