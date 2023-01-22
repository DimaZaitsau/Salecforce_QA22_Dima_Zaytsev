package modals;

import elements.Account.Dropdown;
import elements.Account.Input;
import elements.Account.Textarea;
import models.Account;
import org.openqa.selenium.WebDriver;

public class NewAccountModal extends BaseModal  {

    public void fillForm(Account account)   {
        new Input(driver, "Account Name").setValue(account.getAccountName());
        new Input(driver, "Phone").setValue(account.getPhone());
        new Input(driver, "Fax").setValue(account.getFax());
        new Input(driver, "Website").setValue(account.getWebsite());
        new Dropdown(driver, "Type").setDropdownOption(account.getType().getName());
        new Dropdown(driver, "Industry").setDropdownOption(account.getIndustry().getName());
        new Input(driver, "Employees").setValue(account.getEmployees());
        new Input(driver, "Annual Revenue").setValue(account.getAnnualRevenue());
        new Textarea(driver, "Description").setValue(account.getDescription());
        new Textarea(driver, "Billing Street").setValue(account.getBillingStreet());
        new Textarea(driver, "Shipping Street").setValue(account.getShippingStreet());
        new Input(driver, "Billing City").setAddressValue(account.getBillingCity());
        new Input(driver, "Billing State/Province").setAddressValue(account.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").setAddressValue(account.getBillingZip());
        new Input(driver, "Billing Country").setAddressValue(account.getBillingCountry());
        new Input(driver, "Shipping City").setAddressValue(account.getShippingCity());
        new Input(driver, "Shipping State/Province").setAddressValue(account.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").setAddressValue(account.getShippingZip());
        new Input(driver, "Shipping Country").setAddressValue(account.getShippingCountry());
    }

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }
}