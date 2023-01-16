package models;

import enums.Account.Industry;
import enums.Account.Type;

public class Account {

    private final String accountName;
    private final String phone;
    private final String fax;
    private final String website;
    private final String employees;
    private final String annualRevenue;
    private final String description;
    private final String billingStreet;
    private final String billingCity;
    private final String billingState;
    private final String billingZip;
    private final String billingCountry;
    private final String shippingStreet;
    private final String shippingCity;
    private final String shippingState;
    private final String shippingZip;
    private final String shippingCountry;
    private final Industry industry;
    private final Type type;

    private Account(AccountBuilder accountBuilder)  {
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
    }

    public Industry industry()  {
        return industry;
    }

    public Type type()  {
        return type;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public String getEmployees() {
        return employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public static class AccountBuilder  {
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
        private  Industry industry;
        private  Type type;

        public AccountBuilder(String accountName) {
            this.accountName = accountName;
        }



        public AccountBuilder setIndustry(Industry industry)    {
            this.industry = industry;
            return this;
        }

        public AccountBuilder setType(Type type)    {
            this.type = type;
            return this;
        }

        public AccountBuilder setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public AccountBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public AccountBuilder setFax(String fax) {
            this.fax = fax;
            return this;
        }

        public AccountBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public AccountBuilder setEmployees(String employees) {
            this.employees = employees;
            return this;
        }

        public AccountBuilder setAnnualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public AccountBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public AccountBuilder setBillingStreet(String billingStreet) {
            this.billingStreet = billingStreet;
            return this;
        }

        public AccountBuilder setBillingCity(String billingCity) {
            this.billingCity = billingCity;
            return this;
        }

        public AccountBuilder setBillingState(String billingState) {
            this.billingState = billingState;
            return this;
        }

        public AccountBuilder setBillingZip(String billingZip) {
            this.billingZip = billingZip;
            return this;
        }

        public AccountBuilder setBillingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
            return this;
        }

        public AccountBuilder setShippingStreet(String shippingStreet) {
            this.shippingStreet = shippingStreet;
            return this;
        }

        public AccountBuilder setShippingCity(String shippingCity) {
            this.shippingCity = shippingCity;
            return this;
        }

        public AccountBuilder setShippingState(String shippingState) {
            this.shippingState = shippingState;
            return this;
        }

        public AccountBuilder setShippingZip(String shippingZip) {
            this.shippingZip = shippingZip;
            return this;
        }

        public AccountBuilder setShippingCountry(String shippingCountry) {
            this.shippingCountry = shippingCountry;
            return this;
        }

        public Account build()  {
            return new Account(this);
        }
    }
}
