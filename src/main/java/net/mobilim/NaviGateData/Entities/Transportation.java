package net.mobilim.NaviGateData.Entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Transportation {
    private int id;
    private String statusCode;
    private String description;
    private String ratePortCharge;
    private String rateType;
    private String rateCode;
    private String rateName;
    private BigDecimal amount;
    private String type;
    private BigDecimal taxFreeAmount;
    private Integer guestMin;
    private Integer guestMax;
    private Timestamp insertDate;
    private Timestamp lastUpdateDate;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "STATUS_CODE")
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "RATE_PORT_CHARGE")
    public String getRatePortCharge() {
        return ratePortCharge;
    }

    public void setRatePortCharge(String ratePortCharge) {
        this.ratePortCharge = ratePortCharge;
    }

    @Basic
    @Column(name = "RATE_TYPE")
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @Basic
    @Column(name = "RATE_CODE")
    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    @Basic
    @Column(name = "RATE_NAME")
    public String getRateName() {
        return rateName;
    }

    public void setRateName(String rateName) {
        this.rateName = rateName;
    }

    @Basic
    @Column(name = "AMOUNT")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "TAX_FREE_AMOUNT")
    public BigDecimal getTaxFreeAmount() {
        return taxFreeAmount;
    }

    public void setTaxFreeAmount(BigDecimal taxFreeAmount) {
        this.taxFreeAmount = taxFreeAmount;
    }

    @Basic
    @Column(name = "GUEST_MIN")
    public Integer getGuestMin() {
        return guestMin;
    }

    public void setGuestMin(Integer guestMin) {
        this.guestMin = guestMin;
    }

    @Basic
    @Column(name = "GUEST_MAX")
    public Integer getGuestMax() {
        return guestMax;
    }

    public void setGuestMax(Integer guestMax) {
        this.guestMax = guestMax;
    }

    @Basic
    @Column(name = "INSERT_DATE")
    public Timestamp getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE")
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

}
