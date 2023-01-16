package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test
    public void positiveAccountsTest() throws InterruptedException {

        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openAccountsTub();
        accountPage.clickNewButton();

        Thread.sleep(5000);

    }
}
