package ru.iac.egripegrul.domain.sp;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oksm")
@Getter
public class OKSM {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "kod_oksm")
    private String kodOKSM;

    @Column(name = "name")
    private String name;

}
