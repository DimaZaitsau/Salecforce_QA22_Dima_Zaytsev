package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage   {

    private final static By NAME = By.xpath("//slot[@name='outputField']/lightning-formatted-name");
    private final static By COMPANY = By.xpath("//span[text()='Company']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By EMAIL = By.xpath("//slot[@name='outputField']/emailui-formatted-email-lead");
    private final static By TITLE = By.xpath("//span[text()='Title']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By RATING = By.xpath("//span[text()='Rating']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By ADDRESS = By.xpath("//lightning-formatted-address/a");
    private final static By WEBSITE = By.xpath("//lightning-formatted-url/a");
    private final static By EMPLOYEES = By.xpath("//records-record-layout-item[@class='slds-form__item slds-no-space']//lightning-formatted-number");
    private final static By LEAD_SOURCE = By.xpath("//span[text()='Lead Source']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By ANNUAL_REVENUE = By.xpath("//span[text()='Annual Revenue']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By INDUSTRY = By.xpath("//span[text()='Industry']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By DESCRIPTION = By.xpath("//span[text()='Description']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By LEAD_STATUS = By.xpath("//span[text()='Lead Status']//ancestor::records-record-layout-item//lightning-formatted-text");
    private final static By PHONE = By.xpath("//div[@class='slds-form-element__control']//lightning-formatted-phone/a");

    private final static By MARK_STATUS_AS_COMPLETE_BUTTON = By.xpath("//span[@class='uiOutputText']");
    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getName() {
        return driver.findElement(NAME).getText();
    }

    public String getCompany() {
        return driver.findElement(COMPANY).getText();
    }

    public String getEmail() {
        return driver.findElement(EMAIL).getText();
    }

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    public String getRating() {
        return driver.findElement(RATING).getText();
    }

    public String getAddress() {
        return driver.findElement(ADDRESS).getText();
    }

    public String getWebsite() {
        return driver.findElement(WEBSITE).getText();
    }

    public String getEmployees() {
        return driver.findElement(EMPLOYEES).getText();
    }

    public String getLeadSource() {
        return driver.findElement(LEAD_SOURCE).getText();
    }

    public String getAnnualRevenue() {
        return driver.findElement(ANNUAL_REVENUE).getText();
    }

    public String getIndustry() {
        return driver.findElement(INDUSTRY).getText();
    }

    public String getDescription() {
        return driver.findElement(DESCRIPTION).getText();
    }

    public String getLeadStatus() {
        return driver.findElement(LEAD_STATUS).getText();
    }

    public String getPhone() {
        return driver.findElement(PHONE).getText();
    }

    public boolean isMarkStatusAsCompleteButtonPresent()    {
        try {
            driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }
}