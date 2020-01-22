package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.MNS;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ipmns")
@Getter
public class MnsIP {

    @Id
    @Column(name = "idipmns")
    private String id;

    @Column(name = "dtend")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtEnd;

    @Column(name = "dtstart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtStart;

    @OneToOne
    @JoinColumn(name = "idmns")
    private MNS mns;

    @OneToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;


}
