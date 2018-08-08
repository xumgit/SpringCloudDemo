package com.spc.microserviceclientfeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignService {
    @Override
    public String sayFromClientOne(String name) {
        return "hi," + name + ",sorry,something error";
    }
}
