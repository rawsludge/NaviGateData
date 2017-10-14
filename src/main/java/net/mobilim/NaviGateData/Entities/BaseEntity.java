package net.mobilim.NaviGateData.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @JsonIgnore
    @Column(name = "INSERT_DATE")
    private Date insertDate;

    @JsonIgnore
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    public BaseEntity() {
        this.insertDate = new Date();
        this.lastUpdateDate = new Date();
    }

    public int getId() {
        return id;
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
