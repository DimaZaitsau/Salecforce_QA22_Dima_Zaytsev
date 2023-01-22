package tests;

import com.github.javafaker.Faker;
import enums.*;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeadsTests extends BaseTest    {

    @AfterMethod(alwaysRun = true)
    public void logout()    {
        homePage.logout();
        loginPage.waitLoginButtonIsDisplay();
    }

    @Test(dataProvider = "LeadData")
    public void positiveLeadsTest(Lead lead) {

        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openLeadsTub();
        leadsPage.clickNewButton();
        baseModal.waitSaveButtonIsDisplay();
        newLeadModal.fillForm(lead);
        baseModal.clickSaveButton();
        leadDetailsPage.waitMarkStatusAsCompleteButtonIsDisplay();
        Assert.assertEquals(leadDetailsPage.getLeadDetails(), lead);
        leadDetailsPage.clickMarkStatusAsCompleteButton();
        baseModal.waitConvertButtonIsDisplay();
        baseModal.clickConvertButton();
        baseModal.waitGoToLeadButtonIsDisplay();
        baseModal.clickGoToLeadButton();
        entityBasePage.waitNewButtonIsDisplay();
        homePage.openContactsTub();
        contactsPage.isContactNamePresent(lead.getPhone());
    }

    @DataProvider(name = "LeadData")
    public Object[][] testLeadData()   {
        Faker faker = new Faker();
        return new Lead[][]  {
                {new Lead.LeadBuilder
                        ("Dima", LeadStatus.UNQUALIFIED, faker.company().name()).setSalutation(Salutation.MR)
                        .setFirstName(faker.name().firstName()).setPhone(String.valueOf(faker.phoneNumber().phoneNumber()))
                        .setEmail("dima@gmail.com").setTitle("qwerty").setWebsite(faker.internet().domainName())
                        .setCity(faker.address().city()).setProvince(faker.address().state()).setPostalCode(String.valueOf(12345))
                        .setCountry(faker.address().country()).setNumberOfEmployees(String.valueOf(3)).setAnnualRevenue("$5,000")
                        .setStreet(faker.address().streetName()).setDescription("Hello world").setRating(Rating.HOT)
                        .setLeadSource(LeadSource.IN_STORE).setIndustry(Industry.BANKING).build()},

                {new Lead.LeadBuilder
                        ("Petya", LeadStatus.UNQUALIFIED, faker.company().name()).setSalutation(Salutation.MS)
                        .setFirstName("").setPhone(String.valueOf(faker.phoneNumber().phoneNumber()))
                        .setEmail("dima@gmail.com").setTitle("qwerty").setWebsite(faker.internet().domainName())
                        .setCity(faker.address().city()).setProvince(faker.address().state()).setPostalCode(String.valueOf(12345))
                        .setCountry(faker.address().country()).setNumberOfEmployees(String.valueOf(3)).setAnnualRevenue("$5,000")
                        .setStreet(faker.address().streetName()).setDescription("Hello world").setRating(Rating.HOT)
                        .setLeadSource(LeadSource.IN_STORE).setIndustry(Industry.BANKING).build()},

                {new Lead.LeadBuilder
                        ("Tolik", LeadStatus.UNQUALIFIED, faker.company().name()).setSalutation(Salutation.NONE)
                        .setFirstName(faker.name().firstName()).setPhone(String.valueOf(faker.phoneNumber().phoneNumber()))
                        .setEmail("dima@gmail.com").setTitle("qwerty").setWebsite(faker.internet().domainName())
                        .setCity(faker.address().city()).setProvince(faker.address().state()).setPostalCode(String.valueOf(12345))
                        .setCountry(faker.address().country()).setNumberOfEmployees(String.valueOf(3)).setAnnualRevenue("$5,000")
                        .setStreet(faker.address().streetName()).setDescription("Hello world").setRating(Rating.HOT)
                        .setLeadSource(LeadSource.IN_STORE).setIndustry(Industry.BANKING).build()},

                {new Lead.LeadBuilder
                        ("Nikita", LeadStatus.UNQUALIFIED, faker.company().name()).setSalutation(Salutation.NONE)
                        .setFirstName("").setPhone(String.valueOf(faker.phoneNumber().phoneNumber()))
                        .setEmail("dima@gmail.com").setTitle("qwerty").setWebsite(faker.internet().domainName())
                        .setCity(faker.address().city()).setProvince(faker.address().state()).setPostalCode(String.valueOf(12345))
                        .setCountry(faker.address().country()).setNumberOfEmployees(String.valueOf(3)).setAnnualRevenue("$5,000")
                        .setStreet(faker.address().streetName()).setDescription("Hello world").setRating(Rating.HOT)
                        .setLeadSource(LeadSource.IN_STORE).setIndustry(Industry.BANKING).build()},
        };
    }
}