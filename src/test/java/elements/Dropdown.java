package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends BaseElement   {

    private String label;
    private final static String DROPDOWN_LOCATOR = "//label[text() = '%s']//ancestor::span//button";

    public Dropdown(WebDriver driver, String label) {
        super(driver);
        this.label = label;
    }

    public void setDropdownValue(String label)  {
        WebElement dropdownButton = driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, this.label)));
        scrollIntoView(dropdownButton);
        dropdownButton.click();
    }
}