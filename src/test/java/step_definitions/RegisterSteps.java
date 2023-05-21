package step_definitions;

import commond_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;
import page_objects.RegisterPage;
import utilities.ReadConfigFiles;

public class RegisterSteps {

    private static Logger LOGGER = LogManager.getLogger(RegisterSteps.class);
    WebDriver driver = Hooks.driver;
    @Given("^user is on the registration page$")
    public void user_is_on_the_registration_page() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new HomePage(driver)
                .clickOnSignInButton()
                .clickOnRegisterButton();
        LOGGER.info("User is in the registration page");
    }
    @When("^user chooses mobile register$")
    public void user_chooses_mobile_register() {
        new RegisterPage(driver).clickOnMobileRegister();
    }
    @And("^user clicks os register by email address$")
    public void user_clicks_os_register_by_email_address() {
        new RegisterPage(driver)
                .clickOnRegisterUsingEmail();
    }
    @And("^User enters email address \"(.+?)\"$")
    public void user_enters_email_address(String email) {
        new RegisterPage(driver)
                .typeEmailAddress(email);
    }
    @And("^user clicks on the continue button$")
    public void user_clicks_on_the_continue_button() {
        new RegisterPage(driver)
                .clickOnContinueButton();
    }
    @Then("^an email will be sent the user$")
    public void an_email_will_be_sent_the_user() {
        new RegisterPage(driver)
                .validateEmailRegistrationSent();
    }
}
