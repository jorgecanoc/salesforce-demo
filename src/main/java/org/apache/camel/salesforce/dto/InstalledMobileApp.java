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
 * Salesforce DTO for SObject InstalledMobileApp
 */
@XStreamAlias("InstalledMobileApp")
public class InstalledMobileApp extends AbstractSObjectBase {

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

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // ConnectedApplicationId
    private String ConnectedApplicationId;

    @JsonProperty("ConnectedApplicationId")
    public String getConnectedApplicationId() {
        return this.ConnectedApplicationId;
    }

    @JsonProperty("ConnectedApplicationId")
    public void setConnectedApplicationId(String ConnectedApplicationId) {
        this.ConnectedApplicationId = ConnectedApplicationId;
    }

    // Version
    private String Version;

    @JsonProperty("Version")
    public String getVersion() {
        return this.Version;
    }

    @JsonProperty("Version")
    public void setVersion(String Version) {
        this.Version = Version;
    }

}