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
 * Salesforce DTO for SObject OrderHistory
 */
@XStreamAlias("OrderHistory")
public class OrderHistory extends AbstractSObjectBase {

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

    // Field
    @XStreamConverter(PicklistEnumConverter.class)
    private FieldEnum Field;

    @JsonProperty("Field")
    public FieldEnum getField() {
        return this.Field;
    }

    @JsonProperty("Field")
    public void setField(FieldEnum Field) {
        this.Field = Field;
    }

    // OldValue
    private String OldValue;

    @JsonProperty("OldValue")
    public String getOldValue() {
        return this.OldValue;
    }

    @JsonProperty("OldValue")
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    // NewValue
    private String NewValue;

    @JsonProperty("NewValue")
    public String getNewValue() {
        return this.NewValue;
    }

    @JsonProperty("NewValue")
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

}
