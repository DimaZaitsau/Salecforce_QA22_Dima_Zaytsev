package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage  {

    private final static String CONTACTS_NAME_LOCATOR = "//span/a[text()='%s']";

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isContactNamePresent(String name)  {
        try {
            driver.findElement(By.xpath(String.format(CONTACTS_NAME_LOCATOR, name)));
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }
}