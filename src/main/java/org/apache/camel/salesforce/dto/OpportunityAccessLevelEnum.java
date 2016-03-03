/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OpportunityAccessLevel
 */
public enum OpportunityAccessLevelEnum {

    // Edit
    EDIT("Edit"),
    // None
    NONE("None"),
    // Read
    READ("Read");

    final String value;

    private OpportunityAccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpportunityAccessLevelEnum fromValue(String value) {
        for (OpportunityAccessLevelEnum e : OpportunityAccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
