package ru.iac.egripegrul.domain.sp;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spfoms")
@Getter
public class FOMS {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

}
