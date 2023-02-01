package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseModal extends BasePage {

    protected By SAVE_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");
    private final static By CONVERT_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");
    private final static By GO_TO_LEAD_BUTTON = By.xpath("//button[text()='Go to Leads']");

    public BaseModal(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void clickConvertButton()    {
        driver.findElement(CONVERT_BUTTON).click();
    }
    public void clickGoToLeadButton()   {
        driver.findElement(GO_TO_LEAD_BUTTON).click();
    }

    public void waitGoToLeadButtonIsDisplay()   {
        waitForElementDisplayed(GO_TO_LEAD_BUTTON);
    }

    public void waitSaveButtonIsDisplay() {
        waitForElementDisplayed(SAVE_BUTTON);
    }

    public void waitConvertButtonIsDisplay()    {
        waitForElementDisplayed(CONVERT_BUTTON);
    }
}