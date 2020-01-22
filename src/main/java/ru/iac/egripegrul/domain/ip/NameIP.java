package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ipname")
@Getter
@Setter
public class NameIP {

    @Id
    @Column(name = "idipname")
    private String id;

    @Column(name = "famfl")
    private String surname;
    @Column(name = "namefl")
    private String name;
    @Column(name = "otchfl")
    private String middleName;

    @Column(name = "dtstart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dtStart;

    @Column(name = "sex")
    private Integer sex;

    @OneToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;

}
