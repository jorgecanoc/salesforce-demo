/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DefType
 */
public enum DefTypeEnum {

    // APPLICATION
    APPLICATION("APPLICATION"),
    // COMPONENT
    COMPONENT("COMPONENT"),
    // CONTROLLER
    CONTROLLER("CONTROLLER"),
    // DESIGN
    DESIGN("DESIGN"),
    // DOCUMENTATION
    DOCUMENTATION("DOCUMENTATION"),
    // EVENT
    EVENT("EVENT"),
    // HELPER
    HELPER("HELPER"),
    // INTERFACE
    INTERFACE("INTERFACE"),
    // LAYOUT
    LAYOUT("LAYOUT"),
    // MODEL
    MODEL("MODEL"),
    // PROVIDER
    PROVIDER("PROVIDER"),
    // RENDERER
    RENDERER("RENDERER"),
    // STYLE
    STYLE("STYLE"),
    // SVG
    SVG("SVG"),
    // TESTSUITE
    TESTSUITE("TESTSUITE"),
    // THEME
    THEME("THEME");

    final String value;

    private DefTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DefTypeEnum fromValue(String value) {
        for (DefTypeEnum e : DefTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
