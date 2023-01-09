package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Textarea extends BaseElement   {

    private String textareaName;
    private final static String TEXTAREA_LOCATOR = "//label[text() = '%s']//ancestor::lightning-textarea//textarea";

    public Textarea(WebDriver driver, String textareaName) {
        super(driver);
        this.textareaName = textareaName;
    }

    public void setTextareaText(String text)   {
        WebElement textarea = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR, this.textareaName)));
        scrollIntoView(textarea);
        textarea.sendKeys(text);
    }
}