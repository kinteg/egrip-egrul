package ru.iac.egripegrul.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPULService<T> {

    Page<T> getAll(Pageable pageable);

}
