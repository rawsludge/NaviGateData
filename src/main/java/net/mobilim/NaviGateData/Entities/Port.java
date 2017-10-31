package net.mobilim.NaviGateData.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "PORT")
public class Port extends BaseEntity {

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "ARRIVE_TIME")
    @JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Date arrive;

    @Column(name = "BOARDING_TIME")
    @JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Date boarding;

    @Column(name = "DEPART_TIME")
    @JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Date depart;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ITINERARY_ID")
    private Itinerary itinerary;

    public Port() {
        super();
    }

    public Port(String code, String name) {
        this();
        this.code = code;
        this.name = name;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getArrive() {
        return arrive;
    }

    public void setArrive(Date arrive) {
        this.arrive = arrive;
    }

    public Date getBoarding() {
        return boarding;
    }

    public void setBoarding(Date boarding) {
        this.boarding = boarding;
    }

    public Date getDepart() {
        return depart;
    }

    public void setDepart(Date depart) {
        this.depart = depart;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
}
