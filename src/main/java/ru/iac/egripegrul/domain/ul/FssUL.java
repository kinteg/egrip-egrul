package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.FSS;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Сведения о регистрации ИП в отделениях ФСС
 */
@Entity
@Table(name = "ulfss")
@Getter
public class FssUL {

    @Id
    @Column(name = "idulfss")
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtend")
    private LocalDate dtEnd;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtstart")
    private LocalDate dtStart;

    @Column(name = "regnom_fss")
    private String regNom;

    @OneToOne
    @JoinColumn(name = "idfss")
    private FSS fss;

    @OneToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
