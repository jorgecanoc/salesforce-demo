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
 * Salesforce DTO for SObject AccountShare
 */
@XStreamAlias("AccountShare")
public class AccountShare extends AbstractSObjectBase {

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // UserOrGroupId
    private String UserOrGroupId;

    @JsonProperty("UserOrGroupId")
    public String getUserOrGroupId() {
        return this.UserOrGroupId;
    }

    @JsonProperty("UserOrGroupId")
    public void setUserOrGroupId(String UserOrGroupId) {
        this.UserOrGroupId = UserOrGroupId;
    }

    // AccountAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private AccountAccessLevelEnum AccountAccessLevel;

    @JsonProperty("AccountAccessLevel")
    public AccountAccessLevelEnum getAccountAccessLevel() {
        return this.AccountAccessLevel;
    }

    @JsonProperty("AccountAccessLevel")
    public void setAccountAccessLevel(AccountAccessLevelEnum AccountAccessLevel) {
        this.AccountAccessLevel = AccountAccessLevel;
    }

    // OpportunityAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private OpportunityAccessLevelEnum OpportunityAccessLevel;

    @JsonProperty("OpportunityAccessLevel")
    public OpportunityAccessLevelEnum getOpportunityAccessLevel() {
        return this.OpportunityAccessLevel;
    }

    @JsonProperty("OpportunityAccessLevel")
    public void setOpportunityAccessLevel(OpportunityAccessLevelEnum OpportunityAccessLevel) {
        this.OpportunityAccessLevel = OpportunityAccessLevel;
    }

    // CaseAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private CaseAccessLevelEnum CaseAccessLevel;

    @JsonProperty("CaseAccessLevel")
    public CaseAccessLevelEnum getCaseAccessLevel() {
        return this.CaseAccessLevel;
    }

    @JsonProperty("CaseAccessLevel")
    public void setCaseAccessLevel(CaseAccessLevelEnum CaseAccessLevel) {
        this.CaseAccessLevel = CaseAccessLevel;
    }

    // ContactAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private ContactAccessLevelEnum ContactAccessLevel;

    @JsonProperty("ContactAccessLevel")
    public ContactAccessLevelEnum getContactAccessLevel() {
        return this.ContactAccessLevel;
    }

    @JsonProperty("ContactAccessLevel")
    public void setContactAccessLevel(ContactAccessLevelEnum ContactAccessLevel) {
        this.ContactAccessLevel = ContactAccessLevel;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }

}
