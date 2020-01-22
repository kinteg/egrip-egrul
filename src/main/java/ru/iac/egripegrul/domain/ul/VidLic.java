package ru.iac.egripegrul.domain.ul;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import ru.iac.egripegrul.domain.sp.TypeLicense;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "vidlic")
@Getter
public class VidLic implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "idlic")
    @JsonBackReference
    @MapsId
    private Licenz lic;

    @OneToOne
    @JoinColumn(name = "idvidlic")
    private TypeLicense vidLic;

}
