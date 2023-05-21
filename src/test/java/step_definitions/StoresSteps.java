package step_definitions;

import commond_providers.ActOn;
import commond_providers.AssertThat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;
import utilities.ReadConfigFiles;

public class StoresSteps {
    private static Logger LOGGER = LogManager.getLogger(StoresSteps.class);
    private final By ZipCodeOrCityField = By.xpath("//input[@id='storesData']");
    private final By AddressDropDown = By.xpath("//li[@data-postalcode='20166']");
   // private final By StoreDetailsButton = By.xpath("//button[@id=\"slSearch-StoreDetailBtn0Id\"]");
    private final By StorePhoneNumber = By.xpath("//*[@id=\"slSearch-Time0Id\"]");
    WebDriver driver = Hooks.driver;
    @Given("^user is on the Verizon website$")
    public void user_is_on_the_verizon_website() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("VerizonURL"));
    }

    @When("^user clicks on stores link$")
    public void user_clicks_on_stores_link() {
        new HomePage(driver)
                .clickStoresLink();
    }

    @And("^user provides a zip code \"(.+?)\"$")
    public void user_provides_a_zip_code(String zipcode) {
        //new StoresPage(driver).typeZipCode(zipcode);
        ActOn.element(driver,ZipCodeOrCityField).setValue(zipcode);
    }

    @Then("^user selects the right address from the list$")
    public void user_selects_the_right_address_from_the_list() {
        //new StoresPage(driver).selectAddress();
        ActOn.element(driver, AddressDropDown).click();
    }

    @And("^the store's phone number should be displayed$")
    public void the_phone_number_of_the_store() {
        AssertThat.elementAssertions(driver, StorePhoneNumber).elementIsDisplayed();
        //String storePhoneNum= ActOn.element(driver, StorePhoneNumber).getTextValue();
        //LOGGER.info("this is the store's phone number: "+ storePhoneNum);


    }
}
