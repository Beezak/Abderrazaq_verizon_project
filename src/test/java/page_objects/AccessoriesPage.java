package page_objects;

import commond_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage {
    private final By AccessoriesButton = By.xpath("//a[@id=\"gnav20-Shop-L2-4\"]");
    private final By PhoneAccessoriesButton = By.xpath("//a[@id=\"Shop-L3-45\"]");
    private final By PhoneCasesButton = By.xpath("//a[@id=\"gnav20-Shop-L4-19\"]");
    private final By AppleCasesButton = By.xpath("//*[@id=\"Apple_2\"]");
    public WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    public AccessoriesPage(WebDriver driver){
        this.driver = driver;
    }
    public AccessoriesPage clickingOnAccessoriesButton(){
        ActOn.element(driver, AccessoriesButton).click();
        LOGGER.info("clicking on accessories button");
        return this;
    }
    public AccessoriesPage clickingOnPhoneAccessoriesButton(){
        ActOn.element(driver, PhoneAccessoriesButton).click();
        LOGGER.info("clicking on phone and tablet accessories button");
        return this;
    }
    public AccessoriesPage clickingOnPhoneCasesButton(){
        ActOn.element(driver, PhoneCasesButton).click();
        LOGGER.info("clicking on phone cases button");
        return this;
    }
    public AccessoriesPage clickOnAppleCases(){
        ActOn.wait(driver,AppleCasesButton).waitForElementToBeVisible();
        ActOn.element(driver, AppleCasesButton).click();
        LOGGER.info("clicking on apple cases");
        return this;
    }
}
