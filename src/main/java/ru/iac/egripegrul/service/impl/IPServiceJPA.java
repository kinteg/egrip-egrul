package ru.iac.egripegrul.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.iac.egripegrul.domain.filter.IpFilter;
import ru.iac.egripegrul.domain.ip.IP;
import ru.iac.egripegrul.repo.IPRepo;
import ru.iac.egripegrul.service.IpService;

@Service
public class IPServiceJPA implements IpService {

    private final IPRepo repo;

    public IPServiceJPA(IPRepo repo) {
        this.repo = repo;
    }

    @Override
    public Page<IP> getAll(Pageable pageable) {
        return repo.findAll(pageable);
    }


    @Override
    public Page<IP> findByFilter(IpFilter filter, Pageable pageable) {

        int start = filter.getSex() == 2 ? 2 : 1;
        int end = filter.getSex() == 1 ? 1 : 2;

        return repo.findByNameMiddleNameContainingIgnoreCaseAndNameNameContainingIgnoreCaseAndNameSurnameContainingIgnoreCaseAndNameSexBetweenAndOgrnContainingIgnoreCaseAndInnContainingIgnoreCaseAndCitizenDtStartBetween(
                filter.getMiddleName(),
                filter.getName(),
                filter.getSurname(),
                start,
                end,
                filter.getOgrn(),
                filter.getInn(),
                filter.getRegStart(),
                filter.getRegEnd(),
                pageable
        );
    }
}
