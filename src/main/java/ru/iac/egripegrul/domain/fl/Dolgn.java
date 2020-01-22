package ru.iac.egripegrul.domain.fl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.ul.UL;

import javax.persistence.*;

@Entity
@Table(name = "fldolgn")
@Getter
public class Dolgn {

    @Id
    @Column(name = "idfldolgn")
    private Integer id;

    @Column(name = "dolgn")
    private String dolgn;

    @OneToOne
    @JoinColumn(name = "idfl")
    private FullName fullName;

    @ManyToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
