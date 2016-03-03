/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SetupEntityType
 */
public enum SetupEntityTypeEnum {

    // ApexClass
    APEXCLASS("ApexClass"),
    // ApexPage
    APEXPAGE("ApexPage"),
    // ConnectedApplication
    CONNECTEDAPPLICATION("ConnectedApplication"),
    // CustomPermission
    CUSTOMPERMISSION("CustomPermission"),
    // ExternalDataSource
    EXTERNALDATASOURCE("ExternalDataSource"),
    // NamedCredential
    NAMEDCREDENTIAL("NamedCredential"),
    // ServiceProvider
    SERVICEPROVIDER("ServiceProvider"),
    // TabSet
    TABSET("TabSet");

    final String value;

    private SetupEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SetupEntityTypeEnum fromValue(String value) {
        for (SetupEntityTypeEnum e : SetupEntityTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
