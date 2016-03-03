/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ProductInterest__c
 */
public enum ProductInterestEnum {

    // GC1000 series
    GC1000_SERIES("GC1000 series"),
    // GC3000 series
    GC3000_SERIES("GC3000 series"),
    // GC5000 series
    GC5000_SERIES("GC5000 series");

    final String value;

    private ProductInterestEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProductInterestEnum fromValue(String value) {
        for (ProductInterestEnum e : ProductInterestEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
