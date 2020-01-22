package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.FSS;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ipfss")
@Getter
public class FssIP {

    @Id
    @Column(name = "idipfss")
    private String id;

    @Column(name = "dtend")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtEnd;

    @Column(name = "dtstart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtStart;

    @Column(name = "regnom_fss")
    private String regNom;

    @OneToOne
    @JoinColumn(name = "idfss")
    private FSS fss;

    @OneToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;

}
