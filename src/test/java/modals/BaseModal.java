package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseModal extends BasePage {

    private final static By SAVE_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");
    private final static By SAVE_BUTTON_FOR_ACCOUNT_MODAL = By.xpath("//div[@class='button-container-inner slds-float_right']//span[text()='Save']");
    private final static By SAVE_AND_NUW_BUTTON = By.name("SaveAndNew");
    private final static By CANCEL_BUTTON = By.name("CancelEdit");
    private final static By CONVERT_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");
    private final static By GO_TO_LEAD_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");

    public BaseModal(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton()   {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void clickSAveAndNuwButton() {
        driver.findElement(SAVE_AND_NUW_BUTTON).click();
    }

    public void clickCancelButton() {
        driver.findElement(CANCEL_BUTTON).click();
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

    public void waitSaveButtonForAccountModalPresent()  {
        waitForElementDisplayed(SAVE_BUTTON_FOR_ACCOUNT_MODAL);
    }

    public void clickSaveButtonForAccountModal()    {
        driver.findElement(SAVE_BUTTON_FOR_ACCOUNT_MODAL).click();
    }

    public void waitConvertButtonIsDisplay()    {
        waitForElementDisplayed(CONVERT_BUTTON);
    }
}