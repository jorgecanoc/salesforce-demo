/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ActionListContext
 */
public enum ActionListContextEnum {

    // Chatter
    CHATTER("Chatter"),
    // FeedElement
    FEEDELEMENT("FeedElement"),
    // Flexipage
    FLEXIPAGE("Flexipage"),
    // Global
    GLOBAL("Global"),
    // ListView
    LISTVIEW("ListView"),
    // ListViewRecord
    LISTVIEWRECORD("ListViewRecord"),
    // MruList
    MRULIST("MruList"),
    // MruRow
    MRUROW("MruRow"),
    // ObjectHomeChart
    OBJECTHOMECHART("ObjectHomeChart"),
    // Photo
    PHOTO("Photo"),
    // Record
    RECORD("Record"),
    // RecordEdit
    RECORDEDIT("RecordEdit"),
    // RelatedList
    RELATEDLIST("RelatedList"),
    // RelatedListRecord
    RELATEDLISTRECORD("RelatedListRecord");

    final String value;

    private ActionListContextEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ActionListContextEnum fromValue(String value) {
        for (ActionListContextEnum e : ActionListContextEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
