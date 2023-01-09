package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeadsTests extends BaseTest    {

    @Test
    public void positiveLeadsTest() {

        String firstName = "Dima";
        String lastName = "DimaAA";
        int phoneNumber = 13876365;
        String companyName = "AQA22";
        String email = "dima@gmail.com";
        String title = "qwerty";
        String website = "osdvbo.com";
        String city = "Minsk";
        String state = "minsk";
        int zipCode = 12345;
        String country = "Belarus";
        int employees = 3;
        String annualRevenue = "$5,000";
        String street = "Pushkin";
        String description = "Hello world";
        String leadStatus = "Contacted";
        String rating = "Hot";
        String leadSource = "In-Store";
        String industry = "Banking";

        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openLeadsTub();
        leadsPage.clickNewButton();
        newLeadModal.fillForm("Dima", "DimaAA", 13876365, "AQA22", "dima@gmail.com",
                "qwerty", "osdvbo.com", "Minsk", "minsk", 12345, "Belarus",
                3, "5000", "Pushkin", "Hello world", "Contacted", "Hot",
                "In-Store", "Banking");
        baseModal.clickSaveButton();
        Assert.assertTrue(leadDetailsPage.isMarkStatusAsCompleteButtonPresent());
        Assert.assertEquals(leadDetailsPage.getDescription(), description);
        Assert.assertEquals(leadDetailsPage.getName(), firstName + " " + lastName);
        Assert.assertEquals(leadDetailsPage.getCompany(), companyName);
        Assert.assertEquals(leadDetailsPage.getEmail(), email);
        Assert.assertEquals(leadDetailsPage.getTitle(), title);
        Assert.assertEquals(leadDetailsPage.getPhone(), String.valueOf(phoneNumber));
        Assert.assertEquals(leadDetailsPage.getEmployees(), String.valueOf(employees));
        Assert.assertEquals(leadDetailsPage.getWebsite(), website);
        Assert.assertEquals(leadDetailsPage.getAnnualRevenue(), annualRevenue);
        Assert.assertEquals(leadDetailsPage.getAddress(), street + "\n" + city + ", " + state + " " + zipCode + "\n" + country);
        Assert.assertEquals(leadDetailsPage.getLeadStatus(), leadStatus);
        Assert.assertEquals(leadDetailsPage.getRating(), rating);
        Assert.assertEquals(leadDetailsPage.getLeadSource(), leadSource);
        Assert.assertEquals(leadDetailsPage.getIndustry(), industry);
    }
}