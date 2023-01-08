package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.BaseModal;
import modals.NewLeadModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected final static String BASE_URL = "https://tmsqa222.lightning.force.com/";
    protected final static String USERNAME = "dima-3tn7@force.com";
    protected final static String PASSWORD = "headway91qtms";

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected LeadDetailsPage leadDetailsPage;
    protected NewLeadModal newLeadModal;
    protected BaseModal baseModal;
    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--ignore-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        leadsPage = new LeadsPage(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        baseModal = new BaseModal(driver);
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