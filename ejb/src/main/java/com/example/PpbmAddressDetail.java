package com.example;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="PPBM_ADDRESS_DETAILS")
@NamedQuery(name="PpbmAddressDetail.findAll", query="SELECT p FROM PpbmAddressDetail p")
public class PpbmAddressDetail {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="PPBM_ADDRESS_DETAILS_ADDRESSDETAILID_GENERATOR", sequenceName="PPBM_ADDRESS_DETAIL_ID_SEQ",allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="PPBM_ADDRESS_DETAILS_ADDRESSDETAILID_GENERATOR")
    @Column(name="ADDRESS_DETAIL_ID", unique=true, nullable=false)
    private long addressDetailId;

    @Column(name="ADDRESS_LINE1", length=100)
    private String addressLine1;

    @Column(name="ADDRESS_LINE2", length=100)
    private String addressLine2;

    @Column(name="ADDRESS_LINE3", length=100)
    private String addressLine3;

    @Column(name="ADDRESS_LINE4", length=100)
    private String addressLine4;

    @Column(name="ADDRESS_TYPE", nullable=false)
    private BigDecimal addressType;

    @Column(name="ADDRESS_USE")
    private BigDecimal addressUse;

    @Column(name="COUNTRY_CODE", nullable=false, length=10)
    private String countryCode;

    @Column(name="CREATED_BY")
    private BigDecimal createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATION_DATE")
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_END_DATE")
    private Date effectiveEndDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_START_DATE")
    private Date effectiveStartDate;

    @Column(name="ENTITY_ID", nullable=false)
    private BigDecimal entityId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name="LAST_UPDATED_BY")
    private BigDecimal lastUpdatedBy;

    @Column(name="POSTAL_CODE", length=10)
    private String postalCode;

    @Column(name="PRIMARY_IND", length=1)
    private String primaryInd;

    @Column(name="SECURITY_GROUP_ID")
    private BigDecimal securityGroupId;

    public PpbmAddressDetail() {
    }

    public long getAddressDetailId() {
        return this.addressDetailId;
    }

    public void setAddressDetailId(long addressDetailId) {
        this.addressDetailId = addressDetailId;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return this.addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return this.addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public BigDecimal getAddressType() {
        return this.addressType;
    }

    public void setAddressType(BigDecimal addressType) {
        this.addressType = addressType;
    }

    public BigDecimal getAddressUse() {
        return this.addressUse;
    }

    public void setAddressUse(BigDecimal addressUse) {
        this.addressUse = addressUse;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public BigDecimal getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEffectiveEndDate() {
        return this.effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public Date getEffectiveStartDate() {
        return this.effectiveStartDate;
    }

    public void setEffectiveStartDate(Date effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public BigDecimal getEntityId() {
        return this.entityId;
    }

    public void setEntityId(BigDecimal entityId) {
        this.entityId = entityId;
    }

    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPrimaryInd() {
        return this.primaryInd;
    }

    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public BigDecimal getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(BigDecimal securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
}
