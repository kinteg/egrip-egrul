package ru.iac.egripegrul.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.iac.egripegrul.domain.filter.UlFilter;
import ru.iac.egripegrul.domain.ul.UL;
import ru.iac.egripegrul.repo.ULRepo;
import ru.iac.egripegrul.service.UlService;

@Service
public class ULServiceJPA implements UlService {

    private final ULRepo repo;

    public ULServiceJPA(ULRepo repo) {
        this.repo = repo;
    }

    @Override
    public Page<UL> getAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public Page<UL> findByFilter(UlFilter filter, Pageable pageable) {
        return repo.findByDtregstartBetweenAndNameFullNameContainingIgnoreCaseAndOgrnContainingIgnoreCaseAndInnContainingIgnoreCase
                (
                        filter.getRegStart(),
                        filter.getRegEnd(),
                        filter.getName(),
                        filter.getOgrn(),
                        filter.getInn(),
                        pageable
                );
    }
}
