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
 * Salesforce DTO for SObject UserRole
 */
@XStreamAlias("UserRole")
public class UserRole extends AbstractSObjectBase {

    // ParentRoleId
    private String ParentRoleId;

    @JsonProperty("ParentRoleId")
    public String getParentRoleId() {
        return this.ParentRoleId;
    }

    @JsonProperty("ParentRoleId")
    public void setParentRoleId(String ParentRoleId) {
        this.ParentRoleId = ParentRoleId;
    }

    // RollupDescription
    private String RollupDescription;

    @JsonProperty("RollupDescription")
    public String getRollupDescription() {
        return this.RollupDescription;
    }

    @JsonProperty("RollupDescription")
    public void setRollupDescription(String RollupDescription) {
        this.RollupDescription = RollupDescription;
    }

    // OpportunityAccessForAccountOwner
    @XStreamConverter(PicklistEnumConverter.class)
    private OpportunityAccessForAccountOwnerEnum OpportunityAccessForAccountOwner;

    @JsonProperty("OpportunityAccessForAccountOwner")
    public OpportunityAccessForAccountOwnerEnum getOpportunityAccessForAccountOwner() {
        return this.OpportunityAccessForAccountOwner;
    }

    @JsonProperty("OpportunityAccessForAccountOwner")
    public void setOpportunityAccessForAccountOwner(OpportunityAccessForAccountOwnerEnum OpportunityAccessForAccountOwner) {
        this.OpportunityAccessForAccountOwner = OpportunityAccessForAccountOwner;
    }

    // CaseAccessForAccountOwner
    @XStreamConverter(PicklistEnumConverter.class)
    private CaseAccessForAccountOwnerEnum CaseAccessForAccountOwner;

    @JsonProperty("CaseAccessForAccountOwner")
    public CaseAccessForAccountOwnerEnum getCaseAccessForAccountOwner() {
        return this.CaseAccessForAccountOwner;
    }

    @JsonProperty("CaseAccessForAccountOwner")
    public void setCaseAccessForAccountOwner(CaseAccessForAccountOwnerEnum CaseAccessForAccountOwner) {
        this.CaseAccessForAccountOwner = CaseAccessForAccountOwner;
    }

    // ContactAccessForAccountOwner
    @XStreamConverter(PicklistEnumConverter.class)
    private ContactAccessForAccountOwnerEnum ContactAccessForAccountOwner;

    @JsonProperty("ContactAccessForAccountOwner")
    public ContactAccessForAccountOwnerEnum getContactAccessForAccountOwner() {
        return this.ContactAccessForAccountOwner;
    }

    @JsonProperty("ContactAccessForAccountOwner")
    public void setContactAccessForAccountOwner(ContactAccessForAccountOwnerEnum ContactAccessForAccountOwner) {
        this.ContactAccessForAccountOwner = ContactAccessForAccountOwner;
    }

    // ForecastUserId
    private String ForecastUserId;

    @JsonProperty("ForecastUserId")
    public String getForecastUserId() {
        return this.ForecastUserId;
    }

    @JsonProperty("ForecastUserId")
    public void setForecastUserId(String ForecastUserId) {
        this.ForecastUserId = ForecastUserId;
    }

    // MayForecastManagerShare
    private Boolean MayForecastManagerShare;

    @JsonProperty("MayForecastManagerShare")
    public Boolean getMayForecastManagerShare() {
        return this.MayForecastManagerShare;
    }

    @JsonProperty("MayForecastManagerShare")
    public void setMayForecastManagerShare(Boolean MayForecastManagerShare) {
        this.MayForecastManagerShare = MayForecastManagerShare;
    }

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // PortalAccountId
    private String PortalAccountId;

    @JsonProperty("PortalAccountId")
    public String getPortalAccountId() {
        return this.PortalAccountId;
    }

    @JsonProperty("PortalAccountId")
    public void setPortalAccountId(String PortalAccountId) {
        this.PortalAccountId = PortalAccountId;
    }

    // PortalType
    @XStreamConverter(PicklistEnumConverter.class)
    private PortalTypeEnum PortalType;

    @JsonProperty("PortalType")
    public PortalTypeEnum getPortalType() {
        return this.PortalType;
    }

    @JsonProperty("PortalType")
    public void setPortalType(PortalTypeEnum PortalType) {
        this.PortalType = PortalType;
    }

    // PortalAccountOwnerId
    private String PortalAccountOwnerId;

    @JsonProperty("PortalAccountOwnerId")
    public String getPortalAccountOwnerId() {
        return this.PortalAccountOwnerId;
    }

    @JsonProperty("PortalAccountOwnerId")
    public void setPortalAccountOwnerId(String PortalAccountOwnerId) {
        this.PortalAccountOwnerId = PortalAccountOwnerId;
    }

}
