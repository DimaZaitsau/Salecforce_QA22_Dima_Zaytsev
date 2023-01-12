package pages;

import elements.RecordLayoutItem;
import enums.*;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage   {

    private final static By MARK_STATUS_AS_COMPLETE_BUTTON = By.xpath("//span[@class='uiOutputText']");

    public Lead getLeadDetails()    {
        Lead.LeadBuilder lead = new Lead.LeadBuilder(new RecordLayoutItem(driver, "Name").getValue(),
                new RecordLayoutItem(driver, "Company").getValue());

        lead.setEmail(new RecordLayoutItem(driver, "Email").getValue());
        lead.setTitle(new RecordLayoutItem(driver, "Title").getValue());
        lead.setWebsite(new RecordLayoutItem(driver, "Website").getValue());
        lead.setNumberOfEmployees(new RecordLayoutItem(driver, "No. of Employees").getValue());

        lead.setAnnualRevenue(new RecordLayoutItem(driver, "Annual Revenue").getValue());
        lead.setDescription(new RecordLayoutItem(driver, "Description").getValue());

        lead.setRating(Rating.valueOf(Rating.fromString("Hot").getName()));
        lead.setLeadStatus(LeadStatus.valueOf(LeadStatus.fromString("Contacted").getName()));
        lead.setLeadSource(LeadSource.valueOf(LeadSource.fromString("In-Store").getName()));
        lead.setIndustry(Industry.valueOf(Industry.fromString("Banking").getName()));
        lead.setSalutation(Salutation.valueOf(Salutation.fromString("Mr.").getName()));
        return lead.build();
    }

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }


    public boolean isMarkStatusAsCompleteButtonPresent()    {
        try {
            driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }
}