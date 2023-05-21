package page_objects;

import commond_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoresPage extends HomePage{
    protected final By ZipCodeOrCityField = By.xpath("//input[@id='storesData']");
    private final By AddressDropDown = By.xpath("//li[@data-postalcode='20166']");
    private final By StorePhoneNumber = By.xpath("//*[@id=\"slSearch-Phn0Id\"]/a");
    public WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(StoresPage.class);
    public StoresPage(WebDriver driver) {
        super(driver);
    }
    public StoresPage typeZipCode(String value){
        LOGGER.info("typing the zip code");
        ActOn.element(driver, ZipCodeOrCityField).setValue(value);
        return this;
    }
    public StoresPage selectAddress(){
        LOGGER.info("click on address");
        ActOn.element(driver, AddressDropDown).click();
        return this;
    }
    public StoresPage getPhoneNumber(){
        LOGGER.info("getting the phone number");
        ActOn.element(driver, StorePhoneNumber).getTextValue();
        return this;
    }

}
