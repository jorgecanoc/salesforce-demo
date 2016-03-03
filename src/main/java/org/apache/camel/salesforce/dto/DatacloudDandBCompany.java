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
 * Salesforce DTO for SObject DatacloudDandBCompany
 */
@XStreamAlias("DatacloudDandBCompany")
public class DatacloudDandBCompany extends AbstractSObjectBase {

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

    // DunsNumber
    private String DunsNumber;

    @JsonProperty("DunsNumber")
    public String getDunsNumber() {
        return this.DunsNumber;
    }

    @JsonProperty("DunsNumber")
    public void setDunsNumber(String DunsNumber) {
        this.DunsNumber = DunsNumber;
    }

    // CompanyId
    private String CompanyId;

    @JsonProperty("CompanyId")
    public String getCompanyId() {
        return this.CompanyId;
    }

    @JsonProperty("CompanyId")
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    // Street
    private String Street;

    @JsonProperty("Street")
    public String getStreet() {
        return this.Street;
    }

    @JsonProperty("Street")
    public void setStreet(String Street) {
        this.Street = Street;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // Zip
    private String Zip;

    @JsonProperty("Zip")
    public String getZip() {
        return this.Zip;
    }

    @JsonProperty("Zip")
    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // Fax
    private String Fax;

    @JsonProperty("Fax")
    public String getFax() {
        return this.Fax;
    }

    @JsonProperty("Fax")
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    // CountryAccessCode
    private String CountryAccessCode;

    @JsonProperty("CountryAccessCode")
    public String getCountryAccessCode() {
        return this.CountryAccessCode;
    }

    @JsonProperty("CountryAccessCode")
    public void setCountryAccessCode(String CountryAccessCode) {
        this.CountryAccessCode = CountryAccessCode;
    }

    // PublicIndicator
    @XStreamConverter(PicklistEnumConverter.class)
    private PublicIndicatorEnum PublicIndicator;

    @JsonProperty("PublicIndicator")
    public PublicIndicatorEnum getPublicIndicator() {
        return this.PublicIndicator;
    }

    @JsonProperty("PublicIndicator")
    public void setPublicIndicator(PublicIndicatorEnum PublicIndicator) {
        this.PublicIndicator = PublicIndicator;
    }

    // StockSymbol
    private String StockSymbol;

    @JsonProperty("StockSymbol")
    public String getStockSymbol() {
        return this.StockSymbol;
    }

    @JsonProperty("StockSymbol")
    public void setStockSymbol(String StockSymbol) {
        this.StockSymbol = StockSymbol;
    }

    // StockExchange
    private String StockExchange;

    @JsonProperty("StockExchange")
    public String getStockExchange() {
        return this.StockExchange;
    }

    @JsonProperty("StockExchange")
    public void setStockExchange(String StockExchange) {
        this.StockExchange = StockExchange;
    }

    // SalesVolume
    private Double SalesVolume;

    @JsonProperty("SalesVolume")
    public Double getSalesVolume() {
        return this.SalesVolume;
    }

    @JsonProperty("SalesVolume")
    public void setSalesVolume(Double SalesVolume) {
        this.SalesVolume = SalesVolume;
    }

    // URL
    private String URL;

    @JsonProperty("URL")
    public String getURL() {
        return this.URL;
    }

    @JsonProperty("URL")
    public void setURL(String URL) {
        this.URL = URL;
    }

    // OutOfBusiness
    @XStreamConverter(PicklistEnumConverter.class)
    private OutOfBusinessEnum OutOfBusiness;

    @JsonProperty("OutOfBusiness")
    public OutOfBusinessEnum getOutOfBusiness() {
        return this.OutOfBusiness;
    }

    @JsonProperty("OutOfBusiness")
    public void setOutOfBusiness(OutOfBusinessEnum OutOfBusiness) {
        this.OutOfBusiness = OutOfBusiness;
    }

    // EmployeesTotal
    private Double EmployeesTotal;

    @JsonProperty("EmployeesTotal")
    public Double getEmployeesTotal() {
        return this.EmployeesTotal;
    }

    @JsonProperty("EmployeesTotal")
    public void setEmployeesTotal(Double EmployeesTotal) {
        this.EmployeesTotal = EmployeesTotal;
    }

    // FipsMsaCode
    private String FipsMsaCode;

    @JsonProperty("FipsMsaCode")
    public String getFipsMsaCode() {
        return this.FipsMsaCode;
    }

    @JsonProperty("FipsMsaCode")
    public void setFipsMsaCode(String FipsMsaCode) {
        this.FipsMsaCode = FipsMsaCode;
    }

    // FipsMsaDesc
    private String FipsMsaDesc;

    @JsonProperty("FipsMsaDesc")
    public String getFipsMsaDesc() {
        return this.FipsMsaDesc;
    }

    @JsonProperty("FipsMsaDesc")
    public void setFipsMsaDesc(String FipsMsaDesc) {
        this.FipsMsaDesc = FipsMsaDesc;
    }

    // TradeStyle1
    private String TradeStyle1;

    @JsonProperty("TradeStyle1")
    public String getTradeStyle1() {
        return this.TradeStyle1;
    }

    @JsonProperty("TradeStyle1")
    public void setTradeStyle1(String TradeStyle1) {
        this.TradeStyle1 = TradeStyle1;
    }

    // YearStarted
    private String YearStarted;

    @JsonProperty("YearStarted")
    public String getYearStarted() {
        return this.YearStarted;
    }

    @JsonProperty("YearStarted")
    public void setYearStarted(String YearStarted) {
        this.YearStarted = YearStarted;
    }

    // MailingStreet
    private String MailingStreet;

    @JsonProperty("MailingStreet")
    public String getMailingStreet() {
        return this.MailingStreet;
    }

    @JsonProperty("MailingStreet")
    public void setMailingStreet(String MailingStreet) {
        this.MailingStreet = MailingStreet;
    }

    // MailingCity
    private String MailingCity;

    @JsonProperty("MailingCity")
    public String getMailingCity() {
        return this.MailingCity;
    }

    @JsonProperty("MailingCity")
    public void setMailingCity(String MailingCity) {
        this.MailingCity = MailingCity;
    }

    // MailingState
    private String MailingState;

    @JsonProperty("MailingState")
    public String getMailingState() {
        return this.MailingState;
    }

    @JsonProperty("MailingState")
    public void setMailingState(String MailingState) {
        this.MailingState = MailingState;
    }

    // MailingCountry
    private String MailingCountry;

    @JsonProperty("MailingCountry")
    public String getMailingCountry() {
        return this.MailingCountry;
    }

    @JsonProperty("MailingCountry")
    public void setMailingCountry(String MailingCountry) {
        this.MailingCountry = MailingCountry;
    }

    // MailingZip
    private String MailingZip;

    @JsonProperty("MailingZip")
    public String getMailingZip() {
        return this.MailingZip;
    }

    @JsonProperty("MailingZip")
    public void setMailingZip(String MailingZip) {
        this.MailingZip = MailingZip;
    }

    // Latitude
    private String Latitude;

    @JsonProperty("Latitude")
    public String getLatitude() {
        return this.Latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    // Longitude
    private String Longitude;

    @JsonProperty("Longitude")
    public String getLongitude() {
        return this.Longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    // PrimarySic
    private String PrimarySic;

    @JsonProperty("PrimarySic")
    public String getPrimarySic() {
        return this.PrimarySic;
    }

    @JsonProperty("PrimarySic")
    public void setPrimarySic(String PrimarySic) {
        this.PrimarySic = PrimarySic;
    }

    // PrimarySicDesc
    private String PrimarySicDesc;

    @JsonProperty("PrimarySicDesc")
    public String getPrimarySicDesc() {
        return this.PrimarySicDesc;
    }

    @JsonProperty("PrimarySicDesc")
    public void setPrimarySicDesc(String PrimarySicDesc) {
        this.PrimarySicDesc = PrimarySicDesc;
    }

    // SecondSic
    private String SecondSic;

    @JsonProperty("SecondSic")
    public String getSecondSic() {
        return this.SecondSic;
    }

    @JsonProperty("SecondSic")
    public void setSecondSic(String SecondSic) {
        this.SecondSic = SecondSic;
    }

    // SecondSicDesc
    private String SecondSicDesc;

    @JsonProperty("SecondSicDesc")
    public String getSecondSicDesc() {
        return this.SecondSicDesc;
    }

    @JsonProperty("SecondSicDesc")
    public void setSecondSicDesc(String SecondSicDesc) {
        this.SecondSicDesc = SecondSicDesc;
    }

    // ThirdSic
    private String ThirdSic;

    @JsonProperty("ThirdSic")
    public String getThirdSic() {
        return this.ThirdSic;
    }

    @JsonProperty("ThirdSic")
    public void setThirdSic(String ThirdSic) {
        this.ThirdSic = ThirdSic;
    }

    // ThirdSicDesc
    private String ThirdSicDesc;

    @JsonProperty("ThirdSicDesc")
    public String getThirdSicDesc() {
        return this.ThirdSicDesc;
    }

    @JsonProperty("ThirdSicDesc")
    public void setThirdSicDesc(String ThirdSicDesc) {
        this.ThirdSicDesc = ThirdSicDesc;
    }

    // FourthSic
    private String FourthSic;

    @JsonProperty("FourthSic")
    public String getFourthSic() {
        return this.FourthSic;
    }

    @JsonProperty("FourthSic")
    public void setFourthSic(String FourthSic) {
        this.FourthSic = FourthSic;
    }

    // FourthSicDesc
    private String FourthSicDesc;

    @JsonProperty("FourthSicDesc")
    public String getFourthSicDesc() {
        return this.FourthSicDesc;
    }

    @JsonProperty("FourthSicDesc")
    public void setFourthSicDesc(String FourthSicDesc) {
        this.FourthSicDesc = FourthSicDesc;
    }

    // FifthSic
    private String FifthSic;

    @JsonProperty("FifthSic")
    public String getFifthSic() {
        return this.FifthSic;
    }

    @JsonProperty("FifthSic")
    public void setFifthSic(String FifthSic) {
        this.FifthSic = FifthSic;
    }

    // FifthSicDesc
    private String FifthSicDesc;

    @JsonProperty("FifthSicDesc")
    public String getFifthSicDesc() {
        return this.FifthSicDesc;
    }

    @JsonProperty("FifthSicDesc")
    public void setFifthSicDesc(String FifthSicDesc) {
        this.FifthSicDesc = FifthSicDesc;
    }

    // SixthSic
    private String SixthSic;

    @JsonProperty("SixthSic")
    public String getSixthSic() {
        return this.SixthSic;
    }

    @JsonProperty("SixthSic")
    public void setSixthSic(String SixthSic) {
        this.SixthSic = SixthSic;
    }

    // SixthSicDesc
    private String SixthSicDesc;

    @JsonProperty("SixthSicDesc")
    public String getSixthSicDesc() {
        return this.SixthSicDesc;
    }

    @JsonProperty("SixthSicDesc")
    public void setSixthSicDesc(String SixthSicDesc) {
        this.SixthSicDesc = SixthSicDesc;
    }

    // PrimaryNaics
    private String PrimaryNaics;

    @JsonProperty("PrimaryNaics")
    public String getPrimaryNaics() {
        return this.PrimaryNaics;
    }

    @JsonProperty("PrimaryNaics")
    public void setPrimaryNaics(String PrimaryNaics) {
        this.PrimaryNaics = PrimaryNaics;
    }

    // PrimaryNaicsDesc
    private String PrimaryNaicsDesc;

    @JsonProperty("PrimaryNaicsDesc")
    public String getPrimaryNaicsDesc() {
        return this.PrimaryNaicsDesc;
    }

    @JsonProperty("PrimaryNaicsDesc")
    public void setPrimaryNaicsDesc(String PrimaryNaicsDesc) {
        this.PrimaryNaicsDesc = PrimaryNaicsDesc;
    }

    // SecondNaics
    private String SecondNaics;

    @JsonProperty("SecondNaics")
    public String getSecondNaics() {
        return this.SecondNaics;
    }

    @JsonProperty("SecondNaics")
    public void setSecondNaics(String SecondNaics) {
        this.SecondNaics = SecondNaics;
    }

    // SecondNaicsDesc
    private String SecondNaicsDesc;

    @JsonProperty("SecondNaicsDesc")
    public String getSecondNaicsDesc() {
        return this.SecondNaicsDesc;
    }

    @JsonProperty("SecondNaicsDesc")
    public void setSecondNaicsDesc(String SecondNaicsDesc) {
        this.SecondNaicsDesc = SecondNaicsDesc;
    }

    // ThirdNaics
    private String ThirdNaics;

    @JsonProperty("ThirdNaics")
    public String getThirdNaics() {
        return this.ThirdNaics;
    }

    @JsonProperty("ThirdNaics")
    public void setThirdNaics(String ThirdNaics) {
        this.ThirdNaics = ThirdNaics;
    }

    // ThirdNaicsDesc
    private String ThirdNaicsDesc;

    @JsonProperty("ThirdNaicsDesc")
    public String getThirdNaicsDesc() {
        return this.ThirdNaicsDesc;
    }

    @JsonProperty("ThirdNaicsDesc")
    public void setThirdNaicsDesc(String ThirdNaicsDesc) {
        this.ThirdNaicsDesc = ThirdNaicsDesc;
    }

    // FourthNaics
    private String FourthNaics;

    @JsonProperty("FourthNaics")
    public String getFourthNaics() {
        return this.FourthNaics;
    }

    @JsonProperty("FourthNaics")
    public void setFourthNaics(String FourthNaics) {
        this.FourthNaics = FourthNaics;
    }

    // FourthNaicsDesc
    private String FourthNaicsDesc;

    @JsonProperty("FourthNaicsDesc")
    public String getFourthNaicsDesc() {
        return this.FourthNaicsDesc;
    }

    @JsonProperty("FourthNaicsDesc")
    public void setFourthNaicsDesc(String FourthNaicsDesc) {
        this.FourthNaicsDesc = FourthNaicsDesc;
    }

    // FifthNaics
    private String FifthNaics;

    @JsonProperty("FifthNaics")
    public String getFifthNaics() {
        return this.FifthNaics;
    }

    @JsonProperty("FifthNaics")
    public void setFifthNaics(String FifthNaics) {
        this.FifthNaics = FifthNaics;
    }

    // FifthNaicsDesc
    private String FifthNaicsDesc;

    @JsonProperty("FifthNaicsDesc")
    public String getFifthNaicsDesc() {
        return this.FifthNaicsDesc;
    }

    @JsonProperty("FifthNaicsDesc")
    public void setFifthNaicsDesc(String FifthNaicsDesc) {
        this.FifthNaicsDesc = FifthNaicsDesc;
    }

    // SixthNaics
    private String SixthNaics;

    @JsonProperty("SixthNaics")
    public String getSixthNaics() {
        return this.SixthNaics;
    }

    @JsonProperty("SixthNaics")
    public void setSixthNaics(String SixthNaics) {
        this.SixthNaics = SixthNaics;
    }

    // SixthNaicsDesc
    private String SixthNaicsDesc;

    @JsonProperty("SixthNaicsDesc")
    public String getSixthNaicsDesc() {
        return this.SixthNaicsDesc;
    }

    @JsonProperty("SixthNaicsDesc")
    public void setSixthNaicsDesc(String SixthNaicsDesc) {
        this.SixthNaicsDesc = SixthNaicsDesc;
    }

    // OwnOrRent
    @XStreamConverter(PicklistEnumConverter.class)
    private OwnOrRentEnum OwnOrRent;

    @JsonProperty("OwnOrRent")
    public OwnOrRentEnum getOwnOrRent() {
        return this.OwnOrRent;
    }

    @JsonProperty("OwnOrRent")
    public void setOwnOrRent(OwnOrRentEnum OwnOrRent) {
        this.OwnOrRent = OwnOrRent;
    }

    // EmployeesHere
    private Double EmployeesHere;

    @JsonProperty("EmployeesHere")
    public Double getEmployeesHere() {
        return this.EmployeesHere;
    }

    @JsonProperty("EmployeesHere")
    public void setEmployeesHere(Double EmployeesHere) {
        this.EmployeesHere = EmployeesHere;
    }

    // EmployeesHereReliability
    @XStreamConverter(PicklistEnumConverter.class)
    private EmployeesHereReliabilityEnum EmployeesHereReliability;

    @JsonProperty("EmployeesHereReliability")
    public EmployeesHereReliabilityEnum getEmployeesHereReliability() {
        return this.EmployeesHereReliability;
    }

    @JsonProperty("EmployeesHereReliability")
    public void setEmployeesHereReliability(EmployeesHereReliabilityEnum EmployeesHereReliability) {
        this.EmployeesHereReliability = EmployeesHereReliability;
    }

    // SalesVolumeReliability
    @XStreamConverter(PicklistEnumConverter.class)
    private SalesVolumeReliabilityEnum SalesVolumeReliability;

    @JsonProperty("SalesVolumeReliability")
    public SalesVolumeReliabilityEnum getSalesVolumeReliability() {
        return this.SalesVolumeReliability;
    }

    @JsonProperty("SalesVolumeReliability")
    public void setSalesVolumeReliability(SalesVolumeReliabilityEnum SalesVolumeReliability) {
        this.SalesVolumeReliability = SalesVolumeReliability;
    }

    // CurrencyCode
    @XStreamConverter(PicklistEnumConverter.class)
    private CurrencyCodeEnum CurrencyCode;

    @JsonProperty("CurrencyCode")
    public CurrencyCodeEnum getCurrencyCode() {
        return this.CurrencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(CurrencyCodeEnum CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    // LegalStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private LegalStatusEnum LegalStatus;

    @JsonProperty("LegalStatus")
    public LegalStatusEnum getLegalStatus() {
        return this.LegalStatus;
    }

    @JsonProperty("LegalStatus")
    public void setLegalStatus(LegalStatusEnum LegalStatus) {
        this.LegalStatus = LegalStatus;
    }

    // GlobalUltimateTotalEmployees
    private Double GlobalUltimateTotalEmployees;

    @JsonProperty("GlobalUltimateTotalEmployees")
    public Double getGlobalUltimateTotalEmployees() {
        return this.GlobalUltimateTotalEmployees;
    }

    @JsonProperty("GlobalUltimateTotalEmployees")
    public void setGlobalUltimateTotalEmployees(Double GlobalUltimateTotalEmployees) {
        this.GlobalUltimateTotalEmployees = GlobalUltimateTotalEmployees;
    }

    // EmployeesTotalReliability
    @XStreamConverter(PicklistEnumConverter.class)
    private EmployeesTotalReliabilityEnum EmployeesTotalReliability;

    @JsonProperty("EmployeesTotalReliability")
    public EmployeesTotalReliabilityEnum getEmployeesTotalReliability() {
        return this.EmployeesTotalReliability;
    }

    @JsonProperty("EmployeesTotalReliability")
    public void setEmployeesTotalReliability(EmployeesTotalReliabilityEnum EmployeesTotalReliability) {
        this.EmployeesTotalReliability = EmployeesTotalReliability;
    }

    // MinorityOwned
    @XStreamConverter(PicklistEnumConverter.class)
    private MinorityOwnedEnum MinorityOwned;

    @JsonProperty("MinorityOwned")
    public MinorityOwnedEnum getMinorityOwned() {
        return this.MinorityOwned;
    }

    @JsonProperty("MinorityOwned")
    public void setMinorityOwned(MinorityOwnedEnum MinorityOwned) {
        this.MinorityOwned = MinorityOwned;
    }

    // WomenOwned
    @XStreamConverter(PicklistEnumConverter.class)
    private WomenOwnedEnum WomenOwned;

    @JsonProperty("WomenOwned")
    public WomenOwnedEnum getWomenOwned() {
        return this.WomenOwned;
    }

    @JsonProperty("WomenOwned")
    public void setWomenOwned(WomenOwnedEnum WomenOwned) {
        this.WomenOwned = WomenOwned;
    }

    // SmallBusiness
    @XStreamConverter(PicklistEnumConverter.class)
    private SmallBusinessEnum SmallBusiness;

    @JsonProperty("SmallBusiness")
    public SmallBusinessEnum getSmallBusiness() {
        return this.SmallBusiness;
    }

    @JsonProperty("SmallBusiness")
    public void setSmallBusiness(SmallBusinessEnum SmallBusiness) {
        this.SmallBusiness = SmallBusiness;
    }

    // MarketingSegmentationCluster
    @XStreamConverter(PicklistEnumConverter.class)
    private MarketingSegmentationClusterEnum MarketingSegmentationCluster;

    @JsonProperty("MarketingSegmentationCluster")
    public MarketingSegmentationClusterEnum getMarketingSegmentationCluster() {
        return this.MarketingSegmentationCluster;
    }

    @JsonProperty("MarketingSegmentationCluster")
    public void setMarketingSegmentationCluster(MarketingSegmentationClusterEnum MarketingSegmentationCluster) {
        this.MarketingSegmentationCluster = MarketingSegmentationCluster;
    }

    // ImportExportAgent
    @XStreamConverter(PicklistEnumConverter.class)
    private ImportExportAgentEnum ImportExportAgent;

    @JsonProperty("ImportExportAgent")
    public ImportExportAgentEnum getImportExportAgent() {
        return this.ImportExportAgent;
    }

    @JsonProperty("ImportExportAgent")
    public void setImportExportAgent(ImportExportAgentEnum ImportExportAgent) {
        this.ImportExportAgent = ImportExportAgent;
    }

    // Subsidiary
    @XStreamConverter(PicklistEnumConverter.class)
    private SubsidiaryEnum Subsidiary;

    @JsonProperty("Subsidiary")
    public SubsidiaryEnum getSubsidiary() {
        return this.Subsidiary;
    }

    @JsonProperty("Subsidiary")
    public void setSubsidiary(SubsidiaryEnum Subsidiary) {
        this.Subsidiary = Subsidiary;
    }

    // TradeStyle2
    private String TradeStyle2;

    @JsonProperty("TradeStyle2")
    public String getTradeStyle2() {
        return this.TradeStyle2;
    }

    @JsonProperty("TradeStyle2")
    public void setTradeStyle2(String TradeStyle2) {
        this.TradeStyle2 = TradeStyle2;
    }

    // TradeStyle3
    private String TradeStyle3;

    @JsonProperty("TradeStyle3")
    public String getTradeStyle3() {
        return this.TradeStyle3;
    }

    @JsonProperty("TradeStyle3")
    public void setTradeStyle3(String TradeStyle3) {
        this.TradeStyle3 = TradeStyle3;
    }

    // TradeStyle4
    private String TradeStyle4;

    @JsonProperty("TradeStyle4")
    public String getTradeStyle4() {
        return this.TradeStyle4;
    }

    @JsonProperty("TradeStyle4")
    public void setTradeStyle4(String TradeStyle4) {
        this.TradeStyle4 = TradeStyle4;
    }

    // TradeStyle5
    private String TradeStyle5;

    @JsonProperty("TradeStyle5")
    public String getTradeStyle5() {
        return this.TradeStyle5;
    }

    @JsonProperty("TradeStyle5")
    public void setTradeStyle5(String TradeStyle5) {
        this.TradeStyle5 = TradeStyle5;
    }

    // NationalId
    private String NationalId;

    @JsonProperty("NationalId")
    public String getNationalId() {
        return this.NationalId;
    }

    @JsonProperty("NationalId")
    public void setNationalId(String NationalId) {
        this.NationalId = NationalId;
    }

    // NationalIdType
    @XStreamConverter(PicklistEnumConverter.class)
    private NationalIdTypeEnum NationalIdType;

    @JsonProperty("NationalIdType")
    public NationalIdTypeEnum getNationalIdType() {
        return this.NationalIdType;
    }

    @JsonProperty("NationalIdType")
    public void setNationalIdType(NationalIdTypeEnum NationalIdType) {
        this.NationalIdType = NationalIdType;
    }

    // UsTaxId
    private String UsTaxId;

    @JsonProperty("UsTaxId")
    public String getUsTaxId() {
        return this.UsTaxId;
    }

    @JsonProperty("UsTaxId")
    public void setUsTaxId(String UsTaxId) {
        this.UsTaxId = UsTaxId;
    }

    // GeoCodeAccuracy
    @XStreamConverter(PicklistEnumConverter.class)
    private GeoCodeAccuracyEnum GeoCodeAccuracy;

    @JsonProperty("GeoCodeAccuracy")
    public GeoCodeAccuracyEnum getGeoCodeAccuracy() {
        return this.GeoCodeAccuracy;
    }

    @JsonProperty("GeoCodeAccuracy")
    public void setGeoCodeAccuracy(GeoCodeAccuracyEnum GeoCodeAccuracy) {
        this.GeoCodeAccuracy = GeoCodeAccuracy;
    }

    // FamilyMembers
    private Integer FamilyMembers;

    @JsonProperty("FamilyMembers")
    public Integer getFamilyMembers() {
        return this.FamilyMembers;
    }

    @JsonProperty("FamilyMembers")
    public void setFamilyMembers(Integer FamilyMembers) {
        this.FamilyMembers = FamilyMembers;
    }

    // MarketingPreScreen
    @XStreamConverter(PicklistEnumConverter.class)
    private MarketingPreScreenEnum MarketingPreScreen;

    @JsonProperty("MarketingPreScreen")
    public MarketingPreScreenEnum getMarketingPreScreen() {
        return this.MarketingPreScreen;
    }

    @JsonProperty("MarketingPreScreen")
    public void setMarketingPreScreen(MarketingPreScreenEnum MarketingPreScreen) {
        this.MarketingPreScreen = MarketingPreScreen;
    }

    // GlobalUltimateDunsNumber
    private String GlobalUltimateDunsNumber;

    @JsonProperty("GlobalUltimateDunsNumber")
    public String getGlobalUltimateDunsNumber() {
        return this.GlobalUltimateDunsNumber;
    }

    @JsonProperty("GlobalUltimateDunsNumber")
    public void setGlobalUltimateDunsNumber(String GlobalUltimateDunsNumber) {
        this.GlobalUltimateDunsNumber = GlobalUltimateDunsNumber;
    }

    // GlobalUltimateBusinessName
    private String GlobalUltimateBusinessName;

    @JsonProperty("GlobalUltimateBusinessName")
    public String getGlobalUltimateBusinessName() {
        return this.GlobalUltimateBusinessName;
    }

    @JsonProperty("GlobalUltimateBusinessName")
    public void setGlobalUltimateBusinessName(String GlobalUltimateBusinessName) {
        this.GlobalUltimateBusinessName = GlobalUltimateBusinessName;
    }

    // ParentOrHqDunsNumber
    private String ParentOrHqDunsNumber;

    @JsonProperty("ParentOrHqDunsNumber")
    public String getParentOrHqDunsNumber() {
        return this.ParentOrHqDunsNumber;
    }

    @JsonProperty("ParentOrHqDunsNumber")
    public void setParentOrHqDunsNumber(String ParentOrHqDunsNumber) {
        this.ParentOrHqDunsNumber = ParentOrHqDunsNumber;
    }

    // ParentOrHqBusinessName
    private String ParentOrHqBusinessName;

    @JsonProperty("ParentOrHqBusinessName")
    public String getParentOrHqBusinessName() {
        return this.ParentOrHqBusinessName;
    }

    @JsonProperty("ParentOrHqBusinessName")
    public void setParentOrHqBusinessName(String ParentOrHqBusinessName) {
        this.ParentOrHqBusinessName = ParentOrHqBusinessName;
    }

    // DomesticUltimateDunsNumber
    private String DomesticUltimateDunsNumber;

    @JsonProperty("DomesticUltimateDunsNumber")
    public String getDomesticUltimateDunsNumber() {
        return this.DomesticUltimateDunsNumber;
    }

    @JsonProperty("DomesticUltimateDunsNumber")
    public void setDomesticUltimateDunsNumber(String DomesticUltimateDunsNumber) {
        this.DomesticUltimateDunsNumber = DomesticUltimateDunsNumber;
    }

    // DomesticUltimateBusinessName
    private String DomesticUltimateBusinessName;

    @JsonProperty("DomesticUltimateBusinessName")
    public String getDomesticUltimateBusinessName() {
        return this.DomesticUltimateBusinessName;
    }

    @JsonProperty("DomesticUltimateBusinessName")
    public void setDomesticUltimateBusinessName(String DomesticUltimateBusinessName) {
        this.DomesticUltimateBusinessName = DomesticUltimateBusinessName;
    }

    // LocationStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private LocationStatusEnum LocationStatus;

    @JsonProperty("LocationStatus")
    public LocationStatusEnum getLocationStatus() {
        return this.LocationStatus;
    }

    @JsonProperty("LocationStatus")
    public void setLocationStatus(LocationStatusEnum LocationStatus) {
        this.LocationStatus = LocationStatus;
    }

    // CompanyCurrencyIsoCode
    @XStreamConverter(PicklistEnumConverter.class)
    private CompanyCurrencyIsoCodeEnum CompanyCurrencyIsoCode;

    @JsonProperty("CompanyCurrencyIsoCode")
    public CompanyCurrencyIsoCodeEnum getCompanyCurrencyIsoCode() {
        return this.CompanyCurrencyIsoCode;
    }

    @JsonProperty("CompanyCurrencyIsoCode")
    public void setCompanyCurrencyIsoCode(CompanyCurrencyIsoCodeEnum CompanyCurrencyIsoCode) {
        this.CompanyCurrencyIsoCode = CompanyCurrencyIsoCode;
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

    // IsOwned
    private Boolean IsOwned;

    @JsonProperty("IsOwned")
    public Boolean getIsOwned() {
        return this.IsOwned;
    }

    @JsonProperty("IsOwned")
    public void setIsOwned(Boolean IsOwned) {
        this.IsOwned = IsOwned;
    }

    // IsParent
    private Boolean IsParent;

    @JsonProperty("IsParent")
    public Boolean getIsParent() {
        return this.IsParent;
    }

    @JsonProperty("IsParent")
    public void setIsParent(Boolean IsParent) {
        this.IsParent = IsParent;
    }

}