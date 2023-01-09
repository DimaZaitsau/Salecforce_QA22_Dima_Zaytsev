package modals;

import elements.Dropdown;
import elements.Input;
import elements.Textarea;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal {

    public void fillForm(String firstName, String lastName, int phone, String company, String email, String title,
                         String website, String city, String state, int zipCode, String country,
                         int employees, String annualRevenue, String street, String description, String leadStatus,
                         String rating, String leadSource, String industry)  {

        new Input(driver, "firstName").setValue(firstName);
        new Input(driver, "lastName").setValue(lastName);
        new Input(driver, "Phone").setValue(String.valueOf(phone));
        new Input(driver, "Company").setValue(company);
        new Input(driver, "Email").setValue(email);
        new Input(driver, "Title").setValue(title);
        new Input(driver, "Website").setValue(website);
        new Input(driver, "city").setValue(city);
        new Input(driver, "province").setValue(state);
        new Input(driver, "postalCode").setValue(String.valueOf(zipCode));
        new Input(driver, "country").setValue(country);
        new Input(driver, "NumberOfEmployees").setValue(String.valueOf(employees));
        new Input(driver, "AnnualRevenue").setValue(String.valueOf(annualRevenue));
        new Textarea(driver, "Street").setTextareaText(street);
        new Textarea(driver, "Description").setTextareaText(description);
        new Dropdown(driver, "Lead Status").setDropdownValue(leadStatus);
        new Dropdown(driver, "Rating").setDropdownValue(rating);
        new Dropdown(driver, "Lead Source").setDropdownValue(leadSource);
        new Dropdown(driver, "Industry").setDropdownValue(industry);
    }

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
}