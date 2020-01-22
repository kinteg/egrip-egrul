package ru.iac.egripegrul.domain.ip;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.OKVED;

import javax.persistence.*;

@Entity
@Table(name = "ipokved")
@Getter
public class Okved {

    @Id
    @Column(name = "idipokved")
    private Integer id;

    @Column(name = "main")
    private Integer main;

    @OneToOne
    @JoinColumn(name = "idokved")
    private OKVED okved;

    @ManyToOne
    @JoinColumn(name = "idip")
    @JsonIgnore
    private IP ip;

}
