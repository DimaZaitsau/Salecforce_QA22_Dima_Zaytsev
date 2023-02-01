package tests;

import enums.Account.Type;
import enums.Industry;
import enums.LeadSource;
import enums.Salutation;
import models.Account;
import models.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactsTest extends BaseTest  {

    @BeforeMethod
    public void createAccount() {
        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        homePage.openAccountsTub();
        accountDetailsPage.clickNewButton();
        newAccountModal.waitSaveButtonIsDisplay();
        Account account = Account.builder().setAccountName("QA22").setPhone("").setFax("").setWebsite("").setType(Type.ANALYST)
                .setIndustry(Industry.BANKING).setEmployees("").setAnnualRevenue("").setDescription("").setBillingStreet("")
                .setBillingCity("").setBillingZip("").setBillingState("").setBillingCountry("").setShippingStreet("")
                .setShippingCity("").setShippingZip("").setShippingState("").setShippingCountry("").build();
        newAccountModal.fillForm(account);
        newAccountModal.clickSaveButton();
        accountDetailsPage.waitAddButtonIsDisplay();
    }

    @Test
    public void positiveContactsTest() {

        homePage.openContactsTub();
        entityBasePage.waitSendListEmailButtonIsDisplay();
        entityBasePage.clickNewButton();
        baseModal.waitSaveButtonIsDisplay();

        Contact contact = Contact.builder().setSalutation(Salutation.MR).setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName()).setPhone(String.valueOf(291234567))
                .setMobile(faker.phoneNumber().cellPhone()).setAccountName("QA22").setTitle("qwerty")
                .setEmail(faker.internet().emailAddress()).setMailingStreet(faker.address().streetName())
                .setMailingCity(faker.address().city()).setMailingState(faker.address().state())
                .setMailingZip(String.valueOf(58237562)).setMailingCountry(faker.address().country())
                .setOtherStreet(faker.address().streetName()).setOtherCity(faker.address().city())
                .setOtherState(faker.address().state()).setOtherZip(String.valueOf(783265923))
                .setOtherCountry(faker.address().country()).setFax(String.valueOf(3517369)).setDepartment("Department")
                .setHomePhone(faker.phoneNumber().cellPhone()).setLeadSource(LeadSource.EMPLOYEE_REFERRAL)
                .setOtherPhone(faker.phoneNumber().cellPhone()).setBirthdate("11/1/2000")
                .setAsstPhone(faker.phoneNumber().cellPhone()).setAssistant("qwerty").setDescription("HelloWorld").build();

        newContactModal.fillForm(contact);
        baseModal.clickSaveButton();
        contactDetailsPage.waitChangeOwnerButtonIsDisplay();
        homePage.browserRefresh();
        contactDetailsPage.waitChangeOwnerButtonIsDisplay();
        Assert.assertEquals(contactDetailsPage.getContactDetails(), contact);
    }
}