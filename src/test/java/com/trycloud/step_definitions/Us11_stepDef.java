package com.trycloud.step_definitions;

import com.trycloud.pages.Us11_page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Us11_stepDef {
    Us11_page us11_page = new Us11_page();
    Select select;

    public Us11_stepDef() {
    }

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        BrowserUtils.sleep(3);
        this.us11_page.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
        BrowserUtils.sleep(3);
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        this.us11_page.talkIcon.click();
        BrowserUtils.sleep(3);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        BrowserUtils.verifyTitle(string);
    }

    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
        this.us11_page.searBox.sendKeys(new CharSequence[]{"user50"});
        this.us11_page.userSearch.click();
    }

    @When("user write a message")
    public void user_write_a_message() {
        this.us11_page.textBox.sendKeys(new CharSequence[]{"bye"});
    }

    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        this.us11_page.submitBtn.click();
    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
        this.us11_page.msg.isDisplayed();
    }
}
