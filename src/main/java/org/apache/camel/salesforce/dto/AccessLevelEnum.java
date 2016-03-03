/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccessLevel
 */
public enum AccessLevelEnum {

    // All
    ALL("All"),
    // Edit
    EDIT("Edit"),
    // Read
    READ("Read");

    final String value;

    private AccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccessLevelEnum fromValue(String value) {
        for (AccessLevelEnum e : AccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}