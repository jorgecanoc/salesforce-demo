/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type HashtagDefinition
 */
public class QueryRecordsHashtagDefinition extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<HashtagDefinition> records;

    public List<HashtagDefinition> getRecords() {
        return records;
    }

    public void setRecords(List<HashtagDefinition> records) {
        this.records = records;
    }
}
