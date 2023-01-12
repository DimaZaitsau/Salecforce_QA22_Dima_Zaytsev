package modals;

import elements.Dropdown;
import elements.Input;
import elements.Textarea;
import enums.*;
import models.Lead;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal {

    public void fillForm(Lead lead)  {

        new Input(driver, "firstName").setValue(lead.getFirstName());
        new Input(driver, "lastName").setValue(lead.getLastName());
        new Input(driver, "Phone").setValue(String.valueOf(lead.getPhone()));
        new Input(driver, "Company").setValue(lead.getCompany());
        new Input(driver, "Email").setValue(lead.getEmail());
        new Input(driver, "Title").setValue(lead.getTitle());
        new Input(driver, "Website").setValue(lead.getWebsite());
        new Input(driver, "city").setValue(lead.getCity());
        new Input(driver, "province").setValue(lead.getProvince());
        new Input(driver, "postalCode").setValue(String.valueOf(lead.getPostalCode()));
        new Input(driver, "country").setValue(lead.getCountry());
        new Input(driver, "NumberOfEmployees").setValue(String.valueOf(lead.getNumberOfEmployees()));
        new Input(driver, "AnnualRevenue").setValue(String.valueOf(lead.getAnnualRevenue()));
        new Textarea(driver, "Street").setTextareaText(lead.getStreet());
        new Textarea(driver, "Description").setTextareaText(lead.getDescription());
        new Dropdown(driver, "Lead Status").setDropdownValue(LeadStatus.CONTACTED.getName());
        new Dropdown(driver, "Rating").setDropdownValue(Rating.HOT.getName());
        new Dropdown(driver, "Lead Source").setDropdownValue(LeadSource.IN_STORE.getName());
        new Dropdown(driver, "Industry").setDropdownValue(Industry.BANKING.getName());
        new Dropdown(driver, "Salutation").setDropdownValue(Salutation.MR.getName());
    }

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
}