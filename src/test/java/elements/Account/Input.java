package elements.Account;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement {

    private final static String INPUT_LOCATOR = "//span[text()='%s']/ancestor::label/ancestor" +
            "::div[@class='slds-form-element__control']//input";
    private final static String INPUT_ADDRESS_LOCATOR = "//span[text()='%s']/ancestor" +
            "::div[@class='uiInput uiInputText uiInput--default uiInput--input']//input";

    public Input(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValue(String value)  {
        WebElement input = driver.findElement(By.xpath(String.format(INPUT_LOCATOR, this.label)));
        scrollIntoView(input);
        input.sendKeys(value);
    }

    public void setAddressValue(String value)   {
        WebElement inputAddress = driver.findElement(By.xpath(String.format(INPUT_ADDRESS_LOCATOR, this.label)));
        scrollIntoView(inputAddress);
        inputAddress.sendKeys(value);
    }
}