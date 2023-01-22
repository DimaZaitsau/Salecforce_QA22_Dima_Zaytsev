package tests;

import com.github.javafaker.Faker;
import enums.LeadSource;
import enums.Salutation;
import models.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsTest extends BaseTest  {

    @Test
    public void positiveContactsTest()  {
        Faker faker = new Faker();
        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openContactsTub();
        entityBasePage.waitSendListEmailButtonIsDisplay();
        entityBasePage.clickNewButton();
        baseModal.waitSaveButtonIsDisplay();

        Contact contact = Contact.builder().setSalutation(Salutation.MR).setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName()).setPhone(faker.phoneNumber().cellPhone())
                .setMobile(faker.phoneNumber().cellPhone()).setAccountName("Emiko Mann").setTitle("qwerty")
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
        Assert.assertEquals(contactDetailsPage.getContactDetails(), contact);
    }
}