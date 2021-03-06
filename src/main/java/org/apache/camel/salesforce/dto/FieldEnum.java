/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
public enum FieldEnum {

    // Address
    ADDRESS("Address"),
    // AnnualRevenue
    ANNUALREVENUE("AnnualRevenue"),
    // City
    CITY("City"),
    // CleanStatus
    CLEANSTATUS("CleanStatus"),
    // Company
    COMPANY("Company"),
    // CompanyDunsNumber
    COMPANYDUNSNUMBER("CompanyDunsNumber"),
    // Country
    COUNTRY("Country"),
    // CurrentGenerators__c
    CURRENTGENERATORS__C("CurrentGenerators__c"),
    // DandbCompany
    DANDBCOMPANY("DandbCompany"),
    // Description
    DESCRIPTION("Description"),
    // DoNotCall
    DONOTCALL("DoNotCall"),
    // Email
    EMAIL("Email"),
    // EmailBouncedDate
    EMAILBOUNCEDDATE("EmailBouncedDate"),
    // EmailBouncedReason
    EMAILBOUNCEDREASON("EmailBouncedReason"),
    // Fax
    FAX("Fax"),
    // FirstName
    FIRSTNAME("FirstName"),
    // GeocodeAccuracy
    GEOCODEACCURACY("GeocodeAccuracy"),
    // HasOptedOutOfEmail
    HASOPTEDOUTOFEMAIL("HasOptedOutOfEmail"),
    // HasOptedOutOfFax
    HASOPTEDOUTOFFAX("HasOptedOutOfFax"),
    // Industry
    INDUSTRY("Industry"),
    // IsUnreadByOwner
    ISUNREADBYOWNER("IsUnreadByOwner"),
    // Jigsaw
    JIGSAW("Jigsaw"),
    // LastName
    LASTNAME("LastName"),
    // Latitude
    LATITUDE("Latitude"),
    // LeadSource
    LEADSOURCE("LeadSource"),
    // Longitude
    LONGITUDE("Longitude"),
    // MobilePhone
    MOBILEPHONE("MobilePhone"),
    // Name
    NAME("Name"),
    // NumberOfEmployees
    NUMBEROFEMPLOYEES("NumberOfEmployees"),
    // NumberofLocations__c
    NUMBEROFLOCATIONS__C("NumberofLocations__c"),
    // Owner
    OWNER("Owner"),
    // Phone
    PHONE("Phone"),
    // PostalCode
    POSTALCODE("PostalCode"),
    // Primary__c
    PRIMARY__C("Primary__c"),
    // ProductInterest__c
    PRODUCTINTEREST__C("ProductInterest__c"),
    // Rating
    RATING("Rating"),
    // SICCode__c
    SICCODE__C("SICCode__c"),
    // Salutation
    SALUTATION("Salutation"),
    // State
    STATE("State"),
    // Status
    STATUS("Status"),
    // Street
    STREET("Street"),
    // Title
    TITLE("Title"),
    // Website
    WEBSITE("Website"),
    // created
    CREATED("created"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // leadConverted
    LEADCONVERTED("leadConverted"),
    // leadMerged
    LEADMERGED("leadMerged"),
    // locked
    LOCKED("locked"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FieldEnum fromValue(String value) {
        for (FieldEnum e : FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
