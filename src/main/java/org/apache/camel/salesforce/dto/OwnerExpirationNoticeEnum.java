/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OwnerExpirationNotice
 */
public enum OwnerExpirationNoticeEnum {

    // 120
    _120("120"),
    // 15
    _15("15"),
    // 30
    _30("30"),
    // 45
    _45("45"),
    // 60
    _60("60"),
    // 90
    _90("90");

    final String value;

    private OwnerExpirationNoticeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OwnerExpirationNoticeEnum fromValue(String value) {
        for (OwnerExpirationNoticeEnum e : OwnerExpirationNoticeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
