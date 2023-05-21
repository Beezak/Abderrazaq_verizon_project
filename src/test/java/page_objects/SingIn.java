package page_objects;

import commond_providers.ActOn;
import commond_providers.AssertThat;
import commond_providers.ElementActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SingIn extends HomePage {
    private final By UserIdField = By.id("IDToken1");
    private final By ContinueButton = By.id("continueBtn");
    private final By PasswordField = By.id("IDToken2");
    private final By SignInButton = By.id("continueBtn");
    private final By RememberMyVerificationOption = By.xpath("//*[@id=\"emailReset\"]");
    private final By VerifyNextTimeOption = By.xpath("//*[@id=\"ivrReset\"]");
    private final By ErrorMessage = By.xpath("//*[@id=\"errBannerTitle\"]/span[2]/span");
    private final By SignInMessage = By.xpath("//h2[text()='You are signed in as a guest.']");
    private static final Logger LOGGER = LogManager.getLogger(SingIn.class);

    public SingIn(WebDriver driver) {
        super(driver);
    }

    public SingIn typeUserIdOrPhoneNumber(String value) {
        LOGGER.info("typing the user ID or phone number: " + value);
        ActOn.element(driver, UserIdField).setValue(value);
        return this;
    }
    public SingIn clickOnContinueButton() {
        LOGGER.debug("clicking on the sign in button");
        ActOn.element(driver, ContinueButton).click();
        return this;
    }
    public SingIn typePassword(String value) {
        LOGGER.info("typing the password: " + value);
        ActOn.element(driver, PasswordField).setValue(value);
        return this;
    }
    public SingIn clickOnSignInOrContinueButton() {
        LOGGER.debug("clicking on the sign in button");
        ActOn.element(driver, SignInButton).click();
        return this;
    }
    public SingIn clickOnRememberMyVerificationOption() {
        return this;
    }
    public SingIn clickOnVerifyNextTimeOption() {
        LOGGER.debug("clicking on the sign in button");
        try {
            ActOn.element(driver, VerifyNextTimeOption).click();
        } catch (NoSuchElementException e) {
            LOGGER.info("Verify Next Time option not found");
        }
        return this;
    }
    public SingIn validateErrorMessage() {
        AssertThat.elementAssertions(driver, ErrorMessage).elementIsDisplayed();
        LOGGER.info("User is failed to login");
        return this;
    }
    public SingIn getSignInMessage(){
        ActOn.element(driver,SignInMessage).getTextValue();
        LOGGER.info("user is signed in as a guest");
        return this;
    }
    public SingIn validateSignInMessage() {
        AssertThat.elementAssertions(driver, SignInMessage).elementIsDisplayed();
        LOGGER.info("User sign in as a guest");
        return this;
    }
}


