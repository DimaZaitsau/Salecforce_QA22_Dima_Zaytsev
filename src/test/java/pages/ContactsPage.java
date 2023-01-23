package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage  {

    private final static String CONTACTS_PHONE_LOCATOR = "//span[@title='Phone']//ancestor::table//tbody//td//lightning-icon" +
            "//ancestor::a/span";
    private final static By UPDATE_TEXT = By.xpath("//span[text()='Updated a few seconds ago']");

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isContactNamePresent()  {
        try {
            driver.findElement(By.xpath(String.format(CONTACTS_PHONE_LOCATOR)));
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }

    public String getContactPhone()   {
        return driver.findElement(By.xpath(CONTACTS_PHONE_LOCATOR)).getText();
    }

    public void waitUpdateTextInDisplay()   {
        waitForElementDisplayed(UPDATE_TEXT);
    }
}