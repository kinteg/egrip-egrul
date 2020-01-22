package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.LicOrg;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "licenz")
@Getter
public class Licenz {

    @Id
    @Column(name = "idlic")
    private Integer id;

    @Column(name = "numlic")
    private String num;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtstart")
    private LocalDate dtStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtend")
    private LocalDate dtEnd;

    @OneToOne
    @JoinColumn(name = "idlicorg")
    private LicOrg licOrg;

    @OneToOne(mappedBy = "lic")
    @JsonManagedReference
    private VidLic vidLic;

    @ManyToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
