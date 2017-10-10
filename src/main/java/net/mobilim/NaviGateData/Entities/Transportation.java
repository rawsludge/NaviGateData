package net.mobilim.NaviGateData.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TRANSPORTATION")
public class Transportation extends BaseEntity{

    @Column(name = "STATUS_CODE")
    private String statusCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RATE_PORT_CHARGE")
    private String ratePortCharge;

    @Column(name = "RATE_TYPE")
    private String rateType;

    @Column(name = "RATE_CODE")
    private String rateCode;

    @Column(name = "RATE_NAME")
    private String rateName;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "TAX_FREE_AMOUNT")
    private BigDecimal taxFreeAmount;

    @Column(name = "GUEST_MIN")
    private Integer guestMin;

    @Column(name = "GUEST_MAX")
    private Integer guestMax;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRatePortCharge() {
        return ratePortCharge;
    }

    public void setRatePortCharge(String ratePortCharge) {
        this.ratePortCharge = ratePortCharge;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getRateName() {
        return rateName;
    }

    public void setRateName(String rateName) {
        this.rateName = rateName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getTaxFreeAmount() {
        return taxFreeAmount;
    }

    public void setTaxFreeAmount(BigDecimal taxFreeAmount) {
        this.taxFreeAmount = taxFreeAmount;
    }

    public Integer getGuestMin() {
        return guestMin;
    }

    public void setGuestMin(Integer guestMin) {
        this.guestMin = guestMin;
    }

    public Integer getGuestMax() {
        return guestMax;
    }

    public void setGuestMax(Integer guestMax) {
        this.guestMax = guestMax;
    }
}
