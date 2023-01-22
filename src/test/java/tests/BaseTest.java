package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.BaseModal;
import modals.NewAccountModal;
import modals.NewContactModal;
import modals.NewLeadModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected final static String BASE_URL = "https://d2w00000oeovyean.lightning.force.com/";
    protected final static String USERNAME = "uyraboe-cz2j@force.com";
    protected final static String PASSWORD = "ksdgbsdFG465osn";

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected LeadDetailsPage leadDetailsPage;
    protected NewLeadModal newLeadModal;
    protected BaseModal baseModal;
    protected ContactsPage contactsPage;
    protected AccountDetailsPage accountDetailsPage;
    protected EntityBasePage entityBasePage;
    protected NewAccountModal newAccountModal;
    protected ContactDetailsPage contactDetailsPage;
    protected NewContactModal newContactModal;

    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--ignore-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        leadsPage = new LeadsPage(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        baseModal = new BaseModal(driver);
        contactsPage = new ContactsPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        entityBasePage = new EntityBasePage(driver);
        newAccountModal = new NewAccountModal(driver);
        contactDetailsPage = new ContactDetailsPage(driver);
        newContactModal = new NewContactModal(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        driver.get(BASE_URL);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}