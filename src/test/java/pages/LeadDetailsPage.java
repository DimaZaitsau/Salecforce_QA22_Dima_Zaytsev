package pages;

import elements.RecordLayoutItem;
import enums.*;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage   {

    private final static By MARK_STATUS_AS_COMPLETE_BUTTON = By.xpath("//span[@class='uiOutputText']/ancestor::button");

    public Lead getLeadDetails()    {
        Lead.LeadBuilder lead = new Lead.LeadBuilder(new RecordLayoutItem(driver, "Name").getValue(),
                new RecordLayoutItem(driver, "Company").getValue(),
                LeadStatus.fromString(new RecordLayoutItem(driver, "Lead Status").getValue()))
                .setEmail(new RecordLayoutItem(driver, "Email").getValue())
                .setTitle(new RecordLayoutItem(driver, "Title").getValue())
                .setWebsite(new RecordLayoutItem(driver, "Website").getValue())
                .setNumberOfEmployees(new RecordLayoutItem(driver, "No. of Employees").getValue())
                .setPhone(new RecordLayoutItem(driver, "Phone").getValue())
                .setAddress(new RecordLayoutItem(driver, "Address").getValue())
                .setAnnualRevenue(new RecordLayoutItem(driver, "Annual Revenue").getValue())
                .setDescription(new RecordLayoutItem(driver, "Description").getValue())
                .setRating(Rating.fromString(new RecordLayoutItem(driver, "Rating").getValue()))
                .setLeadSource(LeadSource.fromString(new RecordLayoutItem(driver, "Lead Source").getValue()))
                .setIndustry(Industry.fromString(new RecordLayoutItem(driver, "Industry").getValue()));
        return lead.build();
    }

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickMarkStatusAsCompleteButton() {
        scrollIntoView(driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON));
        jsClick(driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON));
    }

    public void waitMarkStatusAsCompleteButtonIsDisplay()   {
        waitForElementDisplayed(MARK_STATUS_AS_COMPLETE_BUTTON);
    }
}