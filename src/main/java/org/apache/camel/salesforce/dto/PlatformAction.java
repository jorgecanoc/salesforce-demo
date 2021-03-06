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
 * Salesforce DTO for SObject PlatformAction
 */
@XStreamAlias("PlatformAction")
public class PlatformAction extends AbstractSObjectBase {

    // ExternalId
    private String ExternalId;

    @JsonProperty("ExternalId")
    public String getExternalId() {
        return this.ExternalId;
    }

    @JsonProperty("ExternalId")
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    // Label
    private String Label;

    @JsonProperty("Label")
    public String getLabel() {
        return this.Label;
    }

    @JsonProperty("Label")
    public void setLabel(String Label) {
        this.Label = Label;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
    }

    // Subtype
    private String Subtype;

    @JsonProperty("Subtype")
    public String getSubtype() {
        return this.Subtype;
    }

    @JsonProperty("Subtype")
    public void setSubtype(String Subtype) {
        this.Subtype = Subtype;
    }

    // ApiName
    private String ApiName;

    @JsonProperty("ApiName")
    public String getApiName() {
        return this.ApiName;
    }

    @JsonProperty("ApiName")
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    // ActionTargetUrl
    private String ActionTargetUrl;

    @JsonProperty("ActionTargetUrl")
    public String getActionTargetUrl() {
        return this.ActionTargetUrl;
    }

    @JsonProperty("ActionTargetUrl")
    public void setActionTargetUrl(String ActionTargetUrl) {
        this.ActionTargetUrl = ActionTargetUrl;
    }

    // ActionTargetType
    @XStreamConverter(PicklistEnumConverter.class)
    private ActionTargetTypeEnum ActionTargetType;

    @JsonProperty("ActionTargetType")
    public ActionTargetTypeEnum getActionTargetType() {
        return this.ActionTargetType;
    }

    @JsonProperty("ActionTargetType")
    public void setActionTargetType(ActionTargetTypeEnum ActionTargetType) {
        this.ActionTargetType = ActionTargetType;
    }

    // ConfirmationMessage
    private String ConfirmationMessage;

    @JsonProperty("ConfirmationMessage")
    public String getConfirmationMessage() {
        return this.ConfirmationMessage;
    }

    @JsonProperty("ConfirmationMessage")
    public void setConfirmationMessage(String ConfirmationMessage) {
        this.ConfirmationMessage = ConfirmationMessage;
    }

    // GroupId
    private String GroupId;

    @JsonProperty("GroupId")
    public String getGroupId() {
        return this.GroupId;
    }

    @JsonProperty("GroupId")
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    // IsGroupDefault
    private Boolean IsGroupDefault;

    @JsonProperty("IsGroupDefault")
    public Boolean getIsGroupDefault() {
        return this.IsGroupDefault;
    }

    @JsonProperty("IsGroupDefault")
    public void setIsGroupDefault(Boolean IsGroupDefault) {
        this.IsGroupDefault = IsGroupDefault;
    }

    // Category
    @XStreamConverter(PicklistEnumConverter.class)
    private CategoryEnum Category;

    @JsonProperty("Category")
    public CategoryEnum getCategory() {
        return this.Category;
    }

    @JsonProperty("Category")
    public void setCategory(CategoryEnum Category) {
        this.Category = Category;
    }

    // InvocationStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private InvocationStatusEnum InvocationStatus;

    @JsonProperty("InvocationStatus")
    public InvocationStatusEnum getInvocationStatus() {
        return this.InvocationStatus;
    }

    @JsonProperty("InvocationStatus")
    public void setInvocationStatus(InvocationStatusEnum InvocationStatus) {
        this.InvocationStatus = InvocationStatus;
    }

    // InvokedByUserId
    private String InvokedByUserId;

    @JsonProperty("InvokedByUserId")
    public String getInvokedByUserId() {
        return this.InvokedByUserId;
    }

    @JsonProperty("InvokedByUserId")
    public void setInvokedByUserId(String InvokedByUserId) {
        this.InvokedByUserId = InvokedByUserId;
    }

    // SourceEntity
    private String SourceEntity;

    @JsonProperty("SourceEntity")
    public String getSourceEntity() {
        return this.SourceEntity;
    }

    @JsonProperty("SourceEntity")
    public void setSourceEntity(String SourceEntity) {
        this.SourceEntity = SourceEntity;
    }

    // ActionListContext
    @XStreamConverter(PicklistEnumConverter.class)
    private ActionListContextEnum ActionListContext;

    @JsonProperty("ActionListContext")
    public ActionListContextEnum getActionListContext() {
        return this.ActionListContext;
    }

    @JsonProperty("ActionListContext")
    public void setActionListContext(ActionListContextEnum ActionListContext) {
        this.ActionListContext = ActionListContext;
    }

    // DeviceFormat
    @XStreamConverter(PicklistEnumConverter.class)
    private DeviceFormatEnum DeviceFormat;

    @JsonProperty("DeviceFormat")
    public DeviceFormatEnum getDeviceFormat() {
        return this.DeviceFormat;
    }

    @JsonProperty("DeviceFormat")
    public void setDeviceFormat(DeviceFormatEnum DeviceFormat) {
        this.DeviceFormat = DeviceFormat;
    }

    // IconContentType
    private String IconContentType;

    @JsonProperty("IconContentType")
    public String getIconContentType() {
        return this.IconContentType;
    }

    @JsonProperty("IconContentType")
    public void setIconContentType(String IconContentType) {
        this.IconContentType = IconContentType;
    }

    // IconHeight
    private Integer IconHeight;

    @JsonProperty("IconHeight")
    public Integer getIconHeight() {
        return this.IconHeight;
    }

    @JsonProperty("IconHeight")
    public void setIconHeight(Integer IconHeight) {
        this.IconHeight = IconHeight;
    }

    // IconWidth
    private Integer IconWidth;

    @JsonProperty("IconWidth")
    public Integer getIconWidth() {
        return this.IconWidth;
    }

    @JsonProperty("IconWidth")
    public void setIconWidth(Integer IconWidth) {
        this.IconWidth = IconWidth;
    }

    // IconUrl
    private String IconUrl;

    @JsonProperty("IconUrl")
    public String getIconUrl() {
        return this.IconUrl;
    }

    @JsonProperty("IconUrl")
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    // PrimaryColor
    private String PrimaryColor;

    @JsonProperty("PrimaryColor")
    public String getPrimaryColor() {
        return this.PrimaryColor;
    }

    @JsonProperty("PrimaryColor")
    public void setPrimaryColor(String PrimaryColor) {
        this.PrimaryColor = PrimaryColor;
    }

    // RelatedSourceEntity
    private String RelatedSourceEntity;

    @JsonProperty("RelatedSourceEntity")
    public String getRelatedSourceEntity() {
        return this.RelatedSourceEntity;
    }

    @JsonProperty("RelatedSourceEntity")
    public void setRelatedSourceEntity(String RelatedSourceEntity) {
        this.RelatedSourceEntity = RelatedSourceEntity;
    }

}
