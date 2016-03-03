/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ReverseRole
 */
public enum ReverseRoleEnum {

    // Advertiser
    ADVERTISER("Advertiser"),
    // Agency
    AGENCY("Agency"),
    // Broker
    BROKER("Broker"),
    // Consultant
    CONSULTANT("Consultant"),
    // Contractor
    CONTRACTOR("Contractor"),
    // Dealer
    DEALER("Dealer"),
    // Developer
    DEVELOPER("Developer"),
    // Distributor
    DISTRIBUTOR("Distributor"),
    // Institution
    INSTITUTION("Institution"),
    // Lender
    LENDER("Lender"),
    // Supplier
    SUPPLIER("Supplier"),
    // System Integrator
    SYSTEM_INTEGRATOR("System Integrator"),
    // VAR/Reseller
    VAR_RESELLER("VAR/Reseller");

    final String value;

    private ReverseRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ReverseRoleEnum fromValue(String value) {
        for (ReverseRoleEnum e : ReverseRoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
