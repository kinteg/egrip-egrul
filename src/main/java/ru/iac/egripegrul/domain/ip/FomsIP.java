package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.FOMS;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ipfoms")
@Getter
public class FomsIP {

    @Id
    @Column(name = "idipfoms")
    private String id;

    @Column(name = "dtend")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtEnd;

    @Column(name = "dtstart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtStart;

    @Column(name = "regnom_foms")
    private String regNom;

    @OneToOne
    @JoinColumn(name = "idfoms")
    private FOMS foms;

    @OneToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;

}
