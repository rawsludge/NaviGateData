package net.mobilim.NaviGateData.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DESTINATION")
public class Destination extends BaseEntity {

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    public Destination() {
        super();
    }

    public Destination(String code, String name) {
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
}
