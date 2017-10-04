package net.mobilim.NaviGateData.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DESTINATION")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "INSERT_DATE")
    private Date insertDate;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    public Destination() {
        this.insertDate = new Date();
        this.lastUpdateDate = new Date();
    }

    public Destination(String code, String name) {
        this();
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
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
