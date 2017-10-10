package net.mobilim.NaviGateData.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORY")
public class Category extends BaseEntity {

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CABIN_STATUS")
    private String cabinStatus;

    @Column(name = "CABIN_TYPE")
    private String cabinType;

    @Column(name = "CABIN_SUB_TYPE")
    private String cabinSubType;

    @Column(name = "CABIN_SUB_TYPE_DESC")
    private String cabinSubTypeDesc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CABIN_LOCATION_ID")
    private CabinLocation cabinLocation;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CABIN_DECK_ID")
    private List<CabinDeck> cabinDeck;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private List<GuestType> guestTypes;

    public Category() {
        super();
        this.cabinDeck = new ArrayList<CabinDeck>();
        this.guestTypes = new ArrayList<GuestType>();
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCabinStatus() {
        return cabinStatus;
    }

    public void setCabinStatus(String cabinStatus) {
        this.cabinStatus = cabinStatus;
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public String getCabinSubType() {
        return cabinSubType;
    }

    public void setCabinSubType(String cabinSubType) {
        this.cabinSubType = cabinSubType;
    }

    public String getCabinSubTypeDesc() {
        return cabinSubTypeDesc;
    }

    public void setCabinSubTypeDesc(String cabinSubTypeDesc) {
        this.cabinSubTypeDesc = cabinSubTypeDesc;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CabinLocation getCabinLocation() {
        return cabinLocation;
    }

    public void setCabinLocation(CabinLocation cabinLocation) {
        this.cabinLocation = cabinLocation;
    }

    public List<CabinDeck> getCabinDeck() {
        return cabinDeck;
    }

    public void setCabinDeck(List<CabinDeck> cabinDeck) {
        this.cabinDeck = cabinDeck;
    }

    public List<GuestType> getGuestTypes() {
        return guestTypes;
    }

    public void setGuestTypes(List<GuestType> guestTypes) {
        this.guestTypes = guestTypes;
    }
}
