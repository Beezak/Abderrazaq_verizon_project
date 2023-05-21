package page_objects;

import commond_providers.ActOn;
import commond_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingForDeals extends SingIn{
    private final By DealsButton = By.xpath("//a[@id=\"gnav20-Shop-L2-2\"]");
    private final By FreePhonesButton = By.xpath("//a[@id=\"gnav20-Shop-L3-38\"]");
    private final By Iphone = By.xpath("//*[@id=\"productDetails\"]/a");
    private final By BrandButton = By.xpath("//*[@id=\"accordian-content\"]/div/div/div[1]/div[2]/div[1]/button/span");
    private final By GoogleBrandButton = By.xpath("//input[@value='Google']");
    private final By ColorButton = By.xpath("//*[@id=\"accordian-content\"]/div/div/div[3]/div[2]/div[1]/button/div/p");
    private final By YellowButton = By.xpath("//input[@value='Yellow']");
    private final By ViewResultsButton = By.xpath("//*[@id=\"buttonWrapper\"]/button[1]");
    private final By PhoneName = By.xpath("//span[@id=\"tileProductText\"]");
    private final By AddToWishListButton = By.xpath("//*[@id=\"cta-btn\"]/div[2]/div/a/span[2]");

    //private final By ContinueButton = By.xpath("//*[@id=\"cta-btn\"]/div[1]/button/span[1]");
    //private final By NewCustomerButton = By.xpath("//button[@aria-label='New Customer']/span");
    //private final By ExistingCustomerButton = By.xpath("//button[@aria-label='Existing Customer']/span");
    //private final By ZipCodeField = By.xpath("//input[@aria-label='Zip Code You must enter a Zip Code']");
    //private final By ConfirmLocationButton = By.xpath("//button[@aria-label='Confirm Location']/span[1]");
    //private final By SkipForNowButton = By.xpath("//button[@aria-label='Skip for now']/span[1]");

    private static  final Logger LOGGER = LogManager.getLogger(ShoppingForDeals.class);
    public ShoppingForDeals(WebDriver driver){
        super(driver);
    }
    public ShoppingForDeals clickOnDealsButton(){
        ActOn.element(driver,DealsButton).click();
        LOGGER.info("clicking on deals button");
        return this;
    }
    public ShoppingForDeals clickOnFreePhonesButton()  {
                LOGGER.info("clicking on free phone button");
                ActOn.element(driver, FreePhonesButton).click();
        return this;
    }
    public void  choosingPhone(){
        ActOn.element(driver,Iphone).click();
        //return this;
    }
    public void clickingOnAddToWishList(){
        //ActOn.element(driver,AddToWishListButton).click();
        AssertThat.elementAssertions(driver,AddToWishListButton).elementIsDisplayed();
        LOGGER.info("Adding the phone to wish list");
    }
    public ShoppingForDeals clickOnBrandButton(){
        ActOn.element(driver,BrandButton).click();
        LOGGER.info("clicking on brand button");
        return this;
    }
    public ShoppingForDeals clickOnGoogleBrand(){
        ActOn.element(driver,GoogleBrandButton).click();
        LOGGER.info("clicking on google brand  button");
        return this;
    }
    public ShoppingForDeals clickOnColorButton(){
        ActOn.element(driver,ColorButton).click();
        LOGGER.info("clicking on color button");
        return this;
    }
    public ShoppingForDeals clickOnYellowButton(){
        ActOn.element(driver,YellowButton).click();
        LOGGER.info("clicking on yellow button");
        return this;
    }
    public ShoppingForDeals clickOnViewResultButton(){
        ActOn.element(driver,ViewResultsButton).click();
        LOGGER.info("clicking on view result button");
        return this;
    }
    public ShoppingForDeals getPhoneName(){
        LOGGER.info("getting the phone name");
        ActOn.element(driver, PhoneName).getTextValue();
        return this;
    }
}
