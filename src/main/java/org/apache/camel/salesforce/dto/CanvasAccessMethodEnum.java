/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CanvasAccessMethod
 */
public enum CanvasAccessMethodEnum {

    // Get
    GET("Get"),
    // Post
    POST("Post");

    final String value;

    private CanvasAccessMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CanvasAccessMethodEnum fromValue(String value) {
        for (CanvasAccessMethodEnum e : CanvasAccessMethodEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
