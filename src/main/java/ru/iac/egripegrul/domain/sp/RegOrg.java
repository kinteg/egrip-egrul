package ru.iac.egripegrul.domain.sp;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spregorg")
@Getter
public class RegOrg {

    @Id
    @Column(name = "idspro")
    private String id;

    @Column(name = "name")
    private String name;

}
