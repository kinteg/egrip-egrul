package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.Lang;
import ru.iac.egripegrul.domain.sp.OPF;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ulname")
@Getter
public class NameUL {

    @Id
    @Column(name = "idulname")
    private Integer id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtstart")
    private LocalDate dtStart;

    @Column(name = "namei")
    private String engName;
    @Column(name = "namep")
    private String fullName;
    @Column(name = "names")
    private String name;

    @OneToOne
    @JoinColumn(name = "idlangi")
    private Lang lang;

    @OneToOne
    @JoinColumn(name = "idopf")
    private OPF opf;

    @OneToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;


}
