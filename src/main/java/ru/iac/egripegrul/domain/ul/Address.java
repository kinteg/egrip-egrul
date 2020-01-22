package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "uladr")
@Getter
public class Address {

    @Id
    @Column(name = "iduladr")
    private Integer id;

    @Column(name = "address")
    private String address;
    @Column(name = "dtstart")
    private LocalDate dtStart;
    @Column(name = "fax")
    private String fax;
    @Column(name = "dom")
    private String dom;
    @Column(name = "indeks")
    private String index;
    @Column(name = "korp")
    private String korp;
    @Column(name = "kvart")
    private String kvart;
    @Column(name = "okato")
    private String okato;
    @Column(name = "kodgorod")
    private String kodGorod;
    @Column(name = "nameisporg")
    private String nameIsPorg;
    @Column(name = "telefon")
    private String telefon;

    @OneToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
