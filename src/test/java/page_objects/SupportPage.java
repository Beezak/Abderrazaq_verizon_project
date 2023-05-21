package page_objects;

import commond_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class SupportPage {
    private final By SupportButton =By.xpath("//button[@aria-label=\"Support Menu List\"][1]");
    private final By ContactUsButton =By.xpath("//a[@id='gnav20-Support-L2-5']");
    private final By MoreOptionsButton =By.xpath("//a[@aria-label='More options, Opens a Modal']");
    private final By CustomerServiceInfo =By.xpath("//*[@id=\"additionalInfo\"]/div[3]/div/div/div/div/span/div[1]/div/div[1]/div[1]");
    private final By MobileButton = By.xpath("//*[@id=\"app\"]/div/section[1]/div[2]/div[2]/a/div");
    private final By InternationalTravelButton = By.xpath("//a[@data-testid='mobile_Internationaltravel_cta']");
    private final By CullUsButton = By.xpath("//a[@data-testid='mobile_ Internationaltravel_callus_cta']");
    private final By PhoneNumber = By.xpath("//p[@id=\"subtitle_content\"]");
    private static Logger LOGGER = LogManager.getLogger(SupportPage.class);
    public WebDriver driver;
    public SupportPage(WebDriver driver){
        this.driver = driver;
    }

    public SupportPage clickOnSupportButton(){
        ActOn.element(driver, SupportButton).click();
        LOGGER.info("clicking on support button");
        return this;
    }
    public SupportPage clickOnContactUsButton(){
        ActOn.element(driver, ContactUsButton).click();
        LOGGER.info("clicking on contact us button");
        return this;
    }
    public SupportPage clickOnMoreOptionsButton(){
        ActOn.wait(driver,MoreOptionsButton).waitForElementToBeVisible();
        ActOn.element(driver, MoreOptionsButton).click();
        LOGGER.info("clicking on more options button");
        return this;
    }
    public SupportPage getContactInfo() {
        //ActOn.element(driver, CustomerServiceInfo).getTextValue();
        LOGGER.info("User can see or get contact info");
        return this;
    }
    public SupportPage clickOnMobileButton(){
        ActOn.wait(driver,MobileButton).waitForElementToBeVisible();
        ActOn.element(driver, MobileButton).click();
        LOGGER.info("clicking on more options button");
        return this;
    }
    public SupportPage clickOnInternationalTravelButton(){
       // ActOn.wait(driver,InternationalTravelButton).waitForElementToBeVisible();
        ActOn.element(driver, InternationalTravelButton).click();
        LOGGER.info("clicking on more options button");
        return this;
    }
    public SupportPage clickOnCullUsButton(){
        ActOn.wait(driver,CullUsButton).waitForElementToBeVisible();
        ActOn.element(driver, CullUsButton).click();
        LOGGER.info("clicking on more options button");
        return this;
    }
}


