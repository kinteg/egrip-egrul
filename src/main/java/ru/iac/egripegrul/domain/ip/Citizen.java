package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.OKSM;
import ru.iac.egripegrul.domain.sp.VidCitizen;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ipcitizen")
@Getter
public class Citizen {

    @Id
    @Column(name = "idipcitizen")
    private String id;

    @Column(name = "dtstart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtStart;

    @OneToOne
    @JoinColumn(name = "oksm")
    private OKSM oksm;

    @OneToOne
    @JoinColumn(name = "idvidcitizen")
    private VidCitizen vidCitizen;

    @OneToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;

}
