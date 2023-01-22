package pages;

import elements.RecordLayoutItem;
import enums.Account.Type;
import enums.Industry;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends EntityBasePage   {

    private final static By ADD_BUTTON = By.xpath("//span[text()='Add']");

    public Account getAccountDetails()  {
        Account.AccountBuilder account = Account.builder()
                .setAccountName(new  RecordLayoutItem(driver, "Account Name").getValue())
                .setPhone(new RecordLayoutItem(driver, "Phone").getValue())
                .setFax(new RecordLayoutItem(driver, "Fax").getValue())
                .setWebsite(new RecordLayoutItem(driver, "Website").getValue())
                .setType(Type.fromString(new RecordLayoutItem(driver, "Type").getValue()))
                .setIndustry(Industry.fromString(new RecordLayoutItem(driver, "Industry").getValue()))
                .setEmployees(new RecordLayoutItem(driver, "Employees").getValue())
                .setAnnualRevenue(new RecordLayoutItem(driver, "Annual Revenue").getValue())
                .setDescription(new RecordLayoutItem(driver, "Description").getValue())
                .setBillingAddress(new RecordLayoutItem(driver, "Billing Address").getValue())
                .setShippingAddress(new RecordLayoutItem(driver, "Shipping Address").getValue());
        return account.build();
    }

    public void waitAddButtonIsDisplay()    {
        waitForElementDisplayed(ADD_BUTTON);
    }

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }
}