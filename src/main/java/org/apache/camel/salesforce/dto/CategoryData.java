/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CategoryData
 */
@XStreamAlias("CategoryData")
public class CategoryData extends AbstractSObjectBase {

    // CategoryNodeId
    private String CategoryNodeId;

    @JsonProperty("CategoryNodeId")
    public String getCategoryNodeId() {
        return this.CategoryNodeId;
    }

    @JsonProperty("CategoryNodeId")
    public void setCategoryNodeId(String CategoryNodeId) {
        this.CategoryNodeId = CategoryNodeId;
    }

    // RelatedSobjectId
    private String RelatedSobjectId;

    @JsonProperty("RelatedSobjectId")
    public String getRelatedSobjectId() {
        return this.RelatedSobjectId;
    }

    @JsonProperty("RelatedSobjectId")
    public void setRelatedSobjectId(String RelatedSobjectId) {
        this.RelatedSobjectId = RelatedSobjectId;
    }

}
