package ru.iac.egripegrul.domain.sp;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spopf")
@Getter
public class OPF {

    @Id
    @Column(name = "idopf")
    private Integer id;

    @Column(name = "name")
    private String name;

}
