package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntityBasePage extends HomePage    {

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title = New]");

    public void clickNewButton()    {
        driver.findElement(NEW_BUTTON).click();
    }

    public void waitNewButtonIsDisplay()    {
        waitForElementDisplayed(NEW_BUTTON);
    }
    public EntityBasePage(WebDriver driver) {
        super(driver);
    }
}