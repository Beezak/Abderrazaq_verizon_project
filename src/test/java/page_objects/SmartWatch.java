package page_objects;

import commond_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartWatch {
    private final By WatchesButton= By.xpath("//*[@id=\"gear-tilelets\"]/div/div/a[2]/div/picture");
    private final By BrandButton= By.xpath("//*[@id=\"accordian-content\"]/div/div/div[1]/div[2]/div[1]/button/span");
    private final By AppleButton= By.xpath("//input[@value='Apple']");
    private final By BrandTypeButton= By.xpath("//*[@id=\"accordian-content\"]/div/div/div[5]/div[2]/div[1]/button/div/p/span");
    private final By SportsBrandButton = By.xpath("//input[@value='Sport Band']");
    private final By ColorButton= By.xpath("//*[@id=\"accordian-content\"]/div/div/div[10]/div[2]/div[1]/button/div/p");
    private final By BlueButton= By.xpath("//input[@value='Blue']");
    private final By ViewResultsButton= By.xpath("//*[@id=\"buttonWrapper\"]/button[1]");
    public WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(SmartWatch.class);
    public SmartWatch(WebDriver driver){
        this.driver = driver;
    }
    public SmartWatch clickingOnWatchesButton(){
        ActOn.element(driver, WatchesButton).click();
        LOGGER.debug("clicking on watches button");
        return this;
    }
    public SmartWatch clickingOnBrandButton(){
        ActOn.element(driver, BrandButton).click();
        LOGGER.debug("clicking on brand button");
        return this;
    }
    public SmartWatch clickingOnAppleButton(){
        ActOn.element(driver, AppleButton).click();
        LOGGER.debug("clicking on apple button");
        return this;
    }
    public SmartWatch clickingOnBrandTypeButton(){
        ActOn.element(driver, BrandTypeButton).click();
        LOGGER.debug("clicking on brand type button");
        return this;
    }
    public SmartWatch clickingOnSportsButton(){
        ActOn.element(driver, SportsBrandButton).click();
        LOGGER.debug("clicking on sports button");
        return this;
    }
    public SmartWatch clickingOnColorButton(){
        ActOn.element(driver, ColorButton).click();
        LOGGER.debug("clicking on color button");
        return this;
    }
    public SmartWatch clickingOnBlueButton(){
        ActOn.element(driver, BlueButton).click();
        LOGGER.debug("clicking on Blue button");
        return this;
    }
    public SmartWatch clickingOnViewResultsButton(){
        ActOn.element(driver, ViewResultsButton).click();
        LOGGER.debug("clicking on view results button");
        return this;
    }
}