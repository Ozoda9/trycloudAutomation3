package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us11_page {
    @FindBy(
            id = "user"
    )
    public WebElement inputUsername;
    @FindBy(
            id = "password"
    )
    public WebElement inputPassword;
    @FindBy(
            id = "submit-form"
    )
    public WebElement loginBtn;
    @FindBy(
            xpath = "//*[@id=\"appmenu\"]/li[5]/a"
    )
    public WebElement talkIcon;
    @FindBy(
            xpath = "//*[@id=\"app-navigation-vue\"]/div[1]/form/input"
    )
    public WebElement searBox;
    @FindBy(
            xpath = "//*[@id=\"conversation_67z5pcu9\"]"
    )
    public WebElement userSearch;
    @FindBy(
            xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[3]/div/form/div[3]/div/div"
    )
    public WebElement textBox;
    @FindBy(
            xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[3]/div/form/button"
    )
    public WebElement submitBtn;
    @FindBy(
            xpath = "//*[@id=\"message_4723\"]"
    )
    public WebElement msg;

    public Us11_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String username, String password) {
        this.inputUsername.sendKeys(new CharSequence[]{username});
        this.inputPassword.sendKeys(new CharSequence[]{password});
        this.loginBtn.click();
    }
    //HERE YOU GO
}
