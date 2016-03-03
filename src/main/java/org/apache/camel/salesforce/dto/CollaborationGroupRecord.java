/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CollaborationGroupRecord
 */
@XStreamAlias("CollaborationGroupRecord")
public class CollaborationGroupRecord extends AbstractSObjectBase {

    // CollaborationGroupId
    private String CollaborationGroupId;

    @JsonProperty("CollaborationGroupId")
    public String getCollaborationGroupId() {
        return this.CollaborationGroupId;
    }

    @JsonProperty("CollaborationGroupId")
    public void setCollaborationGroupId(String CollaborationGroupId) {
        this.CollaborationGroupId = CollaborationGroupId;
    }

    // RecordId
    private String RecordId;

    @JsonProperty("RecordId")
    public String getRecordId() {
        return this.RecordId;
    }

    @JsonProperty("RecordId")
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

}
