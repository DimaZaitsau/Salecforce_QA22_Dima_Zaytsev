package models;

import enums.Account.Type;
import enums.Industry;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder(setterPrefix = "set")
public class Account {
    private String accountName;
    private String phone;
    private String fax;
    private String website;
    private String employees;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;
    private String shippingCountry;
    private Industry industry;
    private Type type;
    private String billingAddress;
    private String shippingAddress;

    public Account(AccountBuilder accountBuilder) {
        this.accountName = accountBuilder.accountName;
        this.phone = accountBuilder.phone;
        this.fax = accountBuilder.fax;
        this.website = accountBuilder.website;
        this.employees = accountBuilder.employees;
        this.annualRevenue = accountBuilder.annualRevenue;
        this.description = accountBuilder.description;
        this.billingStreet = accountBuilder.billingStreet;
        this.billingCity = accountBuilder.billingCity;
        this.billingState = accountBuilder.billingState;
        this.billingZip = accountBuilder.billingZip;
        this.billingCountry = accountBuilder.billingCountry;
        this.shippingStreet = accountBuilder.shippingStreet;
        this.shippingCity = accountBuilder.shippingCity;
        this.shippingState = accountBuilder.shippingState;
        this.shippingZip = accountBuilder.shippingZip;
        this.shippingCountry = accountBuilder.shippingCountry;
        this.industry = accountBuilder.industry;
        this.type = accountBuilder.type;
        this.billingAddress = accountBuilder.billingAddress;
        this.shippingAddress = accountBuilder.shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName) && Objects.equals(phone, account.phone)
                && Objects.equals(fax, account.fax) && Objects.equals(website, account.website)
                && Objects.equals(employees, account.employees) && Objects.equals(annualRevenue, account.annualRevenue)
                && Objects.equals(description, account.description) && industry == account.industry && type == account.type
                && Objects.equals(billingAddress, account.billingAddress) && Objects.equals(shippingAddress, account.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, phone, fax, website, employees, annualRevenue, description, industry, type,
                billingAddress, shippingAddress);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                ", employees='" + employees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", description='" + description + '\'' +
                ", industry=" + industry +
                ", type=" + type +
                ", billingAddress='" + billingAddress + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }

    public static class AccountBuilder {
        public Account build() {
            if (this.billingAddress == null && this.shippingAddress == null) {
                String billingStreet = Objects.isNull(this.billingStreet) ? "" : this.billingStreet;
                String billingCity = Objects.isNull(this.billingCity) ? "" : this.billingCity;
                String billingState = Objects.isNull(this.billingState) ? "" : this.billingState;
                String billingZip = Objects.isNull(this.billingZip) ? "" : this.billingZip;
                String billingCountry = Objects.isNull(this.billingCountry) ? "" : this.billingCountry;
                String shippingStreet = Objects.isNull(this.shippingStreet) ? "" : this.shippingStreet;
                String shippingCity = Objects.isNull(this.shippingCity) ? "" : this.shippingCity;
                String shippingState = Objects.isNull(this.shippingState) ? "" : this.shippingState;
                String shippingZip = Objects.isNull(this.shippingZip) ? "" : this.shippingZip;
                String shippingCountry = Objects.isNull(this.shippingCountry) ? "" : this.shippingCountry;
                this.billingAddress = (billingStreet + "\n" + billingCity + ", " + billingState + " " + billingZip + "\n" +
                        billingCountry).trim().replace("  ", " ");
                this.shippingAddress = (shippingStreet + "\n" + shippingCity + ", " + shippingState + " " + shippingZip + "\n" +
                        shippingCountry).trim().replace("  ", " ");
                return new Account(this);
            }
            return new Account(this);
        }
    }
}