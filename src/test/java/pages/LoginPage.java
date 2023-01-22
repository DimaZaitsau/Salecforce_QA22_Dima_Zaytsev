package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final static By USER_NAME_INPUT = By.id("username");
    private final static By PASSWORD_INPUT = By.id("password");
    private final static By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void setUsername(String username)   {
        driver.findElement(USER_NAME_INPUT).sendKeys(username);
    }

    public void setPassword(String password)    {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void waitLoginButtonIsDisplay()  {
        waitForElementDisplayed(LOGIN_BUTTON);
    }
}