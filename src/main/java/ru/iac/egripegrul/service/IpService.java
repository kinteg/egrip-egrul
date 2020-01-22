package ru.iac.egripegrul.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.iac.egripegrul.domain.filter.IpFilter;
import ru.iac.egripegrul.domain.ip.IP;

public interface IpService extends IPULService<IP> {

    Page<IP> findByFilter(IpFilter filter, Pageable pageable);

}
