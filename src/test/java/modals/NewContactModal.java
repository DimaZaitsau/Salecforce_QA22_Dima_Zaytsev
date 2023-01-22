package modals;

import elements.Contact.Input;
import elements.Contact.Search;
import elements.Dropdown;
import elements.Textarea;
import models.Contact;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BaseModal  {

    public void fillForm(Contact contact)  {

        new Dropdown(driver, "Salutation").setDropdownValue(contact.getSalutation().getName());
        new Input(driver, "First Name").setValue(contact.getFirstName());
        new Input(driver, "Last Name").setValue(contact.getLastName());
        new Input(driver, "Phone").setValue(contact.getPhone());
        new Input(driver, "Mobile").setValue(contact.getMobile());
        new Search(driver, "Account Name").setSearchValue();
        new Input(driver, "Title").setValue(contact.getTitle());
        new Input(driver, "Email").setValue(contact.getEmail());
        new Textarea(driver, "Mailing Street").setTextareaText(contact.getMailingStreet());
        new Textarea(driver, "Other Street").setTextareaText(contact.getOtherStreet());
        new Input(driver, "Mailing City").setValue(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").setValue(contact.getMailingState());
        new Input(driver, "Mailing Zip/Postal Code").setValue(contact.getMailingZip());
        new Input(driver, "Mailing Country").setValue(contact.getMailingCountry());
        new Input(driver, "Other City").setValue(contact.getOtherCity());
        new Input(driver, "Other State/Province").setValue(contact.getOtherState());
        new Input(driver, "Other Zip/Postal Code").setValue(contact.getOtherZip());
        new Input(driver, "Other Country").setValue(contact.getOtherCountry());
        new Input(driver, "Fax").setValue(contact.getFax());
        new Input(driver, "Department").setValue(contact.getDepartment());
        new Input(driver, "Home Phone").setValue(contact.getHomePhone());
        new Dropdown(driver, "Lead Source").setDropdownValue(contact.getLeadSource().getName());
        new Input(driver, "Other Phone").setValue(contact.getOtherPhone());
        new Input(driver, "Birthdate").setValue(contact.getBirthdate());
        new Input(driver, "Asst. Phone").setValue(contact.getAsstPhone());
        new Input(driver, "Assistant").setValue(contact.getAssistant());
        new Textarea(driver, "Description").setTextareaText(contact.getDescription());
    }

    public NewContactModal(WebDriver driver) {
        super(driver);
    }
}