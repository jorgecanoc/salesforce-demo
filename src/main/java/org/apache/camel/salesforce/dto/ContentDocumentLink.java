/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject ContentDocumentLink
 */
@XStreamAlias("ContentDocumentLink")
public class ContentDocumentLink extends AbstractSObjectBase {

    // LinkedEntityId
    private String LinkedEntityId;

    @JsonProperty("LinkedEntityId")
    public String getLinkedEntityId() {
        return this.LinkedEntityId;
    }

    @JsonProperty("LinkedEntityId")
    public void setLinkedEntityId(String LinkedEntityId) {
        this.LinkedEntityId = LinkedEntityId;
    }

    // ContentDocumentId
    private String ContentDocumentId;

    @JsonProperty("ContentDocumentId")
    public String getContentDocumentId() {
        return this.ContentDocumentId;
    }

    @JsonProperty("ContentDocumentId")
    public void setContentDocumentId(String ContentDocumentId) {
        this.ContentDocumentId = ContentDocumentId;
    }

    // ShareType
    @XStreamConverter(PicklistEnumConverter.class)
    private ShareTypeEnum ShareType;

    @JsonProperty("ShareType")
    public ShareTypeEnum getShareType() {
        return this.ShareType;
    }

    @JsonProperty("ShareType")
    public void setShareType(ShareTypeEnum ShareType) {
        this.ShareType = ShareType;
    }

    // Visibility
    @XStreamConverter(PicklistEnumConverter.class)
    private VisibilityEnum Visibility;

    @JsonProperty("Visibility")
    public VisibilityEnum getVisibility() {
        return this.Visibility;
    }

    @JsonProperty("Visibility")
    public void setVisibility(VisibilityEnum Visibility) {
        this.Visibility = Visibility;
    }

}
