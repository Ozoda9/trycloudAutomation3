package com.trycloud.step_definitions;

import com.trycloud.pages.Page;
import com.trycloud.pages.Tc04Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Tc04_stepDef {
   Tc04Page tc04Page=new Tc04Page();
  //  LoginPage loginPage = new LoginPage();
  Page page = new Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        page.usernameInput.sendKeys("username");
        page.passwordInput.sendKeys("password");
        page.loginButton.click();
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String header) {
    tc04Page.clickEachModule(header);

    }




    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String exp) {
        String act = Driver.getDriver().getTitle();
        Assert.assertEquals(exp, act);

    }
    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        BrowserUtils.sleep(1);
     tc04Page.checkBox.click();

    }


    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        BrowserUtils.sleep(2);
        Assert.assertTrue( tc04Page.allCheckBox.isSelected());
    }


}
