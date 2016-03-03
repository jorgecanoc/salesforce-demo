/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LinkState
 */
public enum LinkStateEnum {

    // Duplicate
    DUPLICATE("Duplicate"),
    // Ignored
    IGNORED("Ignored"),
    // Linked
    LINKED("Linked"),
    // Orphaned
    ORPHANED("Orphaned");

    final String value;

    private LinkStateEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LinkStateEnum fromValue(String value) {
        for (LinkStateEnum e : LinkStateEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
