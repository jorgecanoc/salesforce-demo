/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject UserProvisioningLog
 */
@XStreamAlias("UserProvisioningLog")
public class UserProvisioningLog extends AbstractSObjectBase {

    // UserProvisioningRequestId
    private String UserProvisioningRequestId;

    @JsonProperty("UserProvisioningRequestId")
    public String getUserProvisioningRequestId() {
        return this.UserProvisioningRequestId;
    }

    @JsonProperty("UserProvisioningRequestId")
    public void setUserProvisioningRequestId(String UserProvisioningRequestId) {
        this.UserProvisioningRequestId = UserProvisioningRequestId;
    }

    // ExternalUserId
    private String ExternalUserId;

    @JsonProperty("ExternalUserId")
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    @JsonProperty("ExternalUserId")
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    // ExternalUsername
    private String ExternalUsername;

    @JsonProperty("ExternalUsername")
    public String getExternalUsername() {
        return this.ExternalUsername;
    }

    @JsonProperty("ExternalUsername")
    public void setExternalUsername(String ExternalUsername) {
        this.ExternalUsername = ExternalUsername;
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

    // Status
    private String Status;

    @JsonProperty("Status")
    public String getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(String Status) {
        this.Status = Status;
    }

    // Details
    private String Details;

    @JsonProperty("Details")
    public String getDetails() {
        return this.Details;
    }

    @JsonProperty("Details")
    public void setDetails(String Details) {
        this.Details = Details;
    }

}
