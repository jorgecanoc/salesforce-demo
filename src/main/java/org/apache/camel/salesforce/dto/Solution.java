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
 * Salesforce DTO for SObject Solution
 */
@XStreamAlias("Solution")
public class Solution extends AbstractSObjectBase {

    // SolutionNumber
    private String SolutionNumber;

    @JsonProperty("SolutionNumber")
    public String getSolutionNumber() {
        return this.SolutionNumber;
    }

    @JsonProperty("SolutionNumber")
    public void setSolutionNumber(String SolutionNumber) {
        this.SolutionNumber = SolutionNumber;
    }

    // SolutionName
    private String SolutionName;

    @JsonProperty("SolutionName")
    public String getSolutionName() {
        return this.SolutionName;
    }

    @JsonProperty("SolutionName")
    public void setSolutionName(String SolutionName) {
        this.SolutionName = SolutionName;
    }

    // IsPublished
    private Boolean IsPublished;

    @JsonProperty("IsPublished")
    public Boolean getIsPublished() {
        return this.IsPublished;
    }

    @JsonProperty("IsPublished")
    public void setIsPublished(Boolean IsPublished) {
        this.IsPublished = IsPublished;
    }

    // IsPublishedInPublicKb
    private Boolean IsPublishedInPublicKb;

    @JsonProperty("IsPublishedInPublicKb")
    public Boolean getIsPublishedInPublicKb() {
        return this.IsPublishedInPublicKb;
    }

    @JsonProperty("IsPublishedInPublicKb")
    public void setIsPublishedInPublicKb(Boolean IsPublishedInPublicKb) {
        this.IsPublishedInPublicKb = IsPublishedInPublicKb;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // IsReviewed
    private Boolean IsReviewed;

    @JsonProperty("IsReviewed")
    public Boolean getIsReviewed() {
        return this.IsReviewed;
    }

    @JsonProperty("IsReviewed")
    public void setIsReviewed(Boolean IsReviewed) {
        this.IsReviewed = IsReviewed;
    }

    // SolutionNote
    private String SolutionNote;

    @JsonProperty("SolutionNote")
    public String getSolutionNote() {
        return this.SolutionNote;
    }

    @JsonProperty("SolutionNote")
    public void setSolutionNote(String SolutionNote) {
        this.SolutionNote = SolutionNote;
    }

    // TimesUsed
    private Integer TimesUsed;

    @JsonProperty("TimesUsed")
    public Integer getTimesUsed() {
        return this.TimesUsed;
    }

    @JsonProperty("TimesUsed")
    public void setTimesUsed(Integer TimesUsed) {
        this.TimesUsed = TimesUsed;
    }

    // IsHtml
    private Boolean IsHtml;

    @JsonProperty("IsHtml")
    public Boolean getIsHtml() {
        return this.IsHtml;
    }

    @JsonProperty("IsHtml")
    public void setIsHtml(Boolean IsHtml) {
        this.IsHtml = IsHtml;
    }

}
