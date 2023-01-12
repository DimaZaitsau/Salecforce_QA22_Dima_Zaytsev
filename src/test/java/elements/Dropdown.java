package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends BaseElement   {

    private final static String DROPDOWN_LOCATOR = "//label[text() = '%s']//ancestor::span//button";
    private final static String OPEN_DROPDOWN_LOCATOR = "//lightning-base-combobox[@class='slds-combobox_container']" +
            "//span[text() = '%s']";

    public Dropdown(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setDropdownValue(String optionName)  {
        WebElement dropdownButton = driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, this.label)));
        scrollIntoView(dropdownButton);
        dropdownButton.click();
        WebElement openDropdown = driver.findElement(By.xpath(String.format(OPEN_DROPDOWN_LOCATOR, optionName)));
        openDropdown.click();
    }
}