package models;

import enums.*;

import java.util.Objects;

public class Lead {

    private final String firstName;
    private final String lastName;
    private final String street;
    private final String city;
    private final String province;
    private final String postalCode;
    private final String country;
    private final String fullName;
    private final String phone;
    private final String company;
    private final String email;
    private final String title;
    private final String website;
    private final String address;
    private final String numberOfEmployees;
    private final String annualRevenue;
    private final String description;
    private final LeadStatus leadStatus;
    private final Rating rating;
    private final LeadSource leadSource;
    private final Industry industry;
    private final Salutation salutation;

    private Lead(LeadBuilder leadBuilder) {

        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.street = leadBuilder.street;
        this.city = leadBuilder.city;
        this.province = leadBuilder.province;
        this.postalCode = leadBuilder.postalCode;
        this.country = leadBuilder.country;
        this.fullName = leadBuilder.fullName;
        this.phone = leadBuilder.phone;
        this.company = leadBuilder.company;
        this.email = leadBuilder.email;
        this.title = leadBuilder.title;
        this.website = leadBuilder.website;
        this.address = leadBuilder.address;
        this.numberOfEmployees = leadBuilder.numberOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.description = leadBuilder.description;
        this.leadStatus = leadBuilder.leadStatus;
        this.rating = leadBuilder.rating;
        this.leadSource = leadBuilder.leadSource;
        this.industry = leadBuilder.industry;
        this.salutation = leadBuilder.salutation;
    }

    public LeadStatus getLeadStatus()   {
        return this.leadStatus;
    }

    public Rating getRating()   {
        return this.rating;
    }

    public LeadSource getLeadSource()   {
        return this.leadSource;
    }

    public Industry getIndustry()   {
        return this.industry;
    }

    public Salutation getSalutation()   {
        return this.salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getWebsite() {
        return website;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public String getCompany() {
        return company;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return Objects.equals(fullName, lead.fullName) && Objects.equals(phone, lead.phone)
                && Objects.equals(company, lead.company) && Objects.equals(email, lead.email) && Objects.equals(title, lead.title)
                && Objects.equals(website, lead.website) && Objects.equals(address, lead.address)
                && Objects.equals(numberOfEmployees, lead.numberOfEmployees) && Objects.equals(annualRevenue, lead.annualRevenue)
                && Objects.equals(description, lead.description) && Objects.equals(leadStatus, lead.leadStatus)
                && Objects.equals(rating, lead.rating) && Objects.equals(leadSource, lead.leadSource)
                && Objects.equals(industry, lead.industry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, phone, company,
                email, title, website, address, numberOfEmployees, annualRevenue, description, leadStatus, rating,
                leadSource, industry);
    }

    @Override
    public String toString() {
        return "Lead{" +
                ", name='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", website='" + website + '\'' +
                ", address='" + address + '\'' +
                ", numberOfEmployees='" + numberOfEmployees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", description='" + description + '\'' +
                ", leadStatus='" + leadStatus + '\'' +
                ", rating='" + rating + '\'' +
                ", leadSource='" + leadSource + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }

    public static class LeadBuilder    {

        private String firstName;
        private String lastName;
        private String street;
        private String city;
        private String province;
        private String postalCode;
        private String country;
        private String fullName;
        private String phone;
        private String company;
        private String email;
        private String title;
        private String website;
        private String address;
        private String numberOfEmployees;
        private String annualRevenue;
        private String description;
        private LeadStatus leadStatus;
        private Rating rating;
        private LeadSource leadSource;
        private Industry industry;
        private Salutation salutation;

        public LeadBuilder(String lastName, LeadStatus leadStatus, String company)    {
            this.lastName = lastName;
            this.leadStatus = leadStatus;
            this.company = company;
        }

        public LeadBuilder(String fullName, String company, LeadStatus leadStatus)  {
            this.fullName = fullName;
            this.company = company;
            this.leadStatus = leadStatus;
        }

        public LeadBuilder setSalutation(Salutation salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder setLeadSource(LeadSource leadSource)  {
            this.leadSource = leadSource;
            return this;
        }

        public LeadBuilder setRating(Rating rating)  {
            this.rating = rating;
            return this;
        }

        public LeadBuilder setIndustry(Industry industry)  {
            this.industry = industry;
            return this;
        }

        public LeadBuilder setStreet(String street)   {
            this.street = street;
            return this;
        }

        public LeadBuilder setCity(String city)   {
            this.city = city;
            return this;
        }

        public LeadBuilder setProvince(String province)   {
            this.province = province;
            return this;
        }

        public LeadBuilder setPostalCode(String postalCode)   {
            this.postalCode = postalCode;
            return this;
        }

        public LeadBuilder setCountry(String country)   {
            this.country = country;
            return this;
        }

        public LeadBuilder setPhone(String phone)   {
            this.phone = phone;
            return this;
        }

        public LeadBuilder setEmail(String email)   {
            this.email = email;
            return this;
        }

        public LeadBuilder setTitle(String title)   {
            this.title = title;
            return this;
        }

        public LeadBuilder setWebsite(String website)   {
            this.website = website;
            return this;
        }

        public LeadBuilder setAddress(String address)   {
            this.address = address;
            return this;
        }

        public LeadBuilder setNumberOfEmployees(String numberOfEmployees)   {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public LeadBuilder setAnnualRevenue(String annualRevenue)   {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder setDescription(String description)   {
            this.description = description;
            return this;
        }

        public LeadBuilder setFirstName(String firstName)   {
            this.firstName = firstName;
            return this;
        }

        public Lead build() {
            if (this.address == null && this.fullName == null)  {
                String salutation = Objects.isNull(this.salutation) ? "" : this.salutation.getName();
                String firstName = Objects.isNull(this.firstName) ? "" : this.firstName;
                String lastName = Objects.isNull(this.lastName) ? "" : this.lastName;
                String street = Objects.isNull(this.street) ? "" : this.street;
                String city = Objects.isNull(this.city) ? "" : this.city;
                String province = Objects.isNull(this.province) ? "" : this.province;
                String postalCode = Objects.isNull(this.postalCode) ? "" : this.postalCode;
                String country = Objects.isNull(this.country) ? "" : this.country;
                this.address = (street + "\n" + city + ", " + province + " " + postalCode + "\n" + country).trim();
                this.fullName = (salutation + " " + firstName + " " + lastName).trim();
                return new Lead(this);
            }
            return new Lead(this);
        }
    }
}