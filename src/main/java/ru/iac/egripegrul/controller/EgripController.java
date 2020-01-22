package ru.iac.egripegrul.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import ru.iac.egripegrul.domain.filter.IpFilter;
import ru.iac.egripegrul.domain.ip.IP;
import ru.iac.egripegrul.service.impl.IPServiceJPA;

@RestController
@RequestMapping("api/egrip")
public class EgripController {

    private final IPServiceJPA ipService;


    public EgripController(IPServiceJPA ipService) {
        this.ipService = ipService;
    }

    @GetMapping
    public Page<IP> getAll(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable) {
        return ipService.getAll(pageable);
    }

    @GetMapping("{id}")
    public IP getIpById(@PathVariable("id") IP ip) {
        return ip;
    }

    @GetMapping("/filter")
    public Page<IP> getFromFilter(
            @RequestParam(defaultValue = "") String middleName,
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "") String surname,
            @RequestParam(defaultValue = "0") Integer sex,
            @RequestParam(defaultValue = "") String ogrn,
            @RequestParam(defaultValue = "") String inn,
            @RequestParam(defaultValue = "") String regStart,
            @RequestParam(defaultValue = "") String regEnd,
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable
    ) {
        IpFilter filter = new IpFilter
                (
                        surname,
                        name,
                        middleName,
                        sex,
                        ogrn,
                        inn,
                        regStart,
                        regEnd
                );

        return ipService.findByFilter(filter, pageable);
    }
}
