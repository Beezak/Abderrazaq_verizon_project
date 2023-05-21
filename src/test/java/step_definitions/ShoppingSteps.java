package step_definitions;

import commond_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ShoppingForDeals;
import page_objects.SingIn;
import utilities.ReadConfigFiles;

public class ShoppingSteps {
    private static Logger LOGGER = LogManager.getLogger(ShoppingSteps.class);
    WebDriver driver = Hooks.driver;
    @Given("^user is signed in successfully using \"(.+?)\" and \"(.+?)\"$")
    public void user_is_signed_in_successfully(String userid, String password) {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
        new ShoppingForDeals(driver)
                .clickOnSignInButton()
                .clickOnSingInToMyAccountButton();
        new SingIn(driver)
                .typeUserIdOrPhoneNumber(userid)
                .clickOnContinueButton()
                .typePassword(password)
                .clickOnSignInOrContinueButton();
        LOGGER.info("user is signed in");
    }
    @When("^user clicks on shop button$")
    public void user_clicks_on_shop_button() throws InterruptedException {
        new ShoppingForDeals(driver)
                .clickOnShopButton();
    }
    @And("^user clicks on deals button$")
    public void user_clicks_on_deals_button() {
        new ShoppingForDeals(driver)
                .clickOnDealsButton();
    }
    @And("^user clicks on free phones button$")
    public void user_clicks_on_free_phones_button() {
        new ShoppingForDeals(driver)
                .clickOnFreePhonesButton();
    }
    @Then("^user can choose a phone$")
    public void user_can_choose_a_phone() {
        new ShoppingForDeals(driver).choosingPhone();

    }
    @And("^user can add the phone to the wishlist$")
    public void user_can_add_the_phone_to_the_wishlist() {
        new ShoppingForDeals(driver)
                .clickingOnAddToWishList();
    }
    @Then("^user can chose the brand of the phone of the phone$")
    public void user_can_chose_the_brand_of_the_phone_of_the_phone() {
        new ShoppingForDeals(driver)
                .clickOnBrandButton()
                .clickOnGoogleBrand();
    }

    @And("^user can chose the color of the and search for result$")
    public void user_can_chose_the_color_of_the_and_search_for_result() {
        new ShoppingForDeals(driver)
                .clickOnColorButton()
                .clickOnYellowButton();
    }

    @And("^user will ne able to see the phone with specified characteristics$")
    public void user_will_ne_able_to_see_the_phone_with_specified_characteristics() {
        new ShoppingForDeals(driver)
                .getPhoneName();
    }
}
