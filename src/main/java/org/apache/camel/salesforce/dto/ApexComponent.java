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
 * Salesforce DTO for SObject ApexComponent
 */
@XStreamAlias("ApexComponent")
public class ApexComponent extends AbstractSObjectBase {

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

    // ApiVersion
    private Double ApiVersion;

    @JsonProperty("ApiVersion")
    public Double getApiVersion() {
        return this.ApiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(Double ApiVersion) {
        this.ApiVersion = ApiVersion;
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

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // ControllerType
    @XStreamConverter(PicklistEnumConverter.class)
    private ControllerTypeEnum ControllerType;

    @JsonProperty("ControllerType")
    public ControllerTypeEnum getControllerType() {
        return this.ControllerType;
    }

    @JsonProperty("ControllerType")
    public void setControllerType(ControllerTypeEnum ControllerType) {
        this.ControllerType = ControllerType;
    }

    // ControllerKey
    private String ControllerKey;

    @JsonProperty("ControllerKey")
    public String getControllerKey() {
        return this.ControllerKey;
    }

    @JsonProperty("ControllerKey")
    public void setControllerKey(String ControllerKey) {
        this.ControllerKey = ControllerKey;
    }

    // Markup
    private String Markup;

    @JsonProperty("Markup")
    public String getMarkup() {
        return this.Markup;
    }

    @JsonProperty("Markup")
    public void setMarkup(String Markup) {
        this.Markup = Markup;
    }

}
