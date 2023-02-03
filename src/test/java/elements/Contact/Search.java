package elements.Contact;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search extends BaseElement {

    private final static String INPUT_SEARCH = "//label[text()='%s']//ancestor::lightning-grouped-combobox" +
            "//lightning-base-combobox//input";
    private final static String ACCOUNT_NAME_SEARCH = "//span[@title = 'QA22']";

    public Search(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setSearchValue()  {
        WebElement dropdownButton = driver.findElement(By.xpath(String.format(INPUT_SEARCH, this.label)));
        scrollIntoView(dropdownButton);
        dropdownButton.click();
        WebElement openDropdown = driver.findElement(By.xpath(String.format(ACCOUNT_NAME_SEARCH)));
        openDropdown.click();
    }
}