package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.RegOrg;
import ru.iac.egripegrul.domain.sp.VidReg;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ipgosreg")
@Getter
public class GosRegIP {

    @Id
    @Column(name = "idreg")
    private String id;

    @Column(name = "regnum")
    private String regNum;

    @Column(name = "dtreg")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtReg;

    @Column(name = "dtzap")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtZap;

    @Column(name = "numsvid")
    private String numsVid;

    @Column(name = "sersvid")
    private String serSvid;

    @OneToOne
    @JoinColumn(name = "idregorg")
    private RegOrg regOrg;

    @OneToOne
    @JoinColumn(name = "idvidreg")
    private VidReg vidReg;

    @ManyToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;

}
