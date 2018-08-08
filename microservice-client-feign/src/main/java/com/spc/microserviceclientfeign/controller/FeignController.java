package com.spc.microserviceclientfeign.controller;

import com.spc.microserviceclientfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/feign")
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value="/sayfeign")
    public String sayFeign(@RequestParam(required = false, defaultValue = "feignTest")String name) {
        return this.feignService.sayFromClientOne(name);
    }

}
