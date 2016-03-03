/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject LeadCleanInfo
 */
@XStreamAlias("LeadCleanInfo")
public class LeadCleanInfo extends AbstractSObjectBase {

    // LeadId
    private String LeadId;

    @JsonProperty("LeadId")
    public String getLeadId() {
        return this.LeadId;
    }

    @JsonProperty("LeadId")
    public void setLeadId(String LeadId) {
        this.LeadId = LeadId;
    }

    // LastMatchedDate
    private org.joda.time.DateTime LastMatchedDate;

    @JsonProperty("LastMatchedDate")
    public org.joda.time.DateTime getLastMatchedDate() {
        return this.LastMatchedDate;
    }

    @JsonProperty("LastMatchedDate")
    public void setLastMatchedDate(org.joda.time.DateTime LastMatchedDate) {
        this.LastMatchedDate = LastMatchedDate;
    }

    // LastStatusChangedDate
    private org.joda.time.DateTime LastStatusChangedDate;

    @JsonProperty("LastStatusChangedDate")
    public org.joda.time.DateTime getLastStatusChangedDate() {
        return this.LastStatusChangedDate;
    }

    @JsonProperty("LastStatusChangedDate")
    public void setLastStatusChangedDate(org.joda.time.DateTime LastStatusChangedDate) {
        this.LastStatusChangedDate = LastStatusChangedDate;
    }

    // LastStatusChangedById
    private String LastStatusChangedById;

    @JsonProperty("LastStatusChangedById")
    public String getLastStatusChangedById() {
        return this.LastStatusChangedById;
    }

    @JsonProperty("LastStatusChangedById")
    public void setLastStatusChangedById(String LastStatusChangedById) {
        this.LastStatusChangedById = LastStatusChangedById;
    }

    // IsInactive
    private Boolean IsInactive;

    @JsonProperty("IsInactive")
    public Boolean getIsInactive() {
        return this.IsInactive;
    }

    @JsonProperty("IsInactive")
    public void setIsInactive(Boolean IsInactive) {
        this.IsInactive = IsInactive;
    }

    // FirstName
    private String FirstName;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return this.FirstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    // LastName
    private String LastName;

    @JsonProperty("LastName")
    public String getLastName() {
        return this.LastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    // Email
    private String Email;

    @JsonProperty("Email")
    public String getEmail() {
        return this.Email;
    }

    @JsonProperty("Email")
    public void setEmail(String Email) {
        this.Email = Email;
    }

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // Street
    private String Street;

    @JsonProperty("Street")
    public String getStreet() {
        return this.Street;
    }

    @JsonProperty("Street")
    public void setStreet(String Street) {
        this.Street = Street;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // PostalCode
    private String PostalCode;

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return this.PostalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // Latitude
    private Double Latitude;

    @JsonProperty("Latitude")
    public Double getLatitude() {
        return this.Latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(Double Latitude) {
        this.Latitude = Latitude;
    }

    // Longitude
    private Double Longitude;

    @JsonProperty("Longitude")
    public Double getLongitude() {
        return this.Longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    // Address
    private org.apache.camel.component.salesforce.api.dto.Address Address;

    @JsonProperty("Address")
    public org.apache.camel.component.salesforce.api.dto.Address getAddress() {
        return this.Address;
    }

    @JsonProperty("Address")
    public void setAddress(org.apache.camel.component.salesforce.api.dto.Address Address) {
        this.Address = Address;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // AnnualRevenue
    private Double AnnualRevenue;

    @JsonProperty("AnnualRevenue")
    public Double getAnnualRevenue() {
        return this.AnnualRevenue;
    }

    @JsonProperty("AnnualRevenue")
    public void setAnnualRevenue(Double AnnualRevenue) {
        this.AnnualRevenue = AnnualRevenue;
    }

    // NumberOfEmployees
    private Integer NumberOfEmployees;

    @JsonProperty("NumberOfEmployees")
    public Integer getNumberOfEmployees() {
        return this.NumberOfEmployees;
    }

    @JsonProperty("NumberOfEmployees")
    public void setNumberOfEmployees(Integer NumberOfEmployees) {
        this.NumberOfEmployees = NumberOfEmployees;
    }

    // Industry
    @XStreamConverter(PicklistEnumConverter.class)
    private IndustryEnum Industry;

    @JsonProperty("Industry")
    public IndustryEnum getIndustry() {
        return this.Industry;
    }

    @JsonProperty("Industry")
    public void setIndustry(IndustryEnum Industry) {
        this.Industry = Industry;
    }

    // CompanyName
    private String CompanyName;

    @JsonProperty("CompanyName")
    public String getCompanyName() {
        return this.CompanyName;
    }

    @JsonProperty("CompanyName")
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    // CompanyDunsNumber
    private String CompanyDunsNumber;

    @JsonProperty("CompanyDunsNumber")
    public String getCompanyDunsNumber() {
        return this.CompanyDunsNumber;
    }

    @JsonProperty("CompanyDunsNumber")
    public void setCompanyDunsNumber(String CompanyDunsNumber) {
        this.CompanyDunsNumber = CompanyDunsNumber;
    }

    // ContactStatusDataDotCom
    @XStreamConverter(PicklistEnumConverter.class)
    private ContactStatusDataDotComEnum ContactStatusDataDotCom;

    @JsonProperty("ContactStatusDataDotCom")
    public ContactStatusDataDotComEnum getContactStatusDataDotCom() {
        return this.ContactStatusDataDotCom;
    }

    @JsonProperty("ContactStatusDataDotCom")
    public void setContactStatusDataDotCom(ContactStatusDataDotComEnum ContactStatusDataDotCom) {
        this.ContactStatusDataDotCom = ContactStatusDataDotCom;
    }

    // IsReviewedName
    private Boolean IsReviewedName;

    @JsonProperty("IsReviewedName")
    public Boolean getIsReviewedName() {
        return this.IsReviewedName;
    }

    @JsonProperty("IsReviewedName")
    public void setIsReviewedName(Boolean IsReviewedName) {
        this.IsReviewedName = IsReviewedName;
    }

    // IsReviewedEmail
    private Boolean IsReviewedEmail;

    @JsonProperty("IsReviewedEmail")
    public Boolean getIsReviewedEmail() {
        return this.IsReviewedEmail;
    }

    @JsonProperty("IsReviewedEmail")
    public void setIsReviewedEmail(Boolean IsReviewedEmail) {
        this.IsReviewedEmail = IsReviewedEmail;
    }

    // IsReviewedPhone
    private Boolean IsReviewedPhone;

    @JsonProperty("IsReviewedPhone")
    public Boolean getIsReviewedPhone() {
        return this.IsReviewedPhone;
    }

    @JsonProperty("IsReviewedPhone")
    public void setIsReviewedPhone(Boolean IsReviewedPhone) {
        this.IsReviewedPhone = IsReviewedPhone;
    }

    // IsReviewedAddress
    private Boolean IsReviewedAddress;

    @JsonProperty("IsReviewedAddress")
    public Boolean getIsReviewedAddress() {
        return this.IsReviewedAddress;
    }

    @JsonProperty("IsReviewedAddress")
    public void setIsReviewedAddress(Boolean IsReviewedAddress) {
        this.IsReviewedAddress = IsReviewedAddress;
    }

    // IsReviewedTitle
    private Boolean IsReviewedTitle;

    @JsonProperty("IsReviewedTitle")
    public Boolean getIsReviewedTitle() {
        return this.IsReviewedTitle;
    }

    @JsonProperty("IsReviewedTitle")
    public void setIsReviewedTitle(Boolean IsReviewedTitle) {
        this.IsReviewedTitle = IsReviewedTitle;
    }

    // IsReviewedAnnualRevenue
    private Boolean IsReviewedAnnualRevenue;

    @JsonProperty("IsReviewedAnnualRevenue")
    public Boolean getIsReviewedAnnualRevenue() {
        return this.IsReviewedAnnualRevenue;
    }

    @JsonProperty("IsReviewedAnnualRevenue")
    public void setIsReviewedAnnualRevenue(Boolean IsReviewedAnnualRevenue) {
        this.IsReviewedAnnualRevenue = IsReviewedAnnualRevenue;
    }

    // IsReviewedNumberOfEmployees
    private Boolean IsReviewedNumberOfEmployees;

    @JsonProperty("IsReviewedNumberOfEmployees")
    public Boolean getIsReviewedNumberOfEmployees() {
        return this.IsReviewedNumberOfEmployees;
    }

    @JsonProperty("IsReviewedNumberOfEmployees")
    public void setIsReviewedNumberOfEmployees(Boolean IsReviewedNumberOfEmployees) {
        this.IsReviewedNumberOfEmployees = IsReviewedNumberOfEmployees;
    }

    // IsReviewedIndustry
    private Boolean IsReviewedIndustry;

    @JsonProperty("IsReviewedIndustry")
    public Boolean getIsReviewedIndustry() {
        return this.IsReviewedIndustry;
    }

    @JsonProperty("IsReviewedIndustry")
    public void setIsReviewedIndustry(Boolean IsReviewedIndustry) {
        this.IsReviewedIndustry = IsReviewedIndustry;
    }

    // IsReviewedCompanyName
    private Boolean IsReviewedCompanyName;

    @JsonProperty("IsReviewedCompanyName")
    public Boolean getIsReviewedCompanyName() {
        return this.IsReviewedCompanyName;
    }

    @JsonProperty("IsReviewedCompanyName")
    public void setIsReviewedCompanyName(Boolean IsReviewedCompanyName) {
        this.IsReviewedCompanyName = IsReviewedCompanyName;
    }

    // IsReviewedCompanyDunsNumber
    private Boolean IsReviewedCompanyDunsNumber;

    @JsonProperty("IsReviewedCompanyDunsNumber")
    public Boolean getIsReviewedCompanyDunsNumber() {
        return this.IsReviewedCompanyDunsNumber;
    }

    @JsonProperty("IsReviewedCompanyDunsNumber")
    public void setIsReviewedCompanyDunsNumber(Boolean IsReviewedCompanyDunsNumber) {
        this.IsReviewedCompanyDunsNumber = IsReviewedCompanyDunsNumber;
    }

    // IsReviewedDandBCompanyDunsNumber
    private Boolean IsReviewedDandBCompanyDunsNumber;

    @JsonProperty("IsReviewedDandBCompanyDunsNumber")
    public Boolean getIsReviewedDandBCompanyDunsNumber() {
        return this.IsReviewedDandBCompanyDunsNumber;
    }

    @JsonProperty("IsReviewedDandBCompanyDunsNumber")
    public void setIsReviewedDandBCompanyDunsNumber(Boolean IsReviewedDandBCompanyDunsNumber) {
        this.IsReviewedDandBCompanyDunsNumber = IsReviewedDandBCompanyDunsNumber;
    }

    // IsDifferentFirstName
    private Boolean IsDifferentFirstName;

    @JsonProperty("IsDifferentFirstName")
    public Boolean getIsDifferentFirstName() {
        return this.IsDifferentFirstName;
    }

    @JsonProperty("IsDifferentFirstName")
    public void setIsDifferentFirstName(Boolean IsDifferentFirstName) {
        this.IsDifferentFirstName = IsDifferentFirstName;
    }

    // IsDifferentLastName
    private Boolean IsDifferentLastName;

    @JsonProperty("IsDifferentLastName")
    public Boolean getIsDifferentLastName() {
        return this.IsDifferentLastName;
    }

    @JsonProperty("IsDifferentLastName")
    public void setIsDifferentLastName(Boolean IsDifferentLastName) {
        this.IsDifferentLastName = IsDifferentLastName;
    }

    // IsDifferentEmail
    private Boolean IsDifferentEmail;

    @JsonProperty("IsDifferentEmail")
    public Boolean getIsDifferentEmail() {
        return this.IsDifferentEmail;
    }

    @JsonProperty("IsDifferentEmail")
    public void setIsDifferentEmail(Boolean IsDifferentEmail) {
        this.IsDifferentEmail = IsDifferentEmail;
    }

    // IsDifferentPhone
    private Boolean IsDifferentPhone;

    @JsonProperty("IsDifferentPhone")
    public Boolean getIsDifferentPhone() {
        return this.IsDifferentPhone;
    }

    @JsonProperty("IsDifferentPhone")
    public void setIsDifferentPhone(Boolean IsDifferentPhone) {
        this.IsDifferentPhone = IsDifferentPhone;
    }

    // IsDifferentStreet
    private Boolean IsDifferentStreet;

    @JsonProperty("IsDifferentStreet")
    public Boolean getIsDifferentStreet() {
        return this.IsDifferentStreet;
    }

    @JsonProperty("IsDifferentStreet")
    public void setIsDifferentStreet(Boolean IsDifferentStreet) {
        this.IsDifferentStreet = IsDifferentStreet;
    }

    // IsDifferentCity
    private Boolean IsDifferentCity;

    @JsonProperty("IsDifferentCity")
    public Boolean getIsDifferentCity() {
        return this.IsDifferentCity;
    }

    @JsonProperty("IsDifferentCity")
    public void setIsDifferentCity(Boolean IsDifferentCity) {
        this.IsDifferentCity = IsDifferentCity;
    }

    // IsDifferentState
    private Boolean IsDifferentState;

    @JsonProperty("IsDifferentState")
    public Boolean getIsDifferentState() {
        return this.IsDifferentState;
    }

    @JsonProperty("IsDifferentState")
    public void setIsDifferentState(Boolean IsDifferentState) {
        this.IsDifferentState = IsDifferentState;
    }

    // IsDifferentPostalCode
    private Boolean IsDifferentPostalCode;

    @JsonProperty("IsDifferentPostalCode")
    public Boolean getIsDifferentPostalCode() {
        return this.IsDifferentPostalCode;
    }

    @JsonProperty("IsDifferentPostalCode")
    public void setIsDifferentPostalCode(Boolean IsDifferentPostalCode) {
        this.IsDifferentPostalCode = IsDifferentPostalCode;
    }

    // IsDifferentCountry
    private Boolean IsDifferentCountry;

    @JsonProperty("IsDifferentCountry")
    public Boolean getIsDifferentCountry() {
        return this.IsDifferentCountry;
    }

    @JsonProperty("IsDifferentCountry")
    public void setIsDifferentCountry(Boolean IsDifferentCountry) {
        this.IsDifferentCountry = IsDifferentCountry;
    }

    // IsDifferentTitle
    private Boolean IsDifferentTitle;

    @JsonProperty("IsDifferentTitle")
    public Boolean getIsDifferentTitle() {
        return this.IsDifferentTitle;
    }

    @JsonProperty("IsDifferentTitle")
    public void setIsDifferentTitle(Boolean IsDifferentTitle) {
        this.IsDifferentTitle = IsDifferentTitle;
    }

    // IsDifferentAnnualRevenue
    private Boolean IsDifferentAnnualRevenue;

    @JsonProperty("IsDifferentAnnualRevenue")
    public Boolean getIsDifferentAnnualRevenue() {
        return this.IsDifferentAnnualRevenue;
    }

    @JsonProperty("IsDifferentAnnualRevenue")
    public void setIsDifferentAnnualRevenue(Boolean IsDifferentAnnualRevenue) {
        this.IsDifferentAnnualRevenue = IsDifferentAnnualRevenue;
    }

    // IsDifferentNumberOfEmployees
    private Boolean IsDifferentNumberOfEmployees;

    @JsonProperty("IsDifferentNumberOfEmployees")
    public Boolean getIsDifferentNumberOfEmployees() {
        return this.IsDifferentNumberOfEmployees;
    }

    @JsonProperty("IsDifferentNumberOfEmployees")
    public void setIsDifferentNumberOfEmployees(Boolean IsDifferentNumberOfEmployees) {
        this.IsDifferentNumberOfEmployees = IsDifferentNumberOfEmployees;
    }

    // IsDifferentIndustry
    private Boolean IsDifferentIndustry;

    @JsonProperty("IsDifferentIndustry")
    public Boolean getIsDifferentIndustry() {
        return this.IsDifferentIndustry;
    }

    @JsonProperty("IsDifferentIndustry")
    public void setIsDifferentIndustry(Boolean IsDifferentIndustry) {
        this.IsDifferentIndustry = IsDifferentIndustry;
    }

    // IsDifferentCompanyName
    private Boolean IsDifferentCompanyName;

    @JsonProperty("IsDifferentCompanyName")
    public Boolean getIsDifferentCompanyName() {
        return this.IsDifferentCompanyName;
    }

    @JsonProperty("IsDifferentCompanyName")
    public void setIsDifferentCompanyName(Boolean IsDifferentCompanyName) {
        this.IsDifferentCompanyName = IsDifferentCompanyName;
    }

    // IsDifferentCompanyDunsNumber
    private Boolean IsDifferentCompanyDunsNumber;

    @JsonProperty("IsDifferentCompanyDunsNumber")
    public Boolean getIsDifferentCompanyDunsNumber() {
        return this.IsDifferentCompanyDunsNumber;
    }

    @JsonProperty("IsDifferentCompanyDunsNumber")
    public void setIsDifferentCompanyDunsNumber(Boolean IsDifferentCompanyDunsNumber) {
        this.IsDifferentCompanyDunsNumber = IsDifferentCompanyDunsNumber;
    }

    // IsDifferentDandBCompanyDunsNumber
    private Boolean IsDifferentDandBCompanyDunsNumber;

    @JsonProperty("IsDifferentDandBCompanyDunsNumber")
    public Boolean getIsDifferentDandBCompanyDunsNumber() {
        return this.IsDifferentDandBCompanyDunsNumber;
    }

    @JsonProperty("IsDifferentDandBCompanyDunsNumber")
    public void setIsDifferentDandBCompanyDunsNumber(Boolean IsDifferentDandBCompanyDunsNumber) {
        this.IsDifferentDandBCompanyDunsNumber = IsDifferentDandBCompanyDunsNumber;
    }

    // IsDifferentStateCode
    private Boolean IsDifferentStateCode;

    @JsonProperty("IsDifferentStateCode")
    public Boolean getIsDifferentStateCode() {
        return this.IsDifferentStateCode;
    }

    @JsonProperty("IsDifferentStateCode")
    public void setIsDifferentStateCode(Boolean IsDifferentStateCode) {
        this.IsDifferentStateCode = IsDifferentStateCode;
    }

    // IsDifferentCountryCode
    private Boolean IsDifferentCountryCode;

    @JsonProperty("IsDifferentCountryCode")
    public Boolean getIsDifferentCountryCode() {
        return this.IsDifferentCountryCode;
    }

    @JsonProperty("IsDifferentCountryCode")
    public void setIsDifferentCountryCode(Boolean IsDifferentCountryCode) {
        this.IsDifferentCountryCode = IsDifferentCountryCode;
    }

    // CleanedByJob
    private Boolean CleanedByJob;

    @JsonProperty("CleanedByJob")
    public Boolean getCleanedByJob() {
        return this.CleanedByJob;
    }

    @JsonProperty("CleanedByJob")
    public void setCleanedByJob(Boolean CleanedByJob) {
        this.CleanedByJob = CleanedByJob;
    }

    // CleanedByUser
    private Boolean CleanedByUser;

    @JsonProperty("CleanedByUser")
    public Boolean getCleanedByUser() {
        return this.CleanedByUser;
    }

    @JsonProperty("CleanedByUser")
    public void setCleanedByUser(Boolean CleanedByUser) {
        this.CleanedByUser = CleanedByUser;
    }

    // DandBCompanyDunsNumber
    private String DandBCompanyDunsNumber;

    @JsonProperty("DandBCompanyDunsNumber")
    public String getDandBCompanyDunsNumber() {
        return this.DandBCompanyDunsNumber;
    }

    @JsonProperty("DandBCompanyDunsNumber")
    public void setDandBCompanyDunsNumber(String DandBCompanyDunsNumber) {
        this.DandBCompanyDunsNumber = DandBCompanyDunsNumber;
    }

    // DataDotComCompanyId
    private String DataDotComCompanyId;

    @JsonProperty("DataDotComCompanyId")
    public String getDataDotComCompanyId() {
        return this.DataDotComCompanyId;
    }

    @JsonProperty("DataDotComCompanyId")
    public void setDataDotComCompanyId(String DataDotComCompanyId) {
        this.DataDotComCompanyId = DataDotComCompanyId;
    }

    // IsFlaggedWrongName
    private Boolean IsFlaggedWrongName;

    @JsonProperty("IsFlaggedWrongName")
    public Boolean getIsFlaggedWrongName() {
        return this.IsFlaggedWrongName;
    }

    @JsonProperty("IsFlaggedWrongName")
    public void setIsFlaggedWrongName(Boolean IsFlaggedWrongName) {
        this.IsFlaggedWrongName = IsFlaggedWrongName;
    }

    // IsFlaggedWrongEmail
    private Boolean IsFlaggedWrongEmail;

    @JsonProperty("IsFlaggedWrongEmail")
    public Boolean getIsFlaggedWrongEmail() {
        return this.IsFlaggedWrongEmail;
    }

    @JsonProperty("IsFlaggedWrongEmail")
    public void setIsFlaggedWrongEmail(Boolean IsFlaggedWrongEmail) {
        this.IsFlaggedWrongEmail = IsFlaggedWrongEmail;
    }

    // IsFlaggedWrongPhone
    private Boolean IsFlaggedWrongPhone;

    @JsonProperty("IsFlaggedWrongPhone")
    public Boolean getIsFlaggedWrongPhone() {
        return this.IsFlaggedWrongPhone;
    }

    @JsonProperty("IsFlaggedWrongPhone")
    public void setIsFlaggedWrongPhone(Boolean IsFlaggedWrongPhone) {
        this.IsFlaggedWrongPhone = IsFlaggedWrongPhone;
    }

    // IsFlaggedWrongAddress
    private Boolean IsFlaggedWrongAddress;

    @JsonProperty("IsFlaggedWrongAddress")
    public Boolean getIsFlaggedWrongAddress() {
        return this.IsFlaggedWrongAddress;
    }

    @JsonProperty("IsFlaggedWrongAddress")
    public void setIsFlaggedWrongAddress(Boolean IsFlaggedWrongAddress) {
        this.IsFlaggedWrongAddress = IsFlaggedWrongAddress;
    }

    // IsFlaggedWrongTitle
    private Boolean IsFlaggedWrongTitle;

    @JsonProperty("IsFlaggedWrongTitle")
    public Boolean getIsFlaggedWrongTitle() {
        return this.IsFlaggedWrongTitle;
    }

    @JsonProperty("IsFlaggedWrongTitle")
    public void setIsFlaggedWrongTitle(Boolean IsFlaggedWrongTitle) {
        this.IsFlaggedWrongTitle = IsFlaggedWrongTitle;
    }

    // IsFlaggedWrongAnnualRevenue
    private Boolean IsFlaggedWrongAnnualRevenue;

    @JsonProperty("IsFlaggedWrongAnnualRevenue")
    public Boolean getIsFlaggedWrongAnnualRevenue() {
        return this.IsFlaggedWrongAnnualRevenue;
    }

    @JsonProperty("IsFlaggedWrongAnnualRevenue")
    public void setIsFlaggedWrongAnnualRevenue(Boolean IsFlaggedWrongAnnualRevenue) {
        this.IsFlaggedWrongAnnualRevenue = IsFlaggedWrongAnnualRevenue;
    }

    // IsFlaggedWrongNumberOfEmployees
    private Boolean IsFlaggedWrongNumberOfEmployees;

    @JsonProperty("IsFlaggedWrongNumberOfEmployees")
    public Boolean getIsFlaggedWrongNumberOfEmployees() {
        return this.IsFlaggedWrongNumberOfEmployees;
    }

    @JsonProperty("IsFlaggedWrongNumberOfEmployees")
    public void setIsFlaggedWrongNumberOfEmployees(Boolean IsFlaggedWrongNumberOfEmployees) {
        this.IsFlaggedWrongNumberOfEmployees = IsFlaggedWrongNumberOfEmployees;
    }

    // IsFlaggedWrongIndustry
    private Boolean IsFlaggedWrongIndustry;

    @JsonProperty("IsFlaggedWrongIndustry")
    public Boolean getIsFlaggedWrongIndustry() {
        return this.IsFlaggedWrongIndustry;
    }

    @JsonProperty("IsFlaggedWrongIndustry")
    public void setIsFlaggedWrongIndustry(Boolean IsFlaggedWrongIndustry) {
        this.IsFlaggedWrongIndustry = IsFlaggedWrongIndustry;
    }

    // IsFlaggedWrongCompanyName
    private Boolean IsFlaggedWrongCompanyName;

    @JsonProperty("IsFlaggedWrongCompanyName")
    public Boolean getIsFlaggedWrongCompanyName() {
        return this.IsFlaggedWrongCompanyName;
    }

    @JsonProperty("IsFlaggedWrongCompanyName")
    public void setIsFlaggedWrongCompanyName(Boolean IsFlaggedWrongCompanyName) {
        this.IsFlaggedWrongCompanyName = IsFlaggedWrongCompanyName;
    }

    // IsFlaggedWrongCompanyDunsNumber
    private Boolean IsFlaggedWrongCompanyDunsNumber;

    @JsonProperty("IsFlaggedWrongCompanyDunsNumber")
    public Boolean getIsFlaggedWrongCompanyDunsNumber() {
        return this.IsFlaggedWrongCompanyDunsNumber;
    }

    @JsonProperty("IsFlaggedWrongCompanyDunsNumber")
    public void setIsFlaggedWrongCompanyDunsNumber(Boolean IsFlaggedWrongCompanyDunsNumber) {
        this.IsFlaggedWrongCompanyDunsNumber = IsFlaggedWrongCompanyDunsNumber;
    }

    // DataDotComId
    private String DataDotComId;

    @JsonProperty("DataDotComId")
    public String getDataDotComId() {
        return this.DataDotComId;
    }

    @JsonProperty("DataDotComId")
    public void setDataDotComId(String DataDotComId) {
        this.DataDotComId = DataDotComId;
    }

}
