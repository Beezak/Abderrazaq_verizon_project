package commond_providers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ScreenCapture;

import java.time.Duration;

public class ElementActions {
    private static final Logger LOGGER = LogManager.getLogger(ElementActions.class);
    private By locator;
    private WebDriver driver;
    public ElementActions(WebDriver driver, By locator){
        this.driver = driver;
        this.locator= locator;
    }
    public WebElement getElement() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = null;
        try {
            if (locator == null) {
                LOGGER.error("Locator is null");
            } else {
                element = driver.findElement(locator);
            }
        } catch (Exception e) {
            ScreenCapture.getScreenShot(driver);
            LOGGER.error("Element Exception for the locator: " + locator + " and exception is: " + e.getMessage());
        }
        return element;
    }

    public void click(){
        getElement().click();
        //return this;
    }
    public  void setValue(String value){
        getElement().clear();
        getElement().sendKeys(value);
       // return this;
    }
    public ElementActions selectValue(String value){
        Select select = new Select(getElement());
        select.selectByVisibleText(value);
        return this;
    }
    public ElementActions mouseHover(){
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement()).perform();
        return this;
    }
    public String getTextValue(){
        return getElement().getText();
    }

    public void clickOnElement(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
        } else {
            LOGGER.info("Element is not displayed");
        }
    }
}
