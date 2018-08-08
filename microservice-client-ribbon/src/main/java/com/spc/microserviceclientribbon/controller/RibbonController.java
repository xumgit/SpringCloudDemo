package com.spc.microserviceclientribbon.controller;

import com.spc.microserviceclientribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ribbon")
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @Value("${server.port}")
    String port;

    @RequestMapping(value="/ri")
    public String ribbon(@RequestParam(required = false, defaultValue = "ribbontest")String name) {
        return this.ribbonService.ribbon(name);
    }

}
