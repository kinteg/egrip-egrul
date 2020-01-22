package ru.iac.egripegrul.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import ru.iac.egripegrul.domain.filter.UlFilter;
import ru.iac.egripegrul.domain.ul.UL;
import ru.iac.egripegrul.service.UlService;

@RestController
@RequestMapping("api/egrul")
public class EgrulController {

    private final UlService ulService;

    public EgrulController(@Qualifier("ULServiceJPA") UlService ulService) {
        this.ulService = ulService;
    }

    @GetMapping
    @ResponseBody
    public Page<UL> getAll(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable) {
        return ulService.getAll(pageable);
    }

    @GetMapping("{id}")
    public UL getIpById(@PathVariable("id") UL ul) {
        return ul;
    }

    @GetMapping("/filter")
    public Page<UL> getFromFilter(
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "") String ogrn,
            @RequestParam(defaultValue = "") String inn,
            @RequestParam(defaultValue = "") String regStart,
            @RequestParam(defaultValue = "") String regEnd,
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable
    ) {

        UlFilter filter = new UlFilter
                (
                        name,
                        ogrn,
                        inn,
                        regStart,
                        regEnd
                );

        return ulService.findByFilter(filter, pageable);
    }

}
