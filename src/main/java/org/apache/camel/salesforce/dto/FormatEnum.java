/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Format
 */
public enum FormatEnum {

    // CSS
    CSS("CSS"),
    // JS
    JS("JS"),
    // SVG
    SVG("SVG"),
    // TEMPLATE_CSS
    TEMPLATE_CSS("TEMPLATE_CSS"),
    // XML
    XML("XML");

    final String value;

    private FormatEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FormatEnum fromValue(String value) {
        for (FormatEnum e : FormatEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
