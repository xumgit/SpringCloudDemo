package com.spc.microserviceclientzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClientZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceClientZuulApplication.class, args);
    }
}

/*
* http://localhost:8774/api-a/ribbon/ri?name=xum&token=23
* http://localhost:8774/api-b/feign/sayfeign?name=xum&token=23
* */