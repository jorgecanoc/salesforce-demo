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
 * Salesforce DTO for SObject OrderShare
 */
@XStreamAlias("OrderShare")
public class OrderShare extends AbstractSObjectBase {

    // OrderId
    private String OrderId;

    @JsonProperty("OrderId")
    public String getOrderId() {
        return this.OrderId;
    }

    @JsonProperty("OrderId")
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
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

    // OrderAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private OrderAccessLevelEnum OrderAccessLevel;

    @JsonProperty("OrderAccessLevel")
    public OrderAccessLevelEnum getOrderAccessLevel() {
        return this.OrderAccessLevel;
    }

    @JsonProperty("OrderAccessLevel")
    public void setOrderAccessLevel(OrderAccessLevelEnum OrderAccessLevel) {
        this.OrderAccessLevel = OrderAccessLevel;
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
