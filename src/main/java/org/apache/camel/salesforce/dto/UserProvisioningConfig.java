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
 * Salesforce DTO for SObject UserProvisioningConfig
 */
@XStreamAlias("UserProvisioningConfig")
public class UserProvisioningConfig extends AbstractSObjectBase {

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

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageEnum Language;

    @JsonProperty("Language")
    public LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(LanguageEnum Language) {
        this.Language = Language;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // ConnectedAppId
    private String ConnectedAppId;

    @JsonProperty("ConnectedAppId")
    public String getConnectedAppId() {
        return this.ConnectedAppId;
    }

    @JsonProperty("ConnectedAppId")
    public void setConnectedAppId(String ConnectedAppId) {
        this.ConnectedAppId = ConnectedAppId;
    }

    // Notes
    private String Notes;

    @JsonProperty("Notes")
    public String getNotes() {
        return this.Notes;
    }

    @JsonProperty("Notes")
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    // Enabled
    private Boolean Enabled;

    @JsonProperty("Enabled")
    public Boolean getEnabled() {
        return this.Enabled;
    }

    @JsonProperty("Enabled")
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    // ApprovalRequired
    private String ApprovalRequired;

    @JsonProperty("ApprovalRequired")
    public String getApprovalRequired() {
        return this.ApprovalRequired;
    }

    @JsonProperty("ApprovalRequired")
    public void setApprovalRequired(String ApprovalRequired) {
        this.ApprovalRequired = ApprovalRequired;
    }

    // UserAccountMapping
    private String UserAccountMapping;

    @JsonProperty("UserAccountMapping")
    public String getUserAccountMapping() {
        return this.UserAccountMapping;
    }

    @JsonProperty("UserAccountMapping")
    public void setUserAccountMapping(String UserAccountMapping) {
        this.UserAccountMapping = UserAccountMapping;
    }

    // EnabledOperations
    private String EnabledOperations;

    @JsonProperty("EnabledOperations")
    public String getEnabledOperations() {
        return this.EnabledOperations;
    }

    @JsonProperty("EnabledOperations")
    public void setEnabledOperations(String EnabledOperations) {
        this.EnabledOperations = EnabledOperations;
    }

    // OnUpdateAttributes
    private String OnUpdateAttributes;

    @JsonProperty("OnUpdateAttributes")
    public String getOnUpdateAttributes() {
        return this.OnUpdateAttributes;
    }

    @JsonProperty("OnUpdateAttributes")
    public void setOnUpdateAttributes(String OnUpdateAttributes) {
        this.OnUpdateAttributes = OnUpdateAttributes;
    }

    // LastReconDateTime
    private org.joda.time.DateTime LastReconDateTime;

    @JsonProperty("LastReconDateTime")
    public org.joda.time.DateTime getLastReconDateTime() {
        return this.LastReconDateTime;
    }

    @JsonProperty("LastReconDateTime")
    public void setLastReconDateTime(org.joda.time.DateTime LastReconDateTime) {
        this.LastReconDateTime = LastReconDateTime;
    }

    // NamedCredentialId
    private String NamedCredentialId;

    @JsonProperty("NamedCredentialId")
    public String getNamedCredentialId() {
        return this.NamedCredentialId;
    }

    @JsonProperty("NamedCredentialId")
    public void setNamedCredentialId(String NamedCredentialId) {
        this.NamedCredentialId = NamedCredentialId;
    }

    // ReconFilter
    private String ReconFilter;

    @JsonProperty("ReconFilter")
    public String getReconFilter() {
        return this.ReconFilter;
    }

    @JsonProperty("ReconFilter")
    public void setReconFilter(String ReconFilter) {
        this.ReconFilter = ReconFilter;
    }

}
