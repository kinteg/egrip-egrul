package ru.iac.egripegrul.domain.sp;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spvidlic")
@Getter
public class TypeLicense {

    @Id
    @Column(name = "idvidlic")
    private Integer id;

    @Column(name = "name")
    private String name;

}
