package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage  {

    private final static By USER_ICON = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title = 'Leads']");
    private final static By ACCOUNTS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title = 'Accounts']");
    private final static By CONTACTS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title = 'Contacts']");
    private final static By LOGOUT_BUTTON = By.xpath("//a[text()='Log Out']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openLeadsTub()  {
        jsClick(driver.findElement(LEADS_MENU_TAB_LOCATOR));
    }

    public void openAccountsTub()  {
        jsClick(driver.findElement(ACCOUNTS_MENU_TAB_LOCATOR));
    }

    public void openContactsTub()   {
        jsClick(driver.findElement(CONTACTS_MENU_TAB_LOCATOR));
    }

    public void waitForUserAvatarIsDisplayed()  {
        waitForElementDisplayed(USER_ICON);
    }

    public void logout()    {
        driver.findElement(USER_ICON).click();
        driver.findElement(LOGOUT_BUTTON).click();
    }

    public void browserRefresh()    {
        driver.navigate().refresh();
    }

    public boolean isUserIconDisplayed()  {
        return driver.findElement(USER_ICON).isDisplayed();
    }
}