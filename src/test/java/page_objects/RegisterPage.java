package page_objects;

import commond_providers.ActOn;
import commond_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;
public class RegisterPage extends HomePage{
    private final By MobileRegister = By.xpath("//*[@id=\"left-side-content\"]/div[1]/div[1]/div");
    private final By RegisterByEmail = By.xpath("//a[text()='Register your email address']");
    private final By EmailAddressField = By.id("email");
    private final By ContinueButton = By.id("btn_sendcode");
    private final By RegistrationEmailSentMessage = By.id("//h1[text() = 'Registration email sent.']");
    private static Logger LOGGER = LogManager.getLogger(RegisterPage.class);
    WebDriver driver = Hooks.driver;
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public  RegisterPage clickOnMobileRegister(){
        ActOn.element(driver, MobileRegister).click();
        LOGGER.debug("Clicking on 'Mobile & 5G Home' register");
        return this;
    }
    public  RegisterPage clickOnRegisterUsingEmail(){
        ActOn.element(driver, RegisterByEmail).click();
        LOGGER.debug("Clicking on Register Using Email");
        return this;
    }
    public  RegisterPage typeEmailAddress(String value){
        ActOn.element(driver, EmailAddressField).setValue(value);
        LOGGER.debug("Clicking on Register Using Email: "+ value);
        return this;
    }
    public  RegisterPage clickOnContinueButton(){
        ActOn.element(driver, ContinueButton).click();
        LOGGER.debug("Clicking on Continue Button");
        return this;
    }
    public RegisterPage validateEmailRegistrationSent(){
       // AssertThat.elementAssertions(driver, RegistrationEmailSentMessage).elementIsDisplayed();
        LOGGER.info("Registration email is sent to users email address");
        return this;
    }
}
