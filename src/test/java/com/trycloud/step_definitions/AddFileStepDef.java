package com.trycloud.step_definitions;

import com.trycloud.pages.FileModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddFileStepDef {

    FileModulePage fileModulePage = new FileModulePage();
//    @Given("user on the dashboard page")
//    public void user_on_the_dashboard_page() {


//        fileModulePage.inputUsername.sendKeys(ConfigReader.getProperty("username"));
//        fileModulePage.inputPassword.sendKeys(ConfigReader.getProperty("password"));
//        fileModulePage.loginBtn.click();



    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {

       BrowserUtils.waitFor(2);
       fileModulePage.file.click();
       BrowserUtils.waitFor(2);

    }

    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(fileModulePage.rightClickOnFile).perform();



    }
    @And("user choose the Add to favorites option")
    public void userChooseTheAddToFavoritesOption() {

        BrowserUtils.waitFor(1);
        if(fileModulePage.addToFavorites.getText().equalsIgnoreCase("Remove from favorites")) {
            Actions actions = new Actions(Driver.getDriver());
            actions.doubleClick(fileModulePage.favoritesBtn).build().perform();
            BrowserUtils.waitFor(1);
        }else{
            fileModulePage.addToFavorites.click();
            BrowserUtils.waitFor(1);
        }




    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

        fileModulePage.favoritesBtn.click();
        BrowserUtils.waitFor(3);




    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

        Assert.assertFalse(fileModulePage.verifyFavorites.getText().equalsIgnoreCase(("No favorites yet")));

    }



}

