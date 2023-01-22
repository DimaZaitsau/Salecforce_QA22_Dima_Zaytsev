package elements.Account;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Textarea extends BaseElement {

    private final static String TEXTAREA_LOCATOR = "//span[text()='%s']//ancestor::" +
            "div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea']//textarea";

    public Textarea(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValue(String value)  {
        WebElement textarea = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR, this.label)));
        scrollIntoView(textarea);
        textarea.sendKeys(value);
    }
}