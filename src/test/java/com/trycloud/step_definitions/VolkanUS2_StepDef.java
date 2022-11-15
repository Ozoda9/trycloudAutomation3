package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.VolkanUS2PAGE;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VolkanUS2_StepDef {


        VolkanUS2PAGE volkan = new VolkanUS2PAGE();
        Faker faker=new Faker();

        @Given("user on the login page")
        public void user_on_the_login_page() {
            Driver.getDriver().get(ConfigReader.getProperty("env"));


        }
        @When("user enter invalid {string} and {string}")
        public void user_enter_invalid_and(String string, String string2) {
            volkan.userName.sendKeys(faker.name().username());
            volkan.password.sendKeys(faker.bothify("##?#???#?#"));

        }
        @When("user click the login button")
        public void user_click_the_login_button() {
            volkan.loginButton.click();

        }
        @Then("verify {string} message should be displayed")
        public void verify_message_should_be_displayed(String string) {

            String ActualMessage = volkan.messageDisplayed.getText();

            Assert.assertEquals("Message Verification",string,ActualMessage);

        }
    }
