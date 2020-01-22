package ru.iac.egripegrul.domain.sp;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "okved")
@Getter
public class OKVED {

    @Id
    @Column(name = "idokved")
    private Integer idOKVED;

    @Column(name = "code_okved")
    private String codeOKVED;

    @Column(name = "name")
    private String name;

}
