package step_definitions;

import commond_providers.ActOn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SingIn;
import utilities.ReadConfigFiles;

import java.util.List;
import java.util.Map;

public class SignInSteps {
    private static Logger LOGGER = LogManager.getLogger(SignInSteps.class);
    WebDriver driver = Hooks.driver;
    @Given("^user is on the sign in page$")
    public void user_is_on_the_sign_in_page() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new SingIn(driver)
                .clickOnSignInButton()
                .clickOnSingInToMyAccountButton();
        LOGGER.info("User is in the Sign in page");
    }
    @When("^user enters invalid the userId \"(.+?)\"$")
    public void user_enters_invalid_the_user_id(String userid) {
        new SingIn(driver)
                .typeUserIdOrPhoneNumber(userid)
                .clickOnContinueButton();
    }
    @When("^user enters password \"(.+?)\"$")
    public void user_enters_password(String password) {
        new SingIn(driver)
                .typePassword(password);
    }

    @When("^user enters valid userid \"(.+?)\" and password \"(.+?)\"$")
    public void user_enters_valid_credentials(String userid, String password) {
            new SingIn(driver)
                    .typeUserIdOrPhoneNumber(userid)
                    .clickOnContinueButton()
                    .typePassword(password);
            LOGGER.info("user has entered credentials");
    }
    @And("^user clicks on the sign in button$")
    public void user_clicks_on_the_sign_in_button() {
        new SingIn(driver)
                .clickOnSignInOrContinueButton()
                .clickOnRememberMyVerificationOption();
        LOGGER.info("user clicked on continue button");
    }
    @Then("^user gets an error message$")
    public void user_gets_an_error_message() {
        new SingIn(driver)
                .validateErrorMessage();
    }
    @Then("^user is signed in$")
    public void user_is_signed_in() {
        new SingIn(driver)
                .validateSignInMessage();
        LOGGER.info("a sign in message should be displayed");
    }
}
