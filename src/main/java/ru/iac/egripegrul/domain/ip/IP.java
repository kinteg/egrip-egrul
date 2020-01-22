package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.RegOrg;
import ru.iac.egripegrul.domain.sp.Stat;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ip")
@Getter
public class IP {

    @Id
    @Column(name = "idip")
    private String id;

    @Column(name = "inn")
    private String inn;
    @Column(name = "ogrn")
    private String ogrn;

    @OneToOne(mappedBy = "ip")
    private NameIP name;

    @OneToOne
    @JoinColumn(name = "idstatus")
    private Stat status;

    @OneToOne
    @JoinColumn(name = "idregorg")
    private RegOrg regOrg;

    @OneToOne(mappedBy = "ip")
    @JsonManagedReference
    private Citizen citizen;

    @OneToOne(mappedBy = "ip")
    @JsonManagedReference
    private FomsIP foms;

    @OneToOne(mappedBy = "ip")
    @JsonManagedReference
    private FssIP fss;

    @OneToMany(mappedBy = "ip")
    @JsonManagedReference
    private List<GosRegIP> gosReg;

    @OneToOne(mappedBy = "ip")
    @JsonManagedReference
    private MnsIP mns;

    @OneToMany(mappedBy = "ip")
    private List<Okved> okved;

    @OneToOne(mappedBy = "ip")
    @JsonManagedReference
    private PFIP pf;

}