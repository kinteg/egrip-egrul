package ru.iac.egripegrul.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.iac.egripegrul.domain.filter.UlFilter;
import ru.iac.egripegrul.domain.ul.UL;

public interface UlService extends IPULService<UL> {

    Page<UL> findByFilter(UlFilter filter, Pageable pageable);

    

}
