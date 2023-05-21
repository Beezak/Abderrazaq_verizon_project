package step_definitions;

import commond_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SupportPage;
import utilities.ReadConfigFiles;

public class SupportSteps {
    private static final Logger LOGGER = LogManager.getLogger(SupportSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on home page$")
    public void user_is_on_home_page() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        LOGGER.info("User is in the home page");
    }

    @When("^user clicks on support button$")
    public void user_clicks_on_support_button() {
        new SupportPage(driver)
                .clickOnSupportButton();
        LOGGER.info("user has clicked on support button");
    }

    @And("^user clicks on contact us option$")
    public void user_clicks_on_contact_us_option() {
        new SupportPage(driver)
                .clickOnContactUsButton();
        LOGGER.info("user has clicked on contact us option");
    }

    @And("^user clicks on more option button$")
    public void user_clicks_on_more_option_button() {
        new SupportPage(driver)
                .clickOnMoreOptionsButton();
        LOGGER.info("user has clicked on more option button");
    }

    @Then("^user can see contact info$")
    public void user_can_see_contact_info() {
        new SupportPage(driver)
                .getContactInfo();
        LOGGER.info("contact info should be visible to the user");
    }
    @When("^user clicks on Mobile button$")
    public void user_clicks_on_mobile_button() {
        new SupportPage(driver)
                .clickOnMobileButton();
        LOGGER.info("user has clicked on mobile button");
    }
    @When("^user clicks on International travel$")
    public void user_clicks_on_international_travel() {
        new SupportPage(driver)
                .clickOnInternationalTravelButton();
        LOGGER.info("user has clicked on international travel");
    }
    @When("^user clicks on call us$")
    public void user_clicks_on_call_us() {
        new SupportPage(driver)
                .clickOnCullUsButton();
        LOGGER.info("user has clicked on call us button");
    }
    @Then("^user can see contact number$")
    public void user_can_see_contact_number() {
        LOGGER.info("the contact phone number should be visible");
    }
}
