package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import ru.iac.egripegrul.domain.view.Views;

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
    @JsonView(Views.MainPage.class)
    private String surname;
    @Column(name = "namefl")
    @JsonView(Views.MainPage.class)
    private String name;
    @Column(name = "otchfl")
    @JsonView(Views.MainPage.class)
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
