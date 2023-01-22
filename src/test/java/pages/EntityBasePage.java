package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntityBasePage extends HomePage    {

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title = New]");
    private final static By SEND_LIST_EMAIL_BUTTON = By.cssSelector("div.active a[title = 'Send List Email']");

    public void clickNewButton()    {
        driver.findElement(NEW_BUTTON).click();
    }

    public void waitNewButtonIsDisplay()    {
        waitForElementDisplayed(NEW_BUTTON);
    }

    public void waitSendListEmailButtonIsDisplay()  {
        waitForElementDisplayed(SEND_LIST_EMAIL_BUTTON);
    }

    public EntityBasePage(WebDriver driver) {
        super(driver);
    }
}