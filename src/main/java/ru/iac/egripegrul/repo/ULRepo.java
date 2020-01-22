package ru.iac.egripegrul.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.iac.egripegrul.domain.ul.UL;

import java.time.LocalDate;

public interface ULRepo extends JpaRepository<UL, String> {

    Page<UL> findAll(Pageable pageable);

    Page<UL> findByDtregstartBetweenAndNameFullNameContainingIgnoreCaseAndOgrnContainingIgnoreCaseAndInnContainingIgnoreCase
            (
                    LocalDate dtStart,
                    LocalDate dtEnd,
                    String fullName,
                    String ogrn,
                    String inn,
                    Pageable pageable
            );

}
