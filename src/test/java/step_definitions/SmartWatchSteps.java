package step_definitions;

import commond_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.SmartWatch;
import utilities.ReadConfigFiles;

public class SmartWatchSteps {
    WebDriver driver = Hooks.driver;
    @Given("^user is on the home page$")
    public void user_is_on_the_home_page() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
    }
    @When("^user clicks on watches button$")
    public void user_clicks_on_watches_button() {
        new SmartWatch(driver)
                .clickingOnWatchesButton();
    }
    @And("^user chooses the brand$")
    public void user_chooses_the_brand() {
        new SmartWatch(driver)
                .clickingOnBrandButton()
                .clickingOnAppleButton();
    }
    @And("^user chooses brand Type$")
    public void user_chooses_brand_type() {
        new SmartWatch(driver)
                .clickingOnBrandTypeButton()
                .clickingOnSportsButton();
    }
    @And("^user chooses the color$")
    public void user_chooses_the_color() {
        new SmartWatch(driver)
                .clickingOnColorButton()
                .clickingOnBlueButton();
    }
    @Then("^user can see the results$")
    public void user_can_see_the_results() {
        new SmartWatch(driver)
                .clickingOnViewResultsButton();
    }
}
