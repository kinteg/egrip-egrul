package ru.iac.egripegrul.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.iac.egripegrul.domain.ip.IP;

import java.time.LocalDate;

public interface IPRepo extends JpaRepository<IP, String> {

    Page<IP> findAll(Pageable pageable);

    Page<IP> findByNameMiddleNameContainingIgnoreCaseAndNameNameContainingIgnoreCaseAndNameSurnameContainingIgnoreCaseAndNameSexBetweenAndOgrnContainingIgnoreCaseAndInnContainingIgnoreCaseAndCitizenDtStartBetween
            (
                    String middleName,
                    String name,
                    String surname,
                    Integer startSex,
                    Integer endSex,
                    String orgn,
                    String inn,
                    LocalDate dtStart,
                    LocalDate dtEnd,
                    Pageable pageable);



}
