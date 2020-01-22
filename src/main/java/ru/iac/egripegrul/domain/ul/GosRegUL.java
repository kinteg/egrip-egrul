package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.RegOrg;
import ru.iac.egripegrul.domain.sp.VidReg;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "gosreg")
@Getter
public class GosRegUL {

    @Id
    @Column(name = "idreg")
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtreg")
    private LocalDate dtReg;

    @Column(name = "regnum")
    private String regNum;

    @OneToOne
    @JoinColumn(name = "idvidreg")
    private VidReg vidReg;

    @OneToOne
    @JoinColumn(name = "idregorg")
    private RegOrg regOrg;

    @ManyToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
