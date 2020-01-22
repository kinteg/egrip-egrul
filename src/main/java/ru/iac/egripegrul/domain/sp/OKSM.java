package ru.iac.egripegrul.domain.sp;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import ru.iac.egripegrul.domain.view.Views;

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
    @JsonView(Views.MainPage.class)
    private String name;

}
