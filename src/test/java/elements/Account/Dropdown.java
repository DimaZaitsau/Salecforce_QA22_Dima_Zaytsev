package elements.Account;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Dropdown extends BaseElement {

    private final static String DROPDOWN_LOCATOR = "//span[text()='%s']//ancestor::" +
            "div[@class='slds-grid slds-gutters_small full cols-2 forcePageBlockSectionRow']//a";


    public Dropdown(WebDriver driver, String label) {
        super(driver, label);
    }

    public void clickDropdownButton()   {
        WebElement dropdown = driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, this.label)));
        scrollIntoView(dropdown);
        dropdown.click();
    }
}
