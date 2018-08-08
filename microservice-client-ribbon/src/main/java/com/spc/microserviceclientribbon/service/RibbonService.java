package com.spc.microserviceclientribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "ribbonError")
    public String ribbon(String name) {
        return restTemplate.getForObject("http://MICROSERVICE-CLIENT-ONE/clientone/one?name="+name, String.class);
    }

    public String ribbonError(String name) {
        return "hi," + name + ",something error";
    }

}
