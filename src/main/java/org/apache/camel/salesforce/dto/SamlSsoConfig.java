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
 * Salesforce DTO for SObject SamlSsoConfig
 */
@XStreamAlias("SamlSsoConfig")
public class SamlSsoConfig extends AbstractSObjectBase {

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

    // Version
    @XStreamConverter(PicklistEnumConverter.class)
    private VersionEnum Version;

    @JsonProperty("Version")
    public VersionEnum getVersion() {
        return this.Version;
    }

    @JsonProperty("Version")
    public void setVersion(VersionEnum Version) {
        this.Version = Version;
    }

    // Issuer
    private String Issuer;

    @JsonProperty("Issuer")
    public String getIssuer() {
        return this.Issuer;
    }

    @JsonProperty("Issuer")
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    // OptionsSpInitBinding
    private Boolean OptionsSpInitBinding;

    @JsonProperty("OptionsSpInitBinding")
    public Boolean getOptionsSpInitBinding() {
        return this.OptionsSpInitBinding;
    }

    @JsonProperty("OptionsSpInitBinding")
    public void setOptionsSpInitBinding(Boolean OptionsSpInitBinding) {
        this.OptionsSpInitBinding = OptionsSpInitBinding;
    }

    // OptionsUserProvisioning
    private Boolean OptionsUserProvisioning;

    @JsonProperty("OptionsUserProvisioning")
    public Boolean getOptionsUserProvisioning() {
        return this.OptionsUserProvisioning;
    }

    @JsonProperty("OptionsUserProvisioning")
    public void setOptionsUserProvisioning(Boolean OptionsUserProvisioning) {
        this.OptionsUserProvisioning = OptionsUserProvisioning;
    }

    // AttributeFormat
    private String AttributeFormat;

    @JsonProperty("AttributeFormat")
    public String getAttributeFormat() {
        return this.AttributeFormat;
    }

    @JsonProperty("AttributeFormat")
    public void setAttributeFormat(String AttributeFormat) {
        this.AttributeFormat = AttributeFormat;
    }

    // AttributeName
    private String AttributeName;

    @JsonProperty("AttributeName")
    public String getAttributeName() {
        return this.AttributeName;
    }

    @JsonProperty("AttributeName")
    public void setAttributeName(String AttributeName) {
        this.AttributeName = AttributeName;
    }

    // Audience
    private String Audience;

    @JsonProperty("Audience")
    public String getAudience() {
        return this.Audience;
    }

    @JsonProperty("Audience")
    public void setAudience(String Audience) {
        this.Audience = Audience;
    }

    // IdentityMapping
    @XStreamConverter(PicklistEnumConverter.class)
    private IdentityMappingEnum IdentityMapping;

    @JsonProperty("IdentityMapping")
    public IdentityMappingEnum getIdentityMapping() {
        return this.IdentityMapping;
    }

    @JsonProperty("IdentityMapping")
    public void setIdentityMapping(IdentityMappingEnum IdentityMapping) {
        this.IdentityMapping = IdentityMapping;
    }

    // IdentityLocation
    @XStreamConverter(PicklistEnumConverter.class)
    private IdentityLocationEnum IdentityLocation;

    @JsonProperty("IdentityLocation")
    public IdentityLocationEnum getIdentityLocation() {
        return this.IdentityLocation;
    }

    @JsonProperty("IdentityLocation")
    public void setIdentityLocation(IdentityLocationEnum IdentityLocation) {
        this.IdentityLocation = IdentityLocation;
    }

    // SamlJitHandlerId
    private String SamlJitHandlerId;

    @JsonProperty("SamlJitHandlerId")
    public String getSamlJitHandlerId() {
        return this.SamlJitHandlerId;
    }

    @JsonProperty("SamlJitHandlerId")
    public void setSamlJitHandlerId(String SamlJitHandlerId) {
        this.SamlJitHandlerId = SamlJitHandlerId;
    }

    // ExecutionUserId
    private String ExecutionUserId;

    @JsonProperty("ExecutionUserId")
    public String getExecutionUserId() {
        return this.ExecutionUserId;
    }

    @JsonProperty("ExecutionUserId")
    public void setExecutionUserId(String ExecutionUserId) {
        this.ExecutionUserId = ExecutionUserId;
    }

    // LoginUrl
    private String LoginUrl;

    @JsonProperty("LoginUrl")
    public String getLoginUrl() {
        return this.LoginUrl;
    }

    @JsonProperty("LoginUrl")
    public void setLoginUrl(String LoginUrl) {
        this.LoginUrl = LoginUrl;
    }

    // LogoutUrl
    private String LogoutUrl;

    @JsonProperty("LogoutUrl")
    public String getLogoutUrl() {
        return this.LogoutUrl;
    }

    @JsonProperty("LogoutUrl")
    public void setLogoutUrl(String LogoutUrl) {
        this.LogoutUrl = LogoutUrl;
    }

    // ErrorUrl
    private String ErrorUrl;

    @JsonProperty("ErrorUrl")
    public String getErrorUrl() {
        return this.ErrorUrl;
    }

    @JsonProperty("ErrorUrl")
    public void setErrorUrl(String ErrorUrl) {
        this.ErrorUrl = ErrorUrl;
    }

    // ValidationCert
    private String ValidationCert;

    @JsonProperty("ValidationCert")
    public String getValidationCert() {
        return this.ValidationCert;
    }

    @JsonProperty("ValidationCert")
    public void setValidationCert(String ValidationCert) {
        this.ValidationCert = ValidationCert;
    }

    // RequestSignatureMethod
    @XStreamConverter(PicklistEnumConverter.class)
    private RequestSignatureMethodEnum RequestSignatureMethod;

    @JsonProperty("RequestSignatureMethod")
    public RequestSignatureMethodEnum getRequestSignatureMethod() {
        return this.RequestSignatureMethod;
    }

    @JsonProperty("RequestSignatureMethod")
    public void setRequestSignatureMethod(RequestSignatureMethodEnum RequestSignatureMethod) {
        this.RequestSignatureMethod = RequestSignatureMethod;
    }

}
