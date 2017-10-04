package net.mobilim.NaviGateData.Entities;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table( name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEST_ID")
    private Destination destination;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMBARK_PORT_ID")
    private Port embarkPort;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIP_ID")
    private Ship ship;

    @Column(name = "DURATION")
    private Integer duration;

    @Column(name = "SAILING_DATE")
    private Date sailingDate;

    @Column(name = "MAX_OCCUPANCY")
    private Integer maxOccupancy;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEBARK_PORT_ID")
    private Port debarkPort;

    @Column(name = "SAILING_ID")
    private String sailingID;

    @Column(name = "CRUISE_LINE_CODE")
    private String cruiseLineCode;

    @Column(name = "INSERT_DATE")
    private Date insertDate;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;


    public Product() {
        this.insertDate = new Date();
        this.lastUpdateDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Port getEmbarkPort() {
        return embarkPort;
    }

    public void setEmbarkPort(Port embarkPort) {
        this.embarkPort = embarkPort;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getSailingDate() {
        return sailingDate;
    }

    public void setSailingDate(Date sailingDate) {
        this.sailingDate = sailingDate;
    }

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Port getDebarkPort() {
        return debarkPort;
    }

    public void setDebarkPort(Port debarkPort) {
        this.debarkPort = debarkPort;
    }

    public String getSailingID() {
        return sailingID;
    }

    public void setSailingID(String sailingID) {
        this.sailingID = sailingID;
    }

    public String getCruiseLineCode() {
        return cruiseLineCode;
    }

    public void setCruiseLineCode(String cruiseLineCode) {
        this.cruiseLineCode = cruiseLineCode;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
