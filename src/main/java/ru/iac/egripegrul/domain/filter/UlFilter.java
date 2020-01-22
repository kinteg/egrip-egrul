package ru.iac.egripegrul.domain.filter;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UlFilter {

    String name;
    String ogrn;
    String inn;
    LocalDate regStart;
    LocalDate regEnd;

    public UlFilter(String name, String ogrn, String inn, String regStart, String regEnd) {
        this.name = name;
        this.ogrn = ogrn;
        this.inn = inn;
        this.regStart = regStart.equals("") ? LocalDate.of(1970, 1, 1) : LocalDate.parse(regStart);
        this.regEnd = regEnd.equals("") ? LocalDate.of(2070, 1, 1) : LocalDate.parse(regEnd);
    }
}
