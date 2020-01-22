package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.PensionFund;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Сведения о регистрации ИП в отделениях ПФ
 */
@Entity
@Table(name = "ulpf")
@Getter
public class PFUL {

    @Id
    @Column(name = "idulpf")
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtend")
    private LocalDate dtEnd;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtstart")
    private LocalDate dtStart;

    @Column(name = "regnom_pf")
    private String regNom;

    @OneToOne
    @JoinColumn(name = "idpf")
    private PensionFund pf;

    @OneToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;
}
