package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.RegOrg;
import ru.iac.egripegrul.domain.sp.Stat;
import ru.iac.egripegrul.domain.view.Views;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ip")
@Getter
public class IP {

    @Id
    @Column(name = "idip")
    @JsonView(Views.MainPage.class)
    private String id;

    @Column(name = "inn")
    @JsonView(Views.MainPage.class)
    private String inn;
    @Column(name = "ogrn")
    @JsonView(Views.MainPage.class)
    private String ogrn;

    @OneToOne(mappedBy = "ip")
    @JsonView(Views.MainPage.class)
    private NameIP name;

    @OneToOne
    @JoinColumn(name = "idstatus")
    @JsonView(Views.MainPage.class)
    private Stat status;

    @OneToOne
    @JoinColumn(name = "idregorg")
    private RegOrg regOrg;

    @OneToOne(mappedBy = "ip")
    @JsonManagedReference
    @JsonView(Views.MainPage.class)
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