package pages;

import elements.RecordLayoutItem;
import enums.LeadSource;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage    {

    private final static By CHANGE_OWNER_BUTTON = By.xpath("//button[text()='Change Owner']");

    public Contact getContactDetails()  {
        Contact.ContactBuilder contact = Contact.builder()
                .setFullName(new RecordLayoutItem(driver, "Name").getValue())
                .setAccountName(new RecordLayoutItem(driver, "Account Name").getValue())
                .setTitle(new RecordLayoutItem(driver, "Title").getValue())
                .setPhone(new RecordLayoutItem(driver, "Phone").getValue())
                .setMobile(new RecordLayoutItem(driver, "Mobile").getValue())
                .setEmail(new RecordLayoutItem(driver, "Email").getValue())
                .setMailingAddress(new RecordLayoutItem(driver, "Mailing Address").getValue())
                .setOtherAddress(new RecordLayoutItem(driver, "Other Address").getValue())
                .setFax(new RecordLayoutItem(driver, "Fax").getValue())
                .setDepartment(new RecordLayoutItem(driver, "Department").getValue())
                .setHomePhone(new RecordLayoutItem(driver, "Home Phone").getValue())
                .setLeadSource(LeadSource.fromString(new RecordLayoutItem(driver, "Lead Source").getValue()))
                .setOtherPhone(new RecordLayoutItem(driver, "Other Phone").getValue())
                .setAsstPhone(new RecordLayoutItem(driver, "Asst. Phone").getValue())
                .setAssistant(new RecordLayoutItem(driver, "Assistant").getValue())
                .setBirthdate(new RecordLayoutItem(driver, "Birthdate").getValue())
                .setDescription(new RecordLayoutItem(driver, "Description").getValue());
        return contact.build();
    }

    public void waitChangeOwnerButtonIsDisplay()    {
        waitForElementDisplayed(CHANGE_OWNER_BUTTON);
    }
    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }
}