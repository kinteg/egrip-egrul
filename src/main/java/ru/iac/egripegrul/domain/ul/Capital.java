package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.VidCap;

import javax.persistence.*;

@Entity
@Table(name = "ulcapital")
@Getter
public class Capital {

    @Id
    @Column(name = "idulcapital")
    private Integer id;

    @Column(name = "summa")
    private Long summa;

    @OneToOne
    @JoinColumn(name = "idvidcap")
    private VidCap vidCap;

    @OneToOne
    @JoinColumn(name = "idul")
    @JsonIgnore
    private UL ul;

}
