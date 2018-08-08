package com.spc.microserviceclientone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientone")
public class ClientOneController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value="/one")
    public String one(@RequestParam(required = false, defaultValue = "ClientOneTest")String name) {
        return "client one, hi," + name + ",port:" + port;
    }

}
