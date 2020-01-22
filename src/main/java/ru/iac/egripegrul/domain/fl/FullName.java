package ru.iac.egripegrul.domain.fl;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fl")
@Getter
public class FullName {

    @Id
    @Column(name = "idfl")
    private Integer id;

    @Column(name = "famfl")
    private String surname;
    @Column(name = "namefl")
    private String name;
    @Column(name = "otchfl")
    private String middleName;

}
