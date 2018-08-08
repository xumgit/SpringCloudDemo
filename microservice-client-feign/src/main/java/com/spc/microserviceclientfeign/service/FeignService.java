package com.spc.microserviceclientfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "MICROSERVICE-CLIENT-ONE", fallback = SchedualServiceHiHystric.class)
public interface FeignService {

    @RequestMapping(value = "/clientone/one", method = RequestMethod.GET)
    String sayFromClientOne(@RequestParam(value = "name", required = false) String name);

}
