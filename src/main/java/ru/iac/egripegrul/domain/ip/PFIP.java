package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.PensionFund;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ippf")
@Getter
public class PFIP {

    @Id
    @Column(name = "idippf")
    private String idIPPF;

    @Column(name = "dtend")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtEnd;

    @Column(name = "dtstart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtStart;

    @Column(name = "regnom_pf")
    private String regNom;

    @OneToOne
    @JoinColumn(name = "idpf")
    private PensionFund pf;

    @OneToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;

}
