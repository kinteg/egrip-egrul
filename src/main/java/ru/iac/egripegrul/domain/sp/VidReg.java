package ru.iac.egripegrul.domain.sp;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spvidreg")
@Getter
public class VidReg {

    @Id
    @Column(name = "idvidreg")
    private Integer id;

    @Column(name = "name")
    private String name;

}
