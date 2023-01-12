package tests;

import enums.*;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeadsTests extends BaseTest    {

    @Test
    public void positiveLeadsTest() {

        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openLeadsTub();
        leadsPage.clickNewButton();

        Lead lead = new Lead.LeadBuilder("Dima DimaAA", "QA22").setSalutation(Salutation.MS).setFirstName("Dima")
                .setLastName("DimaAA").setLeadStatus(LeadStatus.CONTACTED).setPhone(String.valueOf(13876365)).
                setEmail("dima@gmail.com").setTitle("qwerty").setWebsite("osdvbo.com").setCity("Minsk").setProvince("minsk")
                .setPostalCode(String.valueOf(12345)).setCountry("Belarus").setNumberOfEmployees(String.valueOf(3))
                .setAnnualRevenue("$5,000").setStreet("Pushkin").setDescription("Hello world").setRating(Rating.HOT)
                .setLeadSource(LeadSource.IN_STORE).setIndustry(Industry.BANKING).build();

        newLeadModal.fillForm(lead);
        baseModal.clickSaveButton();
        Assert.assertTrue(leadDetailsPage.isMarkStatusAsCompleteButtonPresent());
        Assert.assertEquals(leadDetailsPage.getLeadDetails(), lead);
    }
}