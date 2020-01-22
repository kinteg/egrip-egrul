package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.MNS;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Сведения о постановке на учет ИП в налоговом органе
 */
@Entity
@Table(name = "ulmns")
@Getter
public class MnsUL {

    @Id
    @Column(name = "idulmns")
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtend")
    private LocalDate dtEnd;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dtstart")
    private LocalDate dtStart;

    @OneToOne
    @JoinColumn(name = "idmns")
    private MNS mns;

    @OneToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
