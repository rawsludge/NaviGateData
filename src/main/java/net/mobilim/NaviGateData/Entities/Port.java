package net.mobilim.NaviGateData.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PORT")
public class Port extends BaseEntity {

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

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
}
