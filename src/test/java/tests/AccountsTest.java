package tests;

import com.github.javafaker.Faker;
import enums.Account.Type;
import enums.Industry;
import models.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test
    public void positiveAccountsTest() {

        Faker faker = new Faker();
        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openAccountsTub();
        accountDetailsPage.clickNewButton();
        baseModal.waitSaveButtonForAccountModalPresent();

        Account account = Account.builder().setAccountName(faker.name().fullName()).setPhone(String.valueOf(faker.phoneNumber().cellPhone()))
                .setFax(String.valueOf(8256862)).setWebsite(faker.internet().domainName())
                .setType(Type.ANALYST).setIndustry(Industry.BANKING).setEmployees(String.valueOf(4))
                .setAnnualRevenue("$5,000").setDescription("HelloWorld").setBillingStreet(faker.address().streetName())
                .setBillingCity(faker.address().city()).setBillingZip(String.valueOf(faker.address().zipCode()))
                .setBillingState(faker.address().state()).setBillingCountry(faker.address().country())
                .setShippingStreet(faker.address().streetName()).setShippingCity(faker.address().city())
                .setShippingZip(faker.address().zipCode()).setShippingState(faker.address().state())
                .setShippingCountry(faker.address().country()).build();

        newAccountModal.fillForm(account);
        baseModal.clickSaveButtonForAccountModal();
        accountDetailsPage.waitAddButtonIsDisplay();
        Assert.assertEquals(accountDetailsPage.getAccountDetails(), account);
    }
}