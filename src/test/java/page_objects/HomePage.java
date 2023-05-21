package page_objects;

import commond_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //private final By PersonalLink =By.linkText("Personal");
    //private final By BusinessLink =By.id("gnav20-eyebrow-link-Business");
    private final By StoresButton = By.xpath("//a[@data-label='Stores']");
    private final By ShopButton = By.xpath("//*[@id=\"gnav20-Shop-L1\"]");
    private final By FirstSingInButton = By.xpath("//*[@id='gnav20-sign-id']/span/span");
    private final By SingInToMyAccountButton = By.xpath("//*[@id=\"gnav20-sign-id-list-item-1\"]");
    private final By RegisterButton = By.xpath("//*[@id=\"gnav20-sign-id-list-item-3\"]");
    private final By PrepaidInstantPayButton = By.xpath("//*[@id=\"gnav20-sign-id-list-item-4\"]");
    private final By WishlistButton = By.xpath("//*[@id=\"gnav20-sign-id-list-item-5\"]");
    private final By BusinessLoginButton = By.xpath("//*[@id=\"gnav20-sign-id-list-item-6\"]");
    public WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public HomePage clickStoresLink(){
        LOGGER.info("Clicking on stores link");
        ActOn.element(driver, StoresButton).click();
        return this;
    }
    public HomePage clickOnSignInButton(){
        LOGGER.info("Clicking on sign in button");
        ActOn.element(driver, FirstSingInButton).click();
        return this;
    }
    public HomePage clickOnShopButton() throws InterruptedException {
        int retries = 3;
        int delayInMillis = 500;

        while (retries > 0) {
            try {
                LOGGER.info("Clicking on shop button");
                ActOn.element(driver, ShopButton).click();
                break; // Exit the loop if the action is successful
            } catch (StaleElementReferenceException e) {
                retries--;
                Thread.sleep(delayInMillis);
            }
        }
        return this;
    }
    public HomePage clickOnSingInToMyAccountButton(){
        LOGGER.debug("Clicking on sign in button");
        ActOn.element(driver, SingInToMyAccountButton).click();
        return this;
    }
    public HomePage clickOnRegisterButton(){
        LOGGER.info("Clicking on sign in button");
        ActOn.element(driver, RegisterButton).click();
        return this;
    }
    public HomePage clickOnPrepaidInstantPayButton(){
        LOGGER.info("Clicking on sign in button");
        ActOn.element(driver, PrepaidInstantPayButton).click();
        return this;
    }
    public HomePage clickOnWishlistButton(){
        LOGGER.info("Clicking on sign in button");
        ActOn.element(driver, WishlistButton).click();
        return this;
    }
    public HomePage clickOnBusinessLoginButton(){
        LOGGER.info("Clicking on sign in button");
        ActOn.element(driver, BusinessLoginButton).click();
        return this;
    }

}
