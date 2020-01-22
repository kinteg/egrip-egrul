package ru.iac.egripegrul.domain.filter;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IpFilter {

    String surname;
    String name;
    String middleName;
    Integer sex;
    String ogrn;
    String inn;
    LocalDate regStart;
    LocalDate regEnd;

    public IpFilter(String surname, String name, String middleName, Integer sex, String ogrn, String inn, String regStart, String regEnd) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.sex = sex;
        this.ogrn = ogrn;
        this.inn = inn;
        this.regStart = regStart.equals("") || regStart.equals("null") ? LocalDate.of(1970, 1, 1) : LocalDate.parse(regStart);
        this.regEnd = regEnd.equals("") || regEnd.equals("null") ? LocalDate.of(2070, 1, 1) : LocalDate.parse(regEnd);
    }
}
