/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 11 22:46:57 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject UserProvMockTarget
 */
@XStreamAlias("UserProvMockTarget")
public class UserProvMockTarget extends AbstractSObjectBase {

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

    // ExternalEmail
    private String ExternalEmail;

    @JsonProperty("ExternalEmail")
    public String getExternalEmail() {
        return this.ExternalEmail;
    }

    @JsonProperty("ExternalEmail")
    public void setExternalEmail(String ExternalEmail) {
        this.ExternalEmail = ExternalEmail;
    }

    // ExternalFirstName
    private String ExternalFirstName;

    @JsonProperty("ExternalFirstName")
    public String getExternalFirstName() {
        return this.ExternalFirstName;
    }

    @JsonProperty("ExternalFirstName")
    public void setExternalFirstName(String ExternalFirstName) {
        this.ExternalFirstName = ExternalFirstName;
    }

    // ExternalLastName
    private String ExternalLastName;

    @JsonProperty("ExternalLastName")
    public String getExternalLastName() {
        return this.ExternalLastName;
    }

    @JsonProperty("ExternalLastName")
    public void setExternalLastName(String ExternalLastName) {
        this.ExternalLastName = ExternalLastName;
    }

}
