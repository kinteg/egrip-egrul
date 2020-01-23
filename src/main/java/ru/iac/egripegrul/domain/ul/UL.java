package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import ru.iac.egripegrul.domain.fl.Dolgn;
import ru.iac.egripegrul.domain.sp.RegOrg;
import ru.iac.egripegrul.domain.sp.StatUl;
import ru.iac.egripegrul.domain.sp.VidReg;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
public class UL {

    @Id
    @Column(name = "idul")
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtregstart;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtregend;

    private String inn;
    private String kpp;
    private String ogrn;

    @OneToOne
    @JoinColumn(name = "idstatus")
    private StatUl status;

    @OneToOne
    @JoinColumn(name = "idregorg")
    private RegOrg regorg;

    @OneToOne
    @JoinColumn(name = "idvidregstart")
    private VidReg vidreg;

    @OneToOne(mappedBy = "ul", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Address adr;

    @OneToOne(mappedBy = "ul", cascade = CascadeType.ALL)
    @JsonManagedReference
    private NameUL name;

    @OneToOne(mappedBy = "ul", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Capital capital;

    @OneToMany(mappedBy = "ul")
    private List<Dolgn> fl;

    @OneToMany(mappedBy = "ul")
    private List<Licenz> licenzs;

    @OneToMany(mappedBy = "ul")
    private List<GosRegUL> gosRegs;

    @OneToOne(mappedBy = "ul", cascade = CascadeType.ALL)
    @JsonManagedReference
    private MnsUL mns;

    @OneToOne(mappedBy = "ul", cascade = CascadeType.ALL)
    @JsonManagedReference
    private FomsUL foms;

    @OneToOne(mappedBy = "ul", cascade = CascadeType.ALL)
    @JsonManagedReference
    private FssUL fss;

    @OneToOne(mappedBy = "ul", cascade = CascadeType.ALL)
    @JsonManagedReference
    private PFUL pf;


}
