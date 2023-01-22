package models;

import enums.*;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder(setterPrefix = "set")
public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String title;
    private String description;
    private String mobile;
    private LeadSource leadSource;
    private Salutation salutation;
    private String mailingStreet;
    private String mailingCity;
    private String mailingState;
    private String mailingZip;
    private String mailingCountry;
    private String otherStreet;
    private String otherCity;
    private String otherState;
    private String otherZip;
    private String otherCountry;
    private String fax;
    private String department;
    private String homePhone;
    private String otherPhone;
    private String birthdate;
    private String asstPhone;
    private String assistant;
    private String mailingAddress;
    private String otherAddress;
    private String fullName;
    private String accountName;

    public Contact(ContactBuilder contactBuilder) {
        this.firstName = contactBuilder.firstName;
        this.lastName = contactBuilder.lastName;
        this.phone = contactBuilder.phone;
        this.email = contactBuilder.email;
        this.title = contactBuilder.title;
        this.description = contactBuilder.description;
        this.mobile = contactBuilder.mobile;
        this.leadSource = contactBuilder.leadSource;
        this.salutation = contactBuilder.salutation;
        this.mailingStreet = contactBuilder.mailingStreet;
        this.mailingCity = contactBuilder.mailingCity;
        this.mailingState = contactBuilder.mailingState;
        this.mailingZip = contactBuilder.mailingZip;
        this.mailingCountry = contactBuilder.mailingCountry;
        this.otherStreet = contactBuilder.otherStreet;
        this.otherCity = contactBuilder.otherCity;
        this.otherState = contactBuilder.otherState;
        this.otherZip = contactBuilder.otherZip;
        this.otherCountry = contactBuilder.otherCountry;
        this.fax = contactBuilder.fax;
        this.department = contactBuilder.department;
        this.homePhone = contactBuilder.homePhone;
        this.otherPhone = contactBuilder.otherPhone;
        this.birthdate = contactBuilder.birthdate;
        this.asstPhone = contactBuilder.asstPhone;
        this.assistant = contactBuilder.assistant;
        this.mailingAddress = contactBuilder.mailingAddress;
        this.otherAddress = contactBuilder.otherAddress;
        this.fullName = contactBuilder.fullName;
        this.accountName = contactBuilder.accountName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contacts = (Contact) o;
        return Objects.equals(phone, contacts.phone) && Objects.equals(email, contacts.email)
                && Objects.equals(title, contacts.title) && Objects.equals(description, contacts.description)
                && Objects.equals(mobile, contacts.mobile) && leadSource == contacts.leadSource
                && Objects.equals(fax, contacts.fax) && Objects.equals(department, contacts.department)
                && Objects.equals(homePhone, contacts.homePhone) && Objects.equals(otherPhone, contacts.otherPhone)
                && Objects.equals(birthdate, contacts.birthdate) && Objects.equals(asstPhone, contacts.asstPhone)
                && Objects.equals(assistant, contacts.assistant) && Objects.equals(mailingAddress, contacts.mailingAddress)
                && Objects.equals(otherAddress, contacts.otherAddress) && Objects.equals(fullName, contacts.fullName)
                && Objects.equals(accountName, contacts.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, email, title, description, mobile, leadSource, fax, department, homePhone, otherPhone,
                birthdate, asstPhone, assistant, mailingAddress, otherAddress, fullName, accountName);
    }

    @Override
    public String toString() {
        return "Contacts{" +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", mobile='" + mobile + '\'' +
                ", leadSource=" + leadSource +
                ", fax='" + fax + '\'' +
                ", department='" + department + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", otherPhone='" + otherPhone + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", asstPhone='" + asstPhone + '\'' +
                ", assistant='" + assistant + '\'' +
                ", mailingAddress='" + mailingAddress + '\'' +
                ", otherAddress='" + otherAddress + '\'' +
                ", fullName='" + fullName + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }

    public static class ContactBuilder {
        public Contact build() {
            if (this.mailingAddress == null && this.otherAddress == null && this.fullName == null) {
                String mailingStreet = Objects.isNull(this.mailingStreet) ? "" : this.mailingStreet;
                String mailingCity = Objects.isNull(this.mailingCity) ? "" : this.mailingCity;
                String mailingState = Objects.isNull(this.mailingState) ? "" : this.mailingState;
                String mailingZip = Objects.isNull(this.mailingZip) ? "" : this.mailingZip;
                String mailingCountry = Objects.isNull(this.mailingCountry) ? "" : this.mailingCountry;
                String otherStreet = Objects.isNull(this.otherStreet) ? "" : this.otherStreet;
                String otherCity = Objects.isNull(this.otherCity) ? "" : this.otherCity;
                String otherState = Objects.isNull(this.otherState) ? "" : this.otherState;
                String otherZip = Objects.isNull(this.otherZip) ? "" : this.otherZip;
                String otherCountry = Objects.isNull(this.otherCountry) ? "" : this.otherCountry;
                String salutation = Objects.isNull(this.salutation) ? "" : this.salutation.getName();
                String firstName = Objects.isNull(this.firstName) ? "" : this.firstName;
                String lastName = Objects.isNull(this.lastName) ? "" : this.lastName;
                String accountName = Objects.isNull(this.accountName) ? "" : this.accountName;
                this.mailingAddress = (mailingStreet + "\n" + mailingCity + ", " + mailingState + " " + mailingZip + "\n" +
                        mailingCountry).trim();
                this.otherAddress = (otherStreet + "\n" + otherCity + ", " + otherState + " " + otherZip + "\n" +
                        otherCountry).trim();
                this.fullName = (salutation + " " + firstName + " " + lastName).trim();
                this.accountName = ("Open " + accountName + " Preview");
                return new Contact(this);
            }
            return new Contact(this);
        }
    }
}