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
 * Salesforce DTO for SObject Dashboard
 */
@XStreamAlias("Dashboard")
public class Dashboard extends AbstractSObjectBase {

    // FolderId
    private String FolderId;

    @JsonProperty("FolderId")
    public String getFolderId() {
        return this.FolderId;
    }

    @JsonProperty("FolderId")
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

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

    // LeftSize
    @XStreamConverter(PicklistEnumConverter.class)
    private LeftSizeEnum LeftSize;

    @JsonProperty("LeftSize")
    public LeftSizeEnum getLeftSize() {
        return this.LeftSize;
    }

    @JsonProperty("LeftSize")
    public void setLeftSize(LeftSizeEnum LeftSize) {
        this.LeftSize = LeftSize;
    }

    // MiddleSize
    @XStreamConverter(PicklistEnumConverter.class)
    private MiddleSizeEnum MiddleSize;

    @JsonProperty("MiddleSize")
    public MiddleSizeEnum getMiddleSize() {
        return this.MiddleSize;
    }

    @JsonProperty("MiddleSize")
    public void setMiddleSize(MiddleSizeEnum MiddleSize) {
        this.MiddleSize = MiddleSize;
    }

    // RightSize
    @XStreamConverter(PicklistEnumConverter.class)
    private RightSizeEnum RightSize;

    @JsonProperty("RightSize")
    public RightSizeEnum getRightSize() {
        return this.RightSize;
    }

    @JsonProperty("RightSize")
    public void setRightSize(RightSizeEnum RightSize) {
        this.RightSize = RightSize;
    }

    // RunningUserId
    private String RunningUserId;

    @JsonProperty("RunningUserId")
    public String getRunningUserId() {
        return this.RunningUserId;
    }

    @JsonProperty("RunningUserId")
    public void setRunningUserId(String RunningUserId) {
        this.RunningUserId = RunningUserId;
    }

    // TitleColor
    private Integer TitleColor;

    @JsonProperty("TitleColor")
    public Integer getTitleColor() {
        return this.TitleColor;
    }

    @JsonProperty("TitleColor")
    public void setTitleColor(Integer TitleColor) {
        this.TitleColor = TitleColor;
    }

    // TitleSize
    private Integer TitleSize;

    @JsonProperty("TitleSize")
    public Integer getTitleSize() {
        return this.TitleSize;
    }

    @JsonProperty("TitleSize")
    public void setTitleSize(Integer TitleSize) {
        this.TitleSize = TitleSize;
    }

    // TextColor
    private Integer TextColor;

    @JsonProperty("TextColor")
    public Integer getTextColor() {
        return this.TextColor;
    }

    @JsonProperty("TextColor")
    public void setTextColor(Integer TextColor) {
        this.TextColor = TextColor;
    }

    // BackgroundStart
    private Integer BackgroundStart;

    @JsonProperty("BackgroundStart")
    public Integer getBackgroundStart() {
        return this.BackgroundStart;
    }

    @JsonProperty("BackgroundStart")
    public void setBackgroundStart(Integer BackgroundStart) {
        this.BackgroundStart = BackgroundStart;
    }

    // BackgroundEnd
    private Integer BackgroundEnd;

    @JsonProperty("BackgroundEnd")
    public Integer getBackgroundEnd() {
        return this.BackgroundEnd;
    }

    @JsonProperty("BackgroundEnd")
    public void setBackgroundEnd(Integer BackgroundEnd) {
        this.BackgroundEnd = BackgroundEnd;
    }

    // BackgroundDirection
    @XStreamConverter(PicklistEnumConverter.class)
    private BackgroundDirectionEnum BackgroundDirection;

    @JsonProperty("BackgroundDirection")
    public BackgroundDirectionEnum getBackgroundDirection() {
        return this.BackgroundDirection;
    }

    @JsonProperty("BackgroundDirection")
    public void setBackgroundDirection(BackgroundDirectionEnum BackgroundDirection) {
        this.BackgroundDirection = BackgroundDirection;
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

    // DashboardResultRefreshedDate
    private String DashboardResultRefreshedDate;

    @JsonProperty("DashboardResultRefreshedDate")
    public String getDashboardResultRefreshedDate() {
        return this.DashboardResultRefreshedDate;
    }

    @JsonProperty("DashboardResultRefreshedDate")
    public void setDashboardResultRefreshedDate(String DashboardResultRefreshedDate) {
        this.DashboardResultRefreshedDate = DashboardResultRefreshedDate;
    }

    // DashboardResultRunningUser
    private String DashboardResultRunningUser;

    @JsonProperty("DashboardResultRunningUser")
    public String getDashboardResultRunningUser() {
        return this.DashboardResultRunningUser;
    }

    @JsonProperty("DashboardResultRunningUser")
    public void setDashboardResultRunningUser(String DashboardResultRunningUser) {
        this.DashboardResultRunningUser = DashboardResultRunningUser;
    }

}
