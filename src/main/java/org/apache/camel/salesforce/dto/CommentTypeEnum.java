/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CommentType
 */
public enum CommentTypeEnum {

    // ContentComment
    CONTENTCOMMENT("ContentComment"),
    // TextComment
    TEXTCOMMENT("TextComment");

    final String value;

    private CommentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CommentTypeEnum fromValue(String value) {
        for (CommentTypeEnum e : CommentTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
