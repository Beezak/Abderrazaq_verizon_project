package step_definitions;

import commond_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.AccessoriesPage;
import page_objects.HomePage;
import utilities.ReadConfigFiles;

public class AccessoriesSteps {
    private static Logger LOGGER = LogManager.getLogger(AccessoriesSteps.class);
    WebDriver driver = Hooks.driver;
    @Given("^user is on verizon home page$")
    public void user_is_on_verizon_home_page(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
    }
    @When("^user clicks on shop and accessories buttons$")
    public void user_clicks_on_shop_and_accessories_buttons() throws InterruptedException {
        new HomePage(driver)
                .clickOnShopButton();
        new AccessoriesPage(driver)
                .clickingOnAccessoriesButton();
    }
    @And("^user clicks on phone and tablet accessories$")
    public void user_clicks_on_phone_and_tablet_accessories() {
        new AccessoriesPage(driver)
                .clickingOnPhoneAccessoriesButton();
    }
    @And("^user clicks on phone cases$")
    public void user_clicks_on_phone_cases() {
        new AccessoriesPage(driver)
                .clickingOnPhoneCasesButton();
    }
    @Then("^user chooses a apple cases$")
    public void user_chooses_a_phone_case() {
        new AccessoriesPage(driver)
                .clickOnAppleCases();
    }
}
