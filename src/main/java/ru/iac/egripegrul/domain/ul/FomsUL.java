package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.FOMS;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 	Сведения о регистрации ИП в отделениях ФОМС
 */
@Getter
@Table(name = "ulfoms")
@Entity
public class FomsUL {

    @Id
    @Column(name = "idulfoms")
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtend")
    private LocalDate dtEnd;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtstart")
    private LocalDate dtStart;

    @Column(name = "regnom_foms")
    private String regNom;

    @OneToOne
    @JoinColumn(name = "idfoms")
    private FOMS foms;

    @OneToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
